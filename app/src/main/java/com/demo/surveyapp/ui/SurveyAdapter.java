package com.demo.surveyapp.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.demo.surveyapp.model.SurveyModel;

import java.util.List;

public class SurveyAdapter extends FragmentPagerAdapter {

    private List<SurveyModel> mSurveyList;

    public SurveyAdapter(FragmentManager fm, List<SurveyModel> surveyList) {
        super(fm);
        mSurveyList = surveyList;
    }

    @Override
    public Fragment getItem(int position) {
        return SurveyItemFragment.newInstance(mSurveyList.get(position));
    }

    @Override
    public int getCount() {
        return mSurveyList.size();
    }
}
