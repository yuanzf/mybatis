package com.yuanzf.debug.mapper;


import com.yuanzf.debug.model.ProductModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {

    List<ProductModel> queryList(@Param("name") String produceName, @Param("status") int status, @Param("type") String type);

    int countList();

    void insertProduct(ProductModel model);

    void updateProduct(ProductModel model);

    ProductModel findProductById(int id);

    void deleteProduct(String id);
}
