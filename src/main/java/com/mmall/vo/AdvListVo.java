package com.mmall.vo;


/**
 * Created by akku on 2017/5/22.
 */
public class AdvListVo {
    private Integer id;

    private String title;

    private String subTitle;

    private Integer categoryId;

    private Integer productId;

    private String pageUrl;

    private String mainImage;

    private Integer position;

    private Integer status;

    private String imageHost;

    public AdvListVo() {
        super();
    }

    public AdvListVo(Integer id, String title, String subTitle, Integer categoryId, Integer productId, String pageUrl, String mainImage, Integer position, Integer status,String imageHost) {
        super();
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.categoryId = categoryId;
        this.productId = productId;
        this.pageUrl = pageUrl;
        this.mainImage = mainImage;
        this.position = position;
        this.status = status;
        this.imageHost = imageHost;
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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
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
