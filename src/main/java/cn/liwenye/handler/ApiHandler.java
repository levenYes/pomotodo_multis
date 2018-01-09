package cn.liwenye.handler;

import cn.liwenye.service.UrlService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * author by Liwenye on 2018/1/8.
 */

public class ApiHandler extends Thread{

    private UrlService urlService;

    private String url;


    public ApiHandler(UrlService urlService, String url) {
        this.urlService = urlService;
        this.url = url;
    }

    @Override
    public void run() {
        String data = urlService.sendGet(url);
        urlService.importData(data);
    }
}
