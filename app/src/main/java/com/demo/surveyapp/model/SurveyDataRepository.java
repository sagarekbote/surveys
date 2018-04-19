package com.demo.surveyapp.model;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SurveyDataRepository {

    private SurveyAPI.SurveyService mSurveyService;

    public SurveyDataRepository(Application application) {

        mSurveyService = SurveyAPI.getSurveyService();
    }

    public LiveData<List<SurveyModel>> getSurveyList() {
        final MutableLiveData<List<SurveyModel>> mSurveyList = new MutableLiveData<>();
        mSurveyService.getSurveyList(SurveyAPI.ACCESS_TOKEN).enqueue(new Callback<List<SurveyModel>>() {
            @Override
            public void onResponse(Call<List<SurveyModel>> call, Response<List<SurveyModel>> response) {
                mSurveyList.setValue(response.body());
            }
            @Override
            public void onFailure(Call<List<SurveyModel>> call, Throwable t) {
                mSurveyList.setValue(null);
            }
        });
        return mSurveyList;
    }
}
