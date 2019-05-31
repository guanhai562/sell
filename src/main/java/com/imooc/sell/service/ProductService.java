package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * @author guanhai562@gmail.com
 * @date 2019/5/30 16:19
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /*查询所有的在架商品*/
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable );

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
