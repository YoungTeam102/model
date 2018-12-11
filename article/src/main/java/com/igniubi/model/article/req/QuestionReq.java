package com.igniubi.model.article.req;

import com.igniubi.model.BaseModel;
import lombok.Data;

import java.util.List;

public class QuestionReq extends BaseModel {

    private String qTitle;

    private String qDescribe;

    private List<String> answers;

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
