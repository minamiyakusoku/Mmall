package com.mmall.vo;


/**
 * Created by akku on 2017/5/22.
 * 广告详情页面输出包装类
 */
public class AdvDetailVo {
    private Integer id;

    private String title;

    private String subtitle;

    //广告链接内容类型编号
    private Integer advType;

    //广告链接内容类型
    private String advTypeMsg;

    private Integer categoryId;

    private Integer productId;

    private String pageUrl;

    private String mainImage;

    private String subImages;

    private Integer position;

    private Integer status;
    private String createTime;

    private String upDateTime;

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    private String imageHost;;


    public AdvDetailVo() {
        super();
    }

    public AdvDetailVo(Integer id, String title, String subtitle,Integer advType,String advTypeMsg, Integer categoryId, Integer productId, String pageUrl, String mainImage, String subImages, Integer position, Integer status, String createTime, String upDateTime,String imageHost) {
        super();
        this.id = id;
        this.title = title;
        this.advType = advType;
        this.advTypeMsg = advTypeMsg;
        this.subtitle = subtitle;
        this.categoryId = categoryId;
        this.productId = productId;
        this.pageUrl = pageUrl;
        this.mainImage = mainImage;
        this.subImages = subImages;
        this.position = position;
        this.status = status;
        this.createTime = createTime;
        this.upDateTime = upDateTime;
        this.imageHost = imageHost;
    }

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

    public void setUpDateTime(String upDateTime) {
        this.upDateTime = upDateTime;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpDateTime() {
        return upDateTime;
    }

    public void setUpdateTime(String upDateTime) {
        this.upDateTime = upDateTime;
    }
    
}
