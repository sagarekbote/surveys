package com.demo.surveyapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.demo.surveyapp.R;
import com.demo.surveyapp.model.SurveyModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SurveyItemFragment extends Fragment {

    private static final String ARG_SURVEY_TITLE = "survey_title";
    private static final String ARG_SURVEY_DESCRIPTION = "survey_description";
    private static final String ARG_COVER_IMAGE_URL = "survey_cover_image_url";
    @BindView(R.id.survey_title)
    TextView mTitleTextView;
    @BindView(R.id.survey_description)
    TextView mDescriptionTextView;
    @BindView(R.id.survey_imageview)
    ImageView mCoverImageView;
    @BindView(R.id.take_survey_button)
    Button mTakeSurveyButton;

    public SurveyItemFragment() {
    }

    public static SurveyItemFragment newInstance(SurveyModel surveyModel) {

        SurveyItemFragment fragment = new SurveyItemFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SURVEY_TITLE, surveyModel.getTitle());
        args.putString(ARG_SURVEY_DESCRIPTION, surveyModel.getDescription());
        args.putString(ARG_COVER_IMAGE_URL, surveyModel.getCoverImageUrl());
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_survey_item, container, false);
        ButterKnife.bind(this, rootView);
        Glide.with(this)
                .load(getArguments().getString(ARG_COVER_IMAGE_URL) + "l")
                .apply(new RequestOptions()
                        .error(R.mipmap.ic_launcher)
                        .fitCenter())
                .into(mCoverImageView);
        mTitleTextView.setText(getArguments().getString(ARG_SURVEY_TITLE));
        mDescriptionTextView.setText(getArguments().getString(ARG_SURVEY_DESCRIPTION));
        return rootView;
    }

    @OnClick(R.id.take_survey_button)
    public void onSurveyButtonClicked() {
        startActivity(new Intent(getContext(), TakeSurveyActivity.class));
    }
}
