package com.aoao.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

/**
 * 動態判斷請求中是否含有callback鍵，若含有，則返回jsonp格式，若沒有，則返回json格式
 */
@ControllerAdvice
public class JsonSupportAdvice extends AbstractJsonpResponseBodyAdvice {

    public JsonSupportAdvice(){
        super("jsoncallback");
    }
}
