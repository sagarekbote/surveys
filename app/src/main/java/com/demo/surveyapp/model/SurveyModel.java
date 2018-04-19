
package com.demo.surveyapp.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SurveyModel {

    @SerializedName("mId")
    @Expose
    private String mId;
    @SerializedName("mTitle")
    @Expose
    private String mTitle;
    @SerializedName("mDescription")
    @Expose
    private String mDescription;
    @SerializedName("access_code_prompt")
    @Expose
    private Object mAccessCodePrompt;
    @SerializedName("thank_email_above_threshold")
    @Expose
    private String mThankEmailAboveThreshold;
    @SerializedName("thank_email_below_threshold")
    @Expose
    private String mThankEmailBelowThreshold;
    @SerializedName("footer_content")
    @Expose
    private String mFooterContent;
    @SerializedName("is_active")
    @Expose
    private Boolean mIsActive;
    @SerializedName("cover_image_url")
    @Expose
    private String mCoverImageUrl;
    @SerializedName("cover_background_color")
    @Expose
    private Object mCoverBackgroundColor;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("created_at")
    @Expose
    private String mCreatedAt;
    @SerializedName("active_at")
    @Expose
    private String mActiveAt;
    @SerializedName("inactive_at")
    @Expose
    private Object mInactiveAt;
    @SerializedName("survey_version")
    @Expose
    private Integer mSurveyVersion;
    @SerializedName("short_url")
    @Expose
    private String mShortUrl;
    @SerializedName("language_list")
    @Expose
    private List<String> mLanguageList = null;
    @SerializedName("default_language")
    @Expose
    private String mDefaultLanguage;
    @SerializedName("tag_list")
    @Expose
    private String mTagList;
    @SerializedName("is_access_code_required")
    @Expose
    private Boolean mIsAccessCodeRequired;
    @SerializedName("is_access_code_valid_required")
    @Expose
    private Boolean mIsAccessCodeValidRequired;
    @SerializedName("access_code_validation")
    @Expose
    private String mAccessCodeValidation;
    @SerializedName("mTheme")
    @Expose
    private Theme mTheme;
    @SerializedName("mQuestions")
    @Expose
    private List<Question> mQuestions = null;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public Object getAccessCodePrompt() {
        return mAccessCodePrompt;
    }

    public void setAccessCodePrompt(Object accessCodePrompt) {
        this.mAccessCodePrompt = accessCodePrompt;
    }

    public String getThankEmailAboveThreshold() {
        return mThankEmailAboveThreshold;
    }

    public void setThankEmailAboveThreshold(String thankEmailAboveThreshold) {
        this.mThankEmailAboveThreshold = thankEmailAboveThreshold;
    }

    public String getThankEmailBelowThreshold() {
        return mThankEmailBelowThreshold;
    }

    public void setThankEmailBelowThreshold(String thankEmailBelowThreshold) {
        this.mThankEmailBelowThreshold = thankEmailBelowThreshold;
    }

    public String getFooterContent() {
        return mFooterContent;
    }

    public void setFooterContent(String footerContent) {
        this.mFooterContent = footerContent;
    }

    public Boolean getIsActive() {
        return mIsActive;
    }

    public void setIsActive(Boolean isActive) {
        this.mIsActive = isActive;
    }

    public String getCoverImageUrl() {
        return mCoverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.mCoverImageUrl = coverImageUrl;
    }

    public Object getCoverBackgroundColor() {
        return mCoverBackgroundColor;
    }

    public void setCoverBackgroundColor(Object coverBackgroundColor) {
        this.mCoverBackgroundColor = coverBackgroundColor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        this.mCreatedAt = createdAt;
    }

    public String getActiveAt() {
        return mActiveAt;
    }

    public void setActiveAt(String activeAt) {
        this.mActiveAt = activeAt;
    }

    public Object getInactiveAt() {
        return mInactiveAt;
    }

    public void setInactiveAt(Object inactiveAt) {
        this.mInactiveAt = inactiveAt;
    }

    public Integer getSurveyVersion() {
        return mSurveyVersion;
    }

    public void setSurveyVersion(Integer surveyVersion) {
        this.mSurveyVersion = surveyVersion;
    }

    public String getShortUrl() {
        return mShortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.mShortUrl = shortUrl;
    }

    public List<String> getLanguageList() {
        return mLanguageList;
    }

    public void setLanguageList(List<String> languageList) {
        this.mLanguageList = languageList;
    }

    public String getDefaultLanguage() {
        return mDefaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.mDefaultLanguage = defaultLanguage;
    }

    public String getTagList() {
        return mTagList;
    }

    public void setTagList(String tagList) {
        this.mTagList = tagList;
    }

    public Boolean getIsAccessCodeRequired() {
        return mIsAccessCodeRequired;
    }

    public void setIsAccessCodeRequired(Boolean isAccessCodeRequired) {
        this.mIsAccessCodeRequired = isAccessCodeRequired;
    }

    public Boolean getIsAccessCodeValidRequired() {
        return mIsAccessCodeValidRequired;
    }

    public void setIsAccessCodeValidRequired(Boolean isAccessCodeValidRequired) {
        this.mIsAccessCodeValidRequired = isAccessCodeValidRequired;
    }

    public String getAccessCodeValidation() {
        return mAccessCodeValidation;
    }

    public void setAccessCodeValidation(String accessCodeValidation) {
        this.mAccessCodeValidation = accessCodeValidation;
    }

    public Theme getTheme() {
        return mTheme;
    }

    public void setTheme(Theme theme) {
        this.mTheme = theme;
    }

    public List<Question> getQuestions() {
        return mQuestions;
    }

    public void setQuestions(List<Question> questions) {
        this.mQuestions = questions;
    }
}
