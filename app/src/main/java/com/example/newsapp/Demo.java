package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.newsapp.topheadlines.TopHeadlinesModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Demo extends AppCompatActivity {

    TopHeadlinesModel e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_500)));

        e = (TopHeadlinesModel) getIntent().getSerializableExtra("object");

        Picasso.with(getApplicationContext()).load(e.getUrltoimage()).into(((ImageView)findViewById(R.id.image)));
        ((TextView)findViewById(R.id.source)).setText("Source : "+e.getSource());
        ((TextView)findViewById(R.id.title)).setText(e.getTitle());
        ((TextView)findViewById(R.id.desc)).setText(e.getDesc());

        String fulnews=e.getUrl();
        TextView HyperLink;
        Spanned Text;
        HyperLink = (TextView)findViewById(R.id.fullnews);
        Text = Html.fromHtml("Tap  here  to  see  ->  " +
                "<a href='"+fulnews+"'>  Full  News</a>");
        HyperLink.setMovementMethod(LinkMovementMethod.getInstance());
        HyperLink.setText(Text);

        ((TextView)findViewById(R.id.content)).setText(e.getContent());



    }
}