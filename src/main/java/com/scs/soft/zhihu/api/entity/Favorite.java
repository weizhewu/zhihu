package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author  weizhewu
 **/
@Data
@Builder
public class Favorite {
    private Integer id;
    private String title;
    //创建者名字
    private String creatorName;
    //创建者头像
    private String creatorAvatar;
    //关注人数
    private Integer followers;
    //收藏内容总数
    private Integer totalCount;
    //置顶问题标题
    private String questionTitle;
    //置顶回答作者名
    private String answerAuthorName;
    //置顶回答内容
    private String answerContent;
    //置顶问题赞同总数
    private Integer voteupCount;
    //置顶问题评论数
    private Integer commentCount;
}