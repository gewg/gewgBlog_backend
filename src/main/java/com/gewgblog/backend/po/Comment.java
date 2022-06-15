package com.gewgblog.backend.po;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="t_comment")
public class Comment {

    // comment own attributes
    @Id
    @GeneratedValue
    private long id;

    private String commenter;
    private String content;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    // relationships
    @ManyToOne
    private Blog blog;
    @OneToMany(mappedBy = "parentComment")
    private List<Comment> replyComments = new ArrayList<>();
    @ManyToOne
    private Comment parentComment;

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCommenter(String commenter) {
        this.commenter = commenter;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public long getId() {
        return id;
    }

    public String getCommenter() {
        return commenter;
    }

    public String getContent() {
        return content;
    }

    public Date getCreateTime() {
        return createTime;
    }
}
