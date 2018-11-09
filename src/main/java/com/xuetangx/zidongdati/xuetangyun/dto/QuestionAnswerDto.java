package com.xuetangx.zidongdati.xuetangyun.dto;
import lombok.*;


public class QuestionAnswerDto {
    private boolean progress_changed;

    private String progress_detail;

    private String progress_status;

    private String answers;

    public boolean isProgress_changed() {
        return progress_changed;
    }

    public void setProgress_changed(boolean progress_changed) {
        this.progress_changed = progress_changed;
    }

    public String getProgress_detail() {
        return progress_detail;
    }

    public void setProgress_detail(String progress_detail) {
        this.progress_detail = progress_detail;
    }

    public String getProgress_status() {
        return progress_status;
    }

    public void setProgress_status(String progress_status) {
        this.progress_status = progress_status;
    }

    public String getAnswers() {
        return answers;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
}
