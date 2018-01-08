package cn.liwenye.handler;

import cn.liwenye.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public ApiHandler(){

    }

    public ApiHandler(UrlService urlService, String url) {
        this.urlService = urlService;
        this.url = url;
    }

    @Override
    public void run() {
        String data = sendGet(url);
        //urlService.importData(data);
    }

    public  String sendGet(String url) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("Authorization", "token pR5QfI9tstmP5CND8vAbSkTN8jBgMHUwlGv7R0rI8Bo3XZRLbGW4NCSkGPAqjfK5etJ9vyvSFkPN4XkGwYJP77daSRqtWKu6");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
