package com.igniubi.model.article.req;

import com.igniubi.model.BaseModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class ArticleReq extends BaseModel {

    private String title;

    private List<String> content;

    private String author;

    private String forward;

    private String imgUrl;

    @NotBlank(message = "日期不能为空")
    private String date;

}
