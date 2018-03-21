package com.imooc.VO;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhy
 * @version 1.0
 * @classDesc: http请求返回做的最外层对象
 * @date 2018/3/21
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Data
public class ResultVO  implements Serializable{
    private static final long serialVersionUID = -57653988251189238L;
    /** 错误码 **/
    private Integer code;

    /** 错误信息 **/
    private String message;
    /** 返回对象 **/
    private Object data;

    public ResultVO() {
    }

    public ResultVO(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
