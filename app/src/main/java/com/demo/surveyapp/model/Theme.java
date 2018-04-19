
package com.demo.surveyapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Theme {

    @SerializedName("color_active")
    @Expose
    private String mColorActive;
    @SerializedName("color_inactive")
    @Expose
    private String mColorInactive;
    @SerializedName("color_question")
    @Expose
    private String mColorQuestion;
    @SerializedName("color_answer_normal")
    @Expose
    private String mColorAnswerNormal;
    @SerializedName("color_answer_inactive")
    @Expose
    private String mColorAnswerInactive;

    public String getColorActive() {
        return mColorActive;
    }

    public void setColorActive(String colorActive) {
        this.mColorActive = colorActive;
    }

    public String getColorInactive() {
        return mColorInactive;
    }

    public void setColorInactive(String colorInactive) {
        this.mColorInactive = colorInactive;
    }

    public String getColorQuestion() {
        return mColorQuestion;
    }

    public void setColorQuestion(String colorQuestion) {
        this.mColorQuestion = colorQuestion;
    }

    public String getColorAnswerNormal() {
        return mColorAnswerNormal;
    }

    public void setColorAnswerNormal(String colorAnswerNormal) {
        this.mColorAnswerNormal = colorAnswerNormal;
    }

    public String getColorAnswerInactive() {
        return mColorAnswerInactive;
    }

    public void setColorAnswerInactive(String colorAnswerInactive) {
        this.mColorAnswerInactive = colorAnswerInactive;
    }
}
