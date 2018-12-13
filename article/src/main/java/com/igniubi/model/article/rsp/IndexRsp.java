package com.igniubi.model.article.rsp;

import com.igniubi.model.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class IndexRsp extends BaseModel {

    private int type;

    private String title;

    private String author;

    private String forward;

    private String imgUrl;
    
}
