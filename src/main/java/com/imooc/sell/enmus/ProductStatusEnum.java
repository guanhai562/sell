package com.imooc.sell.enmus;

import lombok.Getter;

/**
 * @author guanhai562@gmail.com
 * @date 2019/5/30 16:31
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "在架"),
    DOWM(1, "下架");
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
