package com.igniubi.model;

public class CommonRsp {

    private String message="success";

    private int code=200;

    private Object data;

    public static class CommonrspBuilder{
        CommonRsp commonRsp;

        public CommonrspBuilder() {
            this.commonRsp= new CommonRsp();
        }

        public CommonrspBuilder code(int code){
            commonRsp.code=code;
            return this;
        }
        public CommonrspBuilder message(String message){
            commonRsp.message=message;
            return this;
        }
        public CommonrspBuilder data(Object data){
            commonRsp.data=data;
            return this;
        }
        public CommonRsp build(){
            return commonRsp;
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
