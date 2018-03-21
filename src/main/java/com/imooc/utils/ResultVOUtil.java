package com.imooc.utils;

import com.imooc.VO.ResultVO;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/21
 * @copyright: 上海英和
 * @QQ: 583760722
 */
public class ResultVOUtil {
    public static ResultVO success(Object o) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMessage("success");
        resultVO.setData(o);

        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code,String message) {
        ResultVO resultVO = new ResultVO(code,message);
        return resultVO;
    }



}
