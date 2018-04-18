package com.demo.surveyapp.model;

import android.arch.lifecycle.LiveData;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class SurveyAPI {

    public static final String BASE_URL = "https://nimbl3-survey-api.herokuapp.com";
    public static final String ACCESS_TOKEN = "d9584af77d8c0d6622e2b3c554ed520b2ae64ba0721e52daa12d6eaa5e5cdd93";
    private static SurveyService mSurveyAPI = null;

    public static synchronized SurveyService getSurveyService() {
        if (mSurveyAPI == null) {
            Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .client(createDefaultOKHttpClient())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            mSurveyAPI = retrofit.create(SurveyService.class);
        }
        return mSurveyAPI;
    }

    private static OkHttpClient createDefaultOKHttpClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient().newBuilder().addInterceptor(interceptor).build();
    }

    public interface SurveyService {

        @GET("/surveys.json")
        Call<List<SurveyModel>> getSurveyList(@Query("access_token") String accessToken);
    }
}
