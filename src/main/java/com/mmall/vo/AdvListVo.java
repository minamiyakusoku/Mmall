package com.mmall.vo;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

/**
 * Created by akku on 2017/5/22.
 */
public class AdvListVo {
    private Integer id;

    private String title;

    private String subtitle;

    private Integer advType;

    private String advTypeMsg;

    private Integer categoryId;

    private Integer productId;

    private String pageUrl;

    private String mainImage;

    private Integer position;

    private Integer status;

    private String imageHost;

    private String createTime;

    public Integer getAdvType() {
        return advType;
    }

    public void setAdvType(Integer advType) {
        this.advType = advType;
    }

    public String getAdvTypeMsg() {
        return advTypeMsg;
    }

    public void setAdvTypeMsg(String advTypeMsg) {
        this.advTypeMsg = advTypeMsg;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AdvListVo() {
        super();
    }

    public AdvListVo(Integer id, String title, String subtitle,Integer advType,String advTypeMsg, Integer categoryId, Integer productId, String pageUrl, String mainImage, Integer position, Integer status,String imageHost,String createTime) {
        super();
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.advType = advType;
        this.advTypeMsg = advTypeMsg;
        this.categoryId = categoryId;
        this.productId = productId;
        this.pageUrl = pageUrl;
        this.mainImage = mainImage;
        this.position = position;
        this.status = status;
        this.imageHost = imageHost;
        this.createTime = createTime;
    }

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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
