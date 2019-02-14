package com.yuanzf.debug.model;

/**
 * @Author: yzf
 * @Date: 2019-02-14 10:28
 * @Desoription:
 */
public class OrderInfo {

    private Integer productId;

    private String productName;

    private Integer productNumber;

    private Integer productPrice;


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public Integer getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productNumber=" + productNumber +
                ", productPrice=" + productPrice +
                '}';
    }
}
