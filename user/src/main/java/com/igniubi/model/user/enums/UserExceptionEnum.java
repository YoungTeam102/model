package com.igniubi.model.user.enums;

/**
 * 用户信息异常枚举
 * <p>
 *
 * @author 徐擂
 * @version 1.0.0
 * @date 2019-1-4
 */
public enum UserExceptionEnum {
    USER_ALREADY_EXIST(2001, "用户已存在"),
    PHONE_FORMAT_ERROR(2002, "手机格式有误"),
    USER_INFO_INCORRECT(2003, "用户名或密码错误");

    UserExceptionEnum(int code,String message){
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() { return code; }

    public String getMessage() { return message; }
}
