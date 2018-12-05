package com.igniubi.model.dtos.user.req;

import lombok.Data;

@Data
public class SessionReqBO {

    private String sessionKey;

    private Integer uid;
}
