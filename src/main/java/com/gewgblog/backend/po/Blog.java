package com.gewgblog.backend.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "t_blog")
public class Blog {
    @Id
    @GeneratedValue
    private long id;

    // blog own attributes
    private String title;
    private String content;
    private String image;
    private String flag;
    private Integer views;
    private boolean showPublic;
    private boolean canComment;
    private boolean canTransfer;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    // relationships
    @ManyToOne
    private Type type;
    @ManyToOne
    private User user;
    @OneToMany
    private List<Comment> comments = new ArrayList<>();

    public Blog() {

    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImage() {
        return image;
    }

    public String getFlag() {
        return flag;
    }

    public Integer getViews() {
        return views;
    }

    public boolean isShowPublic() {
        return showPublic;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public boolean isCanTransfer() {
        return canTransfer;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public void setShowPublic(boolean showPublic) {
        this.showPublic = showPublic;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public void setCanTransfer(boolean canTransfer) {
        this.canTransfer = canTransfer;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

