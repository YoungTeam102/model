package com.igniubi.model.article.req;

import com.igniubi.model.BaseModel;
import lombok.Data;

@Data
public class SerialsReq extends BaseModel {


    private String title;

    private String author;

    private String content;

    private Integer serialId;

    private String forward;

    private String imgUrl;
}
