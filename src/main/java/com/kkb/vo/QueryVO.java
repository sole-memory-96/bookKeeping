package com.kkb.vo;

import java.util.Date;

/**
 * 多条件查询球队的实体类
 */
public class QueryVO {
    private String teamName;
    private String chineseName;
    private String coach;
    private Date beginDate;
    private Date endDate;
    private Integer area;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginTime) {
        this.beginDate = beginTime;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endTime) {
        this.endDate = endTime;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }
}
