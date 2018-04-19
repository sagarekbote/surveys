package com.demo.surveyapp.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.demo.surveyapp.R;
import com.demo.surveyapp.model.SurveyModel;
import com.demo.surveyapp.viewmodel.SurveyViewModel;
import com.rd.PageIndicatorView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SurveyActivity extends AppCompatActivity {

    private SurveyAdapter mSectionsPagerAdapter;
    @BindView(R.id.container_layout) View mContainerLayout;
    @BindView(R.id.viewpager) ViewPager mViewPager;
    @BindView(R.id.pageIndicatorView)
    PageIndicatorView mPageIndicatorView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;
    @BindView(R.id.toolbar) Toolbar mToolbar;
    @BindView(R.id.info_text_view) TextView mInfoTextView;
    private SurveyViewModel mSurveyViewModel;
    @BindView(R.id.settings_imagebutton)
    ImageButton mSettingsImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);
        ButterKnife.bind(this);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        init();
    }


    private void init() {
        mContainerLayout.setVisibility(View.GONE);
        mInfoTextView.setVisibility(View.GONE);
        mProgressBar.setVisibility(View.VISIBLE);
        mSurveyViewModel = ViewModelProviders.of(this).get(SurveyViewModel.class);
        mSurveyViewModel.getSurveyList().observe(this, new Observer<List<SurveyModel>>() {
            @Override
            public void onChanged(@Nullable List<SurveyModel> surveyModels) {

                mProgressBar.setVisibility(View.GONE);
                if(surveyModels != null) {
                    if(surveyModels.size() > 0) {
                        mSectionsPagerAdapter = new SurveyAdapter(getSupportFragmentManager(), surveyModels);
                        mViewPager.setAdapter(mSectionsPagerAdapter);
                        mPageIndicatorView.setCount(surveyModels.size());
                        mViewPager.setOffscreenPageLimit(1);
                        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                            @Override
                            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {/*empty*/}

                            @Override
                            public void onPageSelected(int position) {
                                mPageIndicatorView.setSelection(position);
                            }

                            @Override
                            public void onPageScrollStateChanged(int state) {/*empty*/}
                        });
                        mContainerLayout.setVisibility(View.VISIBLE);
                    } else {
                        mInfoTextView.setText(getString(R.string.no_surveys_available));
                        mInfoTextView.setVisibility(View.VISIBLE);
                    }
                } else {
                    mInfoTextView.setText(getString(R.string.unable_to_get_surveys));
                    mInfoTextView.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    @OnClick(R.id.settings_imagebutton)
    public void onSurveyButtonClicked() {
        mSurveyViewModel.resetSurveyList();
        init();
    }
}
