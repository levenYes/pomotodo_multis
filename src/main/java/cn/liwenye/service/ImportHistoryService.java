package cn.liwenye.service;

import cn.liwenye.dao.PomosMapper;
import cn.liwenye.handler.ApiHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liwenye on 2018/01/08
 */
@Service
public class ImportHistoryService {
    @Autowired
    UrlService urlService;

    @Autowired
    PomosMapper pomosMapper;

    public void importHistory(){
        String url;
        for(int i = 2016; i < 2019; i ++){
            for(int j = 1; j < 13; j++){
                for (int k = 5; k < 26; k = k + 10){
                    String baseUrl = "https://api.pomotodo.com/1/pomos?offset=0&limit=100&abandoned=false&manual=false&started_later_than=";
                    url = baseUrl + i +"/" + j + "/" + k;
                    String data = urlService.sendGet(url);
                    urlService.importData(data);
                }
            }
        }
        pomosMapper.deleteDuplicatedRecord();
    }

    public void importHistoryByMutiltyThread(){
        String url;
        // 创建一个线程池
        for(int i = 2016; i < 2019; i ++){
            for(int j = 1; j < 13; j++){
                for (int k = 5; k < 26; k = k + 10){
                    String baseUrl = "https://api.pomotodo.com/1/pomos?offset=0&limit=100&abandoned=false&manual=false&started_later_than=";
                    url = baseUrl + i +"/" + j + "/" + k;
                    new ApiHandler(urlService, url).run();
                }
            }
        }
        pomosMapper.deleteDuplicatedRecord();
    }
}
