package com.example.newsapp;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL="https://newsapi.org/v2/";

    @GET("top-headlines?country=ar&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> arfetchData();

    @GET("top-headlines?country=at&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> atfetchData();

    @GET("top-headlines?country=au&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> aufetchData();

    @GET("top-headlines?country=be&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> befetchData();

    @GET("top-headlines?country=br&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> brfetchData();

    @GET("top-headlines?country=ca&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> cafetchData();

    @GET("top-headlines?country=co&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> cofetchData();

    @GET("top-headlines?country=cu&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> cufetchData();

    @GET("top-headlines?country=cz&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> czfetchData();

    @GET("top-headlines?country=fr&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> frfetchData();

    @GET("top-headlines?country=gb&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> gbfetchData();

    @GET("top-headlines?country=hu&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> hufetchData();

    @GET("top-headlines?country=id&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> idfetchData();

    @GET("top-headlines?country=ie&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> iefetchData();

    @GET("top-headlines?country=in&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> infetchData();

    @GET("top-headlines?country=it&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> itfetchData();

    @GET("top-headlines?country=lt&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> ltfetchData();

    @GET("top-headlines?country=ma&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> mafetchData();

    @GET("top-headlines?country=mx&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> mxfetchData();

    @GET("top-headlines?country=my&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> myfetchData();

    @GET("top-headlines?country=ng&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> ngfetchData();

    @GET("top-headlines?country=nl&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> nlfetchData();

    @GET("top-headlines?country=no&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> nofetchData();

    @GET("top-headlines?country=nz&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> nzfetchData();

    @GET("top-headlines?country=ph&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> phfetchData();

    @GET("top-headlines?country=pl&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> plfetchData();

    @GET("top-headlines?country=ro&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> rofetchData();

    @GET("top-headlines?country=rs&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> rsfetchData();

    @GET("top-headlines?country=sa&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> safetchData();

    @GET("top-headlines?country=se&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> sefetchData();

    @GET("top-headlines?country=sg&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> sgfetchData();

    @GET("top-headlines?country=si&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> sifetchData();

    @GET("top-headlines?country=sk&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> skfetchData();

    @GET("top-headlines?country=tr&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> trfetchData();

    @GET("top-headlines?country=us&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> usfetchData();

    @GET("top-headlines?country=ve&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> vefetchData();

    @GET("top-headlines?country=za&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> zafetchData();

    @GET("top-headlines?country=de&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> defetchData();

    @GET("top-headlines?country=ch&apiKey=7c298cbcbfcf4d388c20cd4623f5d456")
    Call<JsonObject> chfetchData();

}
