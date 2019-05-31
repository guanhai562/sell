package com.imooc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.imooc.sell.dataobject.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * @author guanhai562@gmail.com
 * @date 2019/5/30 18:27
 */
@Data
public class ProductVO {
    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
