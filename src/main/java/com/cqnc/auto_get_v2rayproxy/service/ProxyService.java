package com.cqnc.auto_get_v2rayproxy.service;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProxyService {


    public String getProxy(String url1) throws IOException {

        Document doc = Jsoup.connect(url1)

                .header("Accept", "*/*")

                .header("Accept-Encoding", "gzip, deflate")

                .header("Accept-Language","zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")

                .header("Content-Type", "application/json;charset=UTF-8")

                .header("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")

                .timeout(10000).get();;

        Element element = doc.body();

        Elements code = element.getElementsByTag("code");

        String text = code.text();

        return text;


    }
}
