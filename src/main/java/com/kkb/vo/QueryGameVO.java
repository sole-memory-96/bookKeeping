package com.kkb.vo;

import java.util.Date;

public class QueryGameVO {
    private String chineseName;
    private Date beginDate;
    private Date endDate;
    private Integer typeId;

    @Override
    public String toString() {
        return "QueryGameVO{" +
                "chineseName='" + chineseName + '\'' +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                ", typeId=" + typeId +
                '}';
    }


    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
