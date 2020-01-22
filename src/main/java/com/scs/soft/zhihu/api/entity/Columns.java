package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author ：weizhewu
 */
@Data
@Builder
public class Columns {
    private Integer id;
    private String title;
    private String description;
    private String url;
    private String imageUrl;
    private Integer followers;
    private Integer articlesCount;
}
