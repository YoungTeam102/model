package com.igniubi.model.user.req;

import lombok.Data;

@Data
public class SessionReqBO {

    private String sessionKey;

    private Integer uid;
}
