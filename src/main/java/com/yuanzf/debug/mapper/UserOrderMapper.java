package com.yuanzf.debug.mapper;

import com.yuanzf.debug.model.UserOrderModel;

/**
 * @Author: yzf
 * @Date: 2019-02-14 10:19
 * @Desoription:
 */
public interface UserOrderMapper {

    UserOrderModel getUserOrderByUserName(String name);
}
