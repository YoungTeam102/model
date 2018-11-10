package com.igniubi.model.user.request;

import lombok.Data;

@Data
public class SessionReqBO {

    private String sessionKey;

    private Integer uid;
}
