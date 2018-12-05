package com.igniubi.model.dtos.user.req;

import com.igniubi.model.BaseModel;

public class RegisterReqBO extends BaseModel {

    private String mobile;

    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
