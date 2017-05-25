package com.mmall.pojo;

import java.util.Date;

/**
 * Created by akku on 2017/5/22.
 * 广告类
 */
public class Adv {
    //id
    private Integer id;
    //标题
    private String title;
    //副标题
    private String subtitle;
    //广告链接到一个类目的商品所对应的商品类目id
    private Integer categoryId;
    //广告链接到某个商品所对应的商品id
    private Integer productId;
    //广告链接的链接地址
    private String pageUrl;
    //广告主图
    private String mainImage;
    //广告全部图片
    private String subImages;
    //广告置放位置
    private Integer position;
    //广告启用状态
    private Integer status;

    private Date createTime;

    private Date updateTime;

    public Adv() {
        super();
    }

    public Adv(Integer id, String title, String subtitle, Integer categoryId, Integer productId, String pageUrl, String mainImage, String subImages, Integer position, Integer status, Date createTime, Date updateTime) {
        super();
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.categoryId = categoryId;
        this.productId = productId;
        this.pageUrl = pageUrl;
        this.mainImage = mainImage;
        this.subImages = subImages;
        this.position = position;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public String getSubImages() {
        return subImages;
    }

    public void setSubImages(String subImages) {
        this.subImages = subImages;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
