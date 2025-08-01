package com.lilac.controller;

import com.lilac.commen.Result;
import com.lilac.enums.AppHttpCodeEnum;
import com.lilac.exception.SystemException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/hello")
    public Result hello() {
        throw new SystemException(AppHttpCodeEnum.ERROR);
    }
}
