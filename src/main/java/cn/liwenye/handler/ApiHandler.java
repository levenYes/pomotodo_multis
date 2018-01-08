package cn.liwenye.handler;

import cn.liwenye.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author by Liwenye on 2018/1/8.
 */

@Service
public class ApiHandler extends Thread{

    private UrlService urlService;

    private String url;

    public ApiHandler(){

    }

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
