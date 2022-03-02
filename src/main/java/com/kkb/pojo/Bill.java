package com.kkb.pojo;

import java.util.Date;

public class Bill {
    private Long id_;

    private String title_;

    private Date bill_time_;

    private Long type_id_;

    private Double price_;

    private String explain_;

    public Long getId_() {
        return id_;
    }

    public void setId_(Long id_) {
        this.id_ = id_;
    }

    public String getTitle_() {
        return title_;
    }

    public void setTitle_(String title_) {
        this.title_ = title_ == null ? null : title_.trim();
    }

    public Date getBill_time_() {
        return bill_time_;
    }

    public void setBill_time_(Date bill_time_) {
        this.bill_time_ = bill_time_;
    }

    public Long getType_id_() {
        return type_id_;
    }

    public void setType_id_(Long type_id_) {
        this.type_id_ = type_id_;
    }

    public Double getPrice_() {
        return price_;
    }

    public void setPrice_(Double price_) {
        this.price_ = price_;
    }

    public String getExplain_() {
        return explain_;
    }

    public void setExplain_(String explain_) {
        this.explain_ = explain_ == null ? null : explain_.trim();
    }
}