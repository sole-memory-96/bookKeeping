package com.kkb.pojo;

public class BillType {
    private Long id_;

    private String name_;

    public Long getId_() {
        return id_;
    }

    public void setId_(Long id_) {
        this.id_ = id_;
    }

    public String getName_() {
        return name_;
    }

    public void setName_(String name_) {
        this.name_ = name_ == null ? null : name_.trim();
    }
}