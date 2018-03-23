package com.imooc.controller;

import com.imooc.utils.CheckUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/23
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@RestController
@RequestMapping("/")
public class WeChatController2 {
    @GetMapping("/")
    public String checkSign(@RequestParam("signature")String signature,
                            @RequestParam("timestamp")String timestamp,
                            @RequestParam("nonce")String nonce,
                            @RequestParam("echostr")String echostr){
        if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
            return echostr;
        } else {
            return null;
        }

    }
}
