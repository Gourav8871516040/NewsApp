package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;
import com.example.newsapp.topheadlines.TopHeadlinesAdapter;
import com.example.newsapp.topheadlines.TopHeadlinesModel;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView topHeadlineRecyclerView;
    Call<JsonObject> call;
    int n=0;
    private List<TopHeadlinesModel> topHeadlinesModelList = new ArrayList<>();
    private TopHeadlinesAdapter topHeadlinesAdapter;
    private TopHeadlinesAdapter.RecyclerViewClickListener listener;
    ArrayAdapter country;
    String[] cntry={"Select Country","Argentina","Austria","Australia","Belgium","Brazil","Canada","Colombia","Cuba","Czechia","France","Great Britain","Germany","Hungary","Indonesia","Ireland","India","Italy","Lithuania","Morroco","Mexico","Malaysia","Nigeria","Netherlands","Norway","New Zeland","Philippines","Poland","Romania","Serbia","Saudi Arabia","Sweden","Singapore","Solvenia","Slovakia","Switerland","Turkey","USA","Venezuela","South Africa",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_500)));

        topHeadlineRecyclerView= findViewById(R.id.top_headlines_recyclerview);

        Spinner spinner=(Spinner) findViewById(R.id.spinner);
        spinner.setBackgroundColor(Color.WHITE);
        country = new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,cntry);
        country.setDropDownViewResource(R.layout.spinner_layout);
        spinner.setVisibility(View.VISIBLE);
        ((Spinner)findViewById(R.id.spinner)).setAdapter(country);
        ((Spinner)findViewById(R.id.spinner)).setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                n=position;

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ((Button)findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNews(n);
            }
        });

    }

