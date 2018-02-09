package cn.liwenye.handler;

import cn.liwenye.service.HttpService;

/**
 * author by Liwenye on 2018/1/8.
 */

public class ApiHandler extends Thread{

    private HttpService HttpService;

    private String url;


    public ApiHandler(HttpService HttpService, String url) {
        this.HttpService = HttpService;
        this.url = url;
    }

    @Override
    public void run() {
        String data = HttpService.sendGet(url);
        HttpService.importData(data);
    }
}
