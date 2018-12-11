package com.igniubi.model.article.req;

import com.igniubi.model.BaseModel;
import lombok.Data;

@Data
public class WordReq extends BaseModel {

    private String imgSrc;

    private String word;


}
