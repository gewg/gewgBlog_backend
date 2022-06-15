package com.gewgblog.backend.po;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="t_type")
public class Type {

    // type own attributes
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    // relationships
    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    public Type() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
