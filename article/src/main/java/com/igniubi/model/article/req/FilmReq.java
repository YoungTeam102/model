package com.igniubi.model.article.req;

import com.igniubi.model.BaseModel;
import lombok.Data;

@Data
public class FilmReq extends BaseModel {

    private String title;

    private String author;

    private String content;

    private String contentTitle;

    private String contentSubtitle;

    private String forward;

    private String imgUrl;

}
