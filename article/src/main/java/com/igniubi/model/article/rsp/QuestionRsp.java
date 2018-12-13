package com.igniubi.model.article.rsp;

import com.igniubi.model.BaseModel;

import java.util.List;

public class QuestionRsp extends BaseModel {

    private String qTitle;

    private String qDescribe;

    private List<String> answers;

    private String answerer;

    private String forward;

    private String imgUrl;

    public String getAnswerer() {
        return answerer;
    }

    public void setAnswerer(String answerer) {
        this.answerer = answerer;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getqTitle() {
        return qTitle;
    }

    public void setqTitle(String qTitle) {
        this.qTitle = qTitle;
    }

    public String getqDescribe() {
        return qDescribe;
    }

    public void setqDescribe(String qDescribe) {
        this.qDescribe = qDescribe;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
