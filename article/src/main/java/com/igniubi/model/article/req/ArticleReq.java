package com.igniubi.model.article.req;

import com.igniubi.model.BaseModel;
import lombok.Data;

@Data
public class ArticleReq extends BaseModel {

    private String title;

    private String content;

    private String author;

    private String forward;

    private String imgUrl;

}
