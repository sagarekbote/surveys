package com.demo.surveyapp.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.demo.surveyapp.model.SurveyDataRepository;
import com.demo.surveyapp.model.SurveyModel;

import java.util.List;

public class SurveyViewModel extends AndroidViewModel {

    private SurveyDataRepository mSurveyDataRepository;
    private LiveData<List<SurveyModel>> mSurveyList;

    public SurveyViewModel(@NonNull Application application) {
        super(application);
        mSurveyDataRepository = new SurveyDataRepository(application);
    }

    public LiveData<List<SurveyModel>> getSurveyList() {
        if (mSurveyList == null) {
            mSurveyList = mSurveyDataRepository.getSurveyList();
        }
        return mSurveyList;
    }

    public void resetSurveyList() {
        mSurveyList = null;
    }
}
