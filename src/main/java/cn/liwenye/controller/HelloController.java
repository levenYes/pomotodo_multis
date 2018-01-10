package cn.liwenye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import cn.liwenye.service.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author liwenye on 2018/01/02
 */
@RestController
public class HelloController {
    @Autowired
    HttpService HttpService;

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public String test(HttpServletRequest req) {
        String result;
        String url;
        url = (String)req.getSession().getAttribute("url");
        result = HttpService.sendGet(url);
        return result;
    }
}
