package com.gewgblog.backend.po;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "t_blog")
public class Blog {

    @Id
    @GeneratedValue
    private long id;

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

    public Blog() {

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

