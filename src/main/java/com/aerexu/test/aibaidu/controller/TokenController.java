package com.aerexu.test.aibaidu.controller;

import com.aerexu.test.aibaidu.token.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @task:
 * @discrption:
 * @author: Aere
 * @date: 2017/1/16 18:40
 * @version: 1.0.0
 */
@RestController
@RequestMapping(path = "/token")
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @RequestMapping(path = "/get")
    public String getToken(){
        tokenService.run();
        return "";
    }

}
