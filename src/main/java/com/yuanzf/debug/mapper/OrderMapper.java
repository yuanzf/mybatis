package com.yuanzf.debug.mapper;

import com.yuanzf.debug.model.OrderModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

    List<OrderModel> queryList(@Param("productId") int productId, @Param("userId") int userId);

    int countList();

    void insertOrder(OrderModel model);

    OrderModel findOrderById(@Param("id") String id);

    List<OrderModel> findOrderByUserId(@Param("userId") String id);

}
