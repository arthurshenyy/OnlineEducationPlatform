package com.net.lznvideo.video.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 视频实体类
 */
public class Video implements Serializable {

  private Integer id;
  private String title;
  private String summary;
  private String coverImg;
  private Integer viewNum;
  private Integer price;
  private java.util.Date  createTime;
  private Integer online;
  private Double point;//只有类对象才能判断是不是null

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }

  public Integer getViewNum() {
    return viewNum;
  }

  public void setViewNum(Integer viewNum) {
    this.viewNum = viewNum;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Integer getOnline() {
    return online;
  }

  public void setOnline(Integer online) {
    this.online = online;
  }

  public Double getPoint() {
    return point;
  }

  public void setPoint(Double point) {
    this.point = point;
  }
}