public void showNews(int n){
if (isConnected()) {
    topHeadlineRecyclerView.setAdapter(null);
    if (n != 0) {
        Toast.makeText(getApplicationContext(), "Loading...", Toast.LENGTH_LONG).show();
        topHeadlineRecyclerView.setVisibility(View.INVISIBLE);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        topHeadlinesModelList.clear();
        Api api = retrofit.create(Api.class);
        if (n == 1)
            call = api.arfetchData(); // You can change it to change different URL
        else if (n == 2)
            call = api.atfetchData();
        else if (n == 3)
            call = api.aufetchData();
        else if (n == 4)
            call = api.befetchData();
        else if (n == 5)
            call = api.brfetchData();
        else if (n == 6)
            call = api.cafetchData();
        else if (n == 7)
            call = api.cofetchData();
        else if (n == 8)
            call = api.cufetchData();
        else if (n == 9)
            call = api.czfetchData();
        else if (n == 10)
            call = api.frfetchData();
        else if (n == 11)
            call = api.gbfetchData();
        else if (n == 12)
            call = api.defetchData();
        else if (n == 13)
            call = api.hufetchData();
        else if (n == 14)
            call = api.idfetchData();
        else if (n == 15)
            call = api.iefetchData();
        else if (n == 16)
            call = api.infetchData();
        else if (n == 17)
            call = api.itfetchData();
        else if (n == 18)
            call = api.ltfetchData();
        else if (n == 19)
            call = api.mafetchData();
        else if (n == 20)
            call = api.mxfetchData();
        else if (n == 21)
            call = api.myfetchData();
        else if (n == 22)
            call = api.ngfetchData();
        else if (n == 23)
            call = api.nlfetchData();
        else if (n == 24)
            call = api.nofetchData();
        else if (n == 25)
            call = api.nzfetchData();
        else if (n == 26)
            call = api.phfetchData();
        else if (n == 27)
            call = api.plfetchData();
        else if (n == 28)
            call = api.rofetchData();
        else if (n == 29)
            call = api.rsfetchData();
        else if (n == 30)
            call = api.safetchData();
        else if (n == 31)
            call = api.sefetchData();
        else if (n == 32)
            call = api.sgfetchData();
        else if (n == 33)
            call = api.sifetchData();
        else if (n == 34)
            call = api.skfetchData();
        else if (n == 35)
            call = api.chfetchData();
        else if (n == 36)
            call = api.trfetchData();
        else if (n == 37)
            call = api.usfetchData();
        else if (n == 38)
            call = api.vefetchData();
        else
            call = api.zafetchData();

        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                try {
                    assert response.body() != null;
                    JSONObject jsonObject = new JSONObject(response.body().toString());
                    JSONArray jsonArray = jsonObject.getJSONArray("articles");
                    int length = jsonArray.length();

                    for (int i = 0; i < length; i++) {
                        JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                        JSONObject s1 = jsonObject1.getJSONObject("source");
                        String source = s1.getString("name");

                        String title = jsonObject1.getString("title");

                        String desp = jsonObject1.getString("description");

                        String author = jsonObject1.getString("author");
                        String url = jsonObject1.getString("url");
                        String urltoimage = jsonObject1.getString("urlToImage");
                        String content = jsonObject1.getString("content");


                        topHeadlinesModelList.add(new TopHeadlinesModel(title, desp, source, author, url, urltoimage, content));
                    }

                    //Recycler View PART
                    setOnClickListener();
                    topHeadlinesAdapter = new TopHeadlinesAdapter(topHeadlinesModelList, getApplicationContext(), listener);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
                    topHeadlineRecyclerView.setLayoutManager(linearLayoutManager);
                    topHeadlineRecyclerView.setAdapter(topHeadlinesAdapter);
                    topHeadlinesAdapter.notifyDataSetChanged();
                    //Toast.makeText(getApplicationContext(), "News From " + cntry[n], Toast.LENGTH_SHORT).show();

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
        topHeadlineRecyclerView.setVisibility(View.VISIBLE);
    } else Toast.makeText(MainActivity.this, "Select a Country", Toast.LENGTH_SHORT).show();
}else Toast.makeText(getApplicationContext(), "No Internet Connection.!!", Toast.LENGTH_SHORT).show();
}
    private void setOnClickListener(){
        listener=new TopHeadlinesAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent i=new Intent(MainActivity.this,Demo.class);
                TopHeadlinesModel e =new TopHeadlinesModel();
                e.setTitle(topHeadlinesModelList.get(position).getTitle());
                e.setDesc(topHeadlinesModelList.get(position).getDesc());
                e.setSource(topHeadlinesModelList.get(position).getSource());
                e.setAuthor(topHeadlinesModelList.get(position).getAuthor());
                e.setUrl(topHeadlinesModelList.get(position).getUrl());
                e.setUrltoimage(topHeadlinesModelList.get(position).getUrltoimage());
                e.setContent(topHeadlinesModelList.get(position).getContent());
                i.putExtra("object", (Serializable) e);
                startActivity(i);
            }
        };

    }

   /*private void fetchData() {
        StringRequest request = new StringRequest(Request.Method.GET, topheadlinesURL+"&pageSize="+per_page,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);

                            JSONArray jsonArray = jsonObject.getJSONArray("articles");
                            int length = jsonArray.length();

                            for (int i = 0; i < length; i++) {

                                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                                JSONObject s1 = jsonObject1.getJSONObject("source");
                                String source = s1.getString("name");


                                String title = jsonObject1.getString("title");

                                String desp = jsonObject1.getString("description");

                                topHeadlinesModelList.add(new TopHeadlinesModel(title, desp, source));
                            }
                            topHeadlinesAdapter.notifyDataSetChanged();

                        } catch (JSONException e) {
                            System.out.println(e.toString());
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error.toString());
                Toast.makeText(MainActivity.this, "Data Not Found !!!", Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {

                Map<String,String> map=new HashMap<>();
                map.put("key",apiKey);
                return map;
            }

            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map params = new HashMap();
                params.put("name", "Gourav");
                params.put("email", "gouravshrinivas0@gmail.com");
                params.put("password", "Gourav1799@");

                return params;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);

    }*/

    /*private void fetchData() {
        StringRequest request = new StringRequest(Request.Method.GET, topheadlinesURL+"&per_page"+per_page,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);

                            JSONArray jsonArray = jsonObject.getJSONArray("articles");
                            int length = jsonArray.length();

                            for (int i = 0; i < length; i++) {

                                JSONObject jsonObject1 = jsonArray.getJSONObject(i);

                                JSONObject s1 = jsonObject1.getJSONObject("source");
                                String source = s1.getString("name");


                                String title = jsonObject1.getString("title");

                                String desp = jsonObject1.getString("description");

                                topHeadlinesModelList.add(new TopHeadlinesModel(title, desp, source));
                            }
                            topHeadlinesAdapter.notifyDataSetChanged();


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println(error.toString());
                Toast.makeText(MainActivity.this, "Data Not Found !!!", Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);

    }*/


    public boolean isConnected()
    {

        ConnectivityManager c=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo n = c.getActiveNetworkInfo();
        return n!=null && n.isConnected();

    }


    //******************************* CODE TO ADD HYPERLINK IN ACTIVITY ***************************************

    /*       TextView HyperLink;
        Spanned Text;
        HyperLink = (TextView)findViewById(R.id.textViewlink);

        Text = Html.fromHtml("Click on this link to visit my Website <br />" +
                "<a href='https://www.android-examples.com//'>Android-Examples.com</a>");

        HyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink.setText(Text);

        */
}