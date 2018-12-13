package com.igniubi.model.article.req;

import com.igniubi.model.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class FilmReq extends BaseModel {

    private String title;

    private String author;

    private List<String> content;

    private String contentTitle;

    private String contentSubtitle;

    private String forward;

    private String imgUrl;

}
