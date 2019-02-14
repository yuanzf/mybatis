package com.yuanzf.debug.model;

import java.util.List;

/**
 * @Author: yzf
 * @Date: 2019-02-14 10:17
 * @Desoription:
 */
public class UserOrderModel {

    private Integer id;

    private String name;

    private String phone;

    private List<OrderInfo> orderModel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<OrderInfo> getOrderModel() {
        return orderModel;
    }

    public void setOrderModel(List<OrderInfo> orderModel) {
        this.orderModel = orderModel;
    }

    @Override
    public String toString() {
        return "UserOrderModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", orderModel=" + orderModel +
                '}';
    }
}
