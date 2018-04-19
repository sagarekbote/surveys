
package com.demo.surveyapp.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Question {

    @SerializedName("mId")
    @Expose
    private String mId;
    @SerializedName("mText")
    @Expose
    private String mText;
    @SerializedName("help_text")
    @Expose
    private Object mHelpText;
    @SerializedName("display_order")
    @Expose
    private Integer mDisplayOrder;
    @SerializedName("short_text")
    @Expose
    private String mShortText;
    @SerializedName("mPick")
    @Expose
    private String mPick;
    @SerializedName("display_type")
    @Expose
    private String mDisplayType;
    @SerializedName("is_mandatory")
    @Expose
    private Boolean mIsMandatory;
    @SerializedName("correct_answer_id")
    @Expose
    private Object mCorrectAnswerId;
    @SerializedName("facebook_profile")
    @Expose
    private String mFacebookProfile;
    @SerializedName("twitter_profile")
    @Expose
    private Object mTwitterProfile;
    @SerializedName("image_url")
    @Expose
    private Object mImageUrl;
    @SerializedName("cover_image_url")
    @Expose
    private String mCoverImageUrl;
    @SerializedName("cover_image_opacity")
    @Expose
    private Double mCoverImageOpacity;
    @SerializedName("cover_background_color")
    @Expose
    private Object mCoverBackgroundColor;
    @SerializedName("is_shareable_on_facebook")
    @Expose
    private Boolean mIsShareableOnFacebook;
    @SerializedName("is_shareable_on_twitter")
    @Expose
    private Boolean mIsShareableOnTwitter;
    @SerializedName("font_face")
    @Expose
    private Object mFontFace;
    @SerializedName("font_size")
    @Expose
    private Object mFontSize;
    @SerializedName("tag_list")
    @Expose
    private String mTagList;
    @SerializedName("mAnswers")
    @Expose
    private List<Answer> mAnswers = null;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

    public Object getHelpText() {
        return mHelpText;
    }

    public void setHelpText(Object mHelpText) {
        this.mHelpText = mHelpText;
    }

    public Integer getDisplayOrder() {
        return mDisplayOrder;
    }

    public void setDisplayOrder(Integer mDisplayOrder) {
        this.mDisplayOrder = mDisplayOrder;
    }

    public String getShortText() {
        return mShortText;
    }

    public void setShortText(String mShortText) {
        this.mShortText = mShortText;
    }

    public String getPick() {
        return mPick;
    }

    public void setPick(String pick) {
        this.mPick = pick;
    }

    public String getDisplayType() {
        return mDisplayType;
    }

    public void setDisplayType(String displayType) {
        this.mDisplayType = displayType;
    }

    public Boolean getIsMandatory() {
        return mIsMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.mIsMandatory = isMandatory;
    }

    public Object getCorrectAnswerId() {
        return mCorrectAnswerId;
    }

    public void setCorrectAnswerId(Object correctAnswerId) {
        this.mCorrectAnswerId = correctAnswerId;
    }

    public String getFacebookProfile() {
        return mFacebookProfile;
    }

    public void setFacebookProfile(String facebookProfile) {
        this.mFacebookProfile = facebookProfile;
    }

    public Object getTwitterProfile() {
        return mTwitterProfile;
    }

    public void setTwitterProfile(Object mTwitterProfile) {
        this.mTwitterProfile = mTwitterProfile;
    }

    public Object getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(Object imageUrl) {
        this.mImageUrl = imageUrl;
    }

    public String getCoverImageUrl() {
        return mCoverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.mCoverImageUrl = coverImageUrl;
    }

    public Double getCoverImageOpacity() {
        return mCoverImageOpacity;
    }

    public void setCoverImageOpacity(Double coverImageOpacity) {
        this.mCoverImageOpacity = coverImageOpacity;
    }

    public Object getCoverBackgroundColor() {
        return mCoverBackgroundColor;
    }

    public void setCoverBackgroundColor(Object coverBackgroundColor) {
        this.mCoverBackgroundColor = coverBackgroundColor;
    }

    public Boolean getIsShareableOnFacebook() {
        return mIsShareableOnFacebook;
    }

    public void setIsShareableOnFacebook(Boolean isShareableOnFacebook) {
        this.mIsShareableOnFacebook = isShareableOnFacebook;
    }

    public Boolean getIsShareableOnTwitter() {
        return mIsShareableOnTwitter;
    }

    public void setIsShareableOnTwitter(Boolean isShareableOnTwitter) {
        this.mIsShareableOnTwitter = isShareableOnTwitter;
    }

    public Object getFontFace() {
        return mFontFace;
    }

    public void setFontFace(Object fontFace) {
        this.mFontFace = fontFace;
    }

    public Object getFontSize() {
        return mFontSize;
    }

    public void setFontSize(Object fontSize) {
        this.mFontSize = fontSize;
    }

    public String getTagList() {
        return mTagList;
    }

    public void setTagList(String tagList) {
        this.mTagList = tagList;
    }

    public List<Answer> getAnswers() {
        return mAnswers;
    }

    public void setAnswers(List<Answer> answers) {
        this.mAnswers = answers;
    }

}
