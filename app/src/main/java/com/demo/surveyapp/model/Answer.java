
package com.demo.surveyapp.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Answer {

    @SerializedName("mId")
    @Expose
    private String mId;
    @SerializedName("question_id")
    @Expose
    private String mQuestionId;
    @SerializedName("mText")
    @Expose
    private String mText;
    @SerializedName("help_text")
    @Expose
    private Object mHelpText;
    @SerializedName("input_mask_placeholder")
    @Expose
    private String mInputMaskPlaceholder;
    @SerializedName("short_text")
    @Expose
    private String mShortText;
    @SerializedName("is_mandatory")
    @Expose
    private Boolean mIsMandatory;
    @SerializedName("is_customer_first_name")
    @Expose
    private Boolean mIsCustomerFirstName;
    @SerializedName("is_customer_last_name")
    @Expose
    private Boolean mIsCustomerLastName;
    @SerializedName("is_customer_title")
    @Expose
    private Boolean mIsCustomerTitle;
    @SerializedName("is_customer_email")
    @Expose
    private Boolean mIsCustomerEmail;
    @SerializedName("prompt_custom_answer")
    @Expose
    private Boolean mPromptCustomAnswer;
    @SerializedName("mWeight")
    @Expose
    private Object mWeight;
    @SerializedName("display_order")
    @Expose
    private Integer mDisplayOrder;
    @SerializedName("display_type")
    @Expose
    private String mDisplayType;
    @SerializedName("input_mask")
    @Expose
    private String mInputMask;
    @SerializedName("date_constraint")
    @Expose
    private Object mDateConstraint;
    @SerializedName("default_value")
    @Expose
    private Object mDefaultValue;
    @SerializedName("response_class")
    @Expose
    private String mResponseClass;
    @SerializedName("reference_identifier")
    @Expose
    private Object mReferenceIdentifier;
    @SerializedName("mScore")
    @Expose
    private Object mScore;
    @SerializedName("mAlerts")
    @Expose
    private List<Object> mAlerts = null;

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    public String getQuestionId() {
        return mQuestionId;
    }

    public void setQuestionId(String mQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public Object getHelpText() {
        return mHelpText;
    }

    public void setHelpText(Object mHelpText) {
        this.mHelpText = mHelpText;
    }

    public String getInputMaskPlaceholder() {
        return mInputMaskPlaceholder;
    }

    public void setInputMaskPlaceholder(String mInputMaskPlaceholder) {
        this.mInputMaskPlaceholder = mInputMaskPlaceholder;
    }

    public String getShortText() {
        return mShortText;
    }

    public void setShortText(String mShortText) {
        this.mShortText = mShortText;
    }

    public Boolean getIsMandatory() {
        return mIsMandatory;
    }

    public void setIsMandatory(Boolean mIsMandatory) {
        this.mIsMandatory = mIsMandatory;
    }

    public Boolean getIsCustomerFirstName() {
        return mIsCustomerFirstName;
    }

    public void setIsCustomerFirstName(Boolean mIsCustomerFirstName) {
        this.mIsCustomerFirstName = mIsCustomerFirstName;
    }

    public Boolean getIsCustomerLastName() {
        return mIsCustomerLastName;
    }

    public void setIsCustomerLastName(Boolean mIsCustomerLastName) {
        this.mIsCustomerLastName = mIsCustomerLastName;
    }

    public Boolean getIsCustomerTitle() {
        return mIsCustomerTitle;
    }

    public void setIsCustomerTitle(Boolean mIsCustomerTitle) {
        this.mIsCustomerTitle = mIsCustomerTitle;
    }

    public Boolean getIsCustomerEmail() {
        return mIsCustomerEmail;
    }

    public void setIsCustomerEmail(Boolean mIsCustomerEmail) {
        this.mIsCustomerEmail = mIsCustomerEmail;
    }

    public Boolean getPromptCustomAnswer() {
        return mPromptCustomAnswer;
    }

    public void setPromptCustomAnswer(Boolean mPromptCustomAnswer) {
        this.mPromptCustomAnswer = mPromptCustomAnswer;
    }

    public Object getWeight() {
        return mWeight;
    }

    public void setWeight(Object mWeight) {
        this.mWeight = mWeight;
    }

    public Integer getDisplayOrder() {
        return mDisplayOrder;
    }

    public void setDisplayOrder(Integer mDisplayOrder) {
        this.mDisplayOrder = mDisplayOrder;
    }

    public String getDisplayType() {
        return mDisplayType;
    }

    public void setDisplayType(String mDisplayType) {
        this.mDisplayType = mDisplayType;
    }

    public String getInputMask() {
        return mInputMask;
    }

    public void setInputMask(String mInputMask) {
        this.mInputMask = mInputMask;
    }

    public Object getDateConstraint() {
        return mDateConstraint;
    }

    public void setDateConstraint(Object mDateConstraint) {
        this.mDateConstraint = mDateConstraint;
    }

    public Object getDefaultValue() {
        return mDefaultValue;
    }

    public void setDefaultValue(Object mDefaultValue) {
        this.mDefaultValue = mDefaultValue;
    }

    public String getResponseClass() {
        return mResponseClass;
    }

    public void setResponseClass(String mResponseClass) {
        this.mResponseClass = mResponseClass;
    }

    public Object getReferenceIdentifier() {
        return mReferenceIdentifier;
    }

    public void setReferenceIdentifier(Object mReferenceIdentifier) {
        this.mReferenceIdentifier = mReferenceIdentifier;
    }

    public Object getScore() {
        return mScore;
    }

    public void setScore(Object mScore) {
        this.mScore = mScore;
    }

    public List<Object> getAlerts() {
        return mAlerts;
    }

    public void setAlerts(List<Object> mAlerts) {
        this.mAlerts = mAlerts;
    }
}
