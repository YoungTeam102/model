package com.igniubi.model.article.rsp;

import com.igniubi.model.BaseModel;
import lombok.Data;

@Data
public class WordRsp extends BaseModel {

    private String imgSrc;

    private String word;

    private String wordsInfo;


}
