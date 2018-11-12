package com.xuetangx.zidongdati.xuetangyun.dto;
import lombok.*;


public class QuestionGetDto {

    private boolean progress_changed; //false

    private String progress_detail; //1/1

    private String html; //

    private String progress_status; //done

    //html :
//"<div id="problem-header-progress">
//    <h2 class="problem-header">
//    单选题
//            </h2>
//
//    <div class="problem-progress"></div>
//</div>
//<div class="problem" aria-live="polite" aria-relevant="all">
//  <div>
//  <p>党的十九大提出的新发展理念是 </p>
//  <span><form class="choicegroup capa_inputtype" id="inputtype_2cee01091aa6483fa0d53827347001c2_2_1">
//    <div class="indicator_container">
//    </div>
//
//    <fieldset role="radiogroup" aria-label="">
//
//        <label for="input_2cee01091aa6483fa0d53827347001c2_2_1_choice_0">
//            <input type="radio" name="input_2cee01091aa6483fa0d53827347001c2_2_1" id="input_2cee01091aa6483fa0d53827347001c2_2_1_choice_0" aria-role="radio" aria-describedby="answer_2cee01091aa6483fa0d53827347001c2_2_1" value="choice_0"/> 代表中国最广大人民的根本利益
//
//            </label>
//        <label for="input_2cee01091aa6483fa0d53827347001c2_2_1_choice_1">
//            <input type="radio" name="input_2cee01091aa6483fa0d53827347001c2_2_1" id="input_2cee01091aa6483fa0d53827347001c2_2_1_choice_1" aria-role="radio" aria-describedby="answer_2cee01091aa6483fa0d53827347001c2_2_1" value="choice_1"/> 以人为本
//
//            </label>
//        <label for="input_2cee01091aa6483fa0d53827347001c2_2_1_choice_2">
//            <input type="radio" name="input_2cee01091aa6483fa0d53827347001c2_2_1" id="input_2cee01091aa6483fa0d53827347001c2_2_1_choice_2" aria-role="radio" aria-describedby="answer_2cee01091aa6483fa0d53827347001c2_2_1" value="choice_2"/> 人民群众是历史的创造者
//
//            </label>
//        <label for="input_2cee01091aa6483fa0d53827347001c2_2_1_choice_3" class="choicegroup_correct">
//            <input type="radio" name="input_2cee01091aa6483fa0d53827347001c2_2_1" id="input_2cee01091aa6483fa0d53827347001c2_2_1_choice_3" aria-role="radio" aria-describedby="answer_2cee01091aa6483fa0d53827347001c2_2_1" value="choice_3" checked="true"/> 以人民为中心
//
//            <span class="sr status">以人民为中心 - 正确</span>
//        </label>
//        <span id="answer_2cee01091aa6483fa0d53827347001c2_2_1"/>
//    </fieldset>
//
//</form></span>
//</div>
//
//  <div class="action">
//    <input type="hidden" name="problem_id" value="单选题" />
//
//    <button class="show"><span class="show-label">显示答案</span> <span class="sr">揭示答案</span></button>
//    <div class="submission_feedback">
//    您已经使用了2次中的 2次提交
//            </div>
//  </div>
//</div>
//            "


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

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getProgress_status() {
        return progress_status;
    }

    public void setProgress_status(String progress_status) {
        this.progress_status = progress_status;
    }
}
