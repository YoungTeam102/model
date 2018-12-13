package com.igniubi.model.article.rsp;

import com.igniubi.model.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class MusicRsp extends BaseModel {

    private String title;

    private String author;

    private List<String> content;

    private String contentTitle;

    private String forward;

    private String imgUrl;

    private String coverImgUrl;

    private String musicUrl;

    private List<String> musicInfo;

}
