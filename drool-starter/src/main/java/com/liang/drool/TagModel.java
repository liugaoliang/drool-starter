package com.liang.drool;

public class TagModel {
  
  private String domain;
  private Integer entityNumber;
  private Integer indexNumber;
  private String dateType;
  private int dateLength;
  
  public int getDateLength() {
    return dateLength;
  }
  public void setDateLength(int dateLength) {
    this.dateLength = dateLength;
  }
  private String tag;
  
  public void addTag(String newTag) {
    if (tag != null) {
      tag = tag + ";" + newTag;
    } else {
      tag = newTag;
    }
  }
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }
  public Integer getEntityNumber() {
    return entityNumber;
  }
  public void setEntityNumber(Integer entityNumber) {
    this.entityNumber = entityNumber;
  }
  public Integer getIndexNumber() {
    return indexNumber;
  }
  public void setIndexNumber(Integer indexNumber) {
    this.indexNumber = indexNumber;
  }
  public String getDateType() {
    return dateType;
  }
  public void setDateType(String dateType) {
    this.dateType = dateType;
  }

}
