package com.kkb.vo;

import java.util.Date;

public class QueryRegistrationVO {
    private Integer id;
    private Integer doctorId;
    private Integer departmentId;
    private Date beginDate;
    private Date endDate;

    @Override
    public String toString() {
        return "QueryRegistrationVO{" +
                "id=" + id +
                ", doctorId=" + doctorId +
                ", departmentId=" + departmentId +
                ", beginDate=" + beginDate +
                ", endDate=" + endDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
