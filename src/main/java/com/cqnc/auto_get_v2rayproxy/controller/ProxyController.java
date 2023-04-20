package com.cqnc.auto_get_v2rayproxy.controller;


import com.cqnc.auto_get_v2rayproxy.service.ProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping
public class ProxyController {

    @Autowired
    private ProxyService proxyService;


    @GetMapping("/get")
    public String getProxy() throws IOException {

        String url1 = "https://mksshare.github.io/";
        String url2 = "https://abshare.github.io/";


        String proxy1 = proxyService.getProxy(url1);


        return proxy1;
    }


}
