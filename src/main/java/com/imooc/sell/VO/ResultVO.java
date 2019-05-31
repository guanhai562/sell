package com.imooc.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author guanhai562@gmail.com
 * @date 2019/5/30 18:12
 */
@Data
public class ResultVO<T> {
    /*错误码*/
    private Integer Code;
    /*提示信息*/
    private String msg;
    /*具体内容*/
    private T data;
}
