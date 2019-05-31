package com.imooc.sell.utils;

import com.imooc.sell.VO.ResultVO;

/**
 * @author guanhai562@gmail.com
 * @date 2019/5/30 21:28
 */
public class ResultUtil {
    public static ResultVO success(Object object){
        ResultVO resultVO =new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);

        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO erorr(Integer code ,String msg){
        ResultVO resultVO =new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);

        return resultVO;
    }
}
