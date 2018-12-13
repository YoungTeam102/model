package com.igniubi.model.article.rsp;

import com.igniubi.model.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class SerialsRsp extends BaseModel {


    private String title;

    private String author;

    private List<String> content;

    private Integer serialId;

    private String forward;

    private String imgUrl;
}
