package cn.liwenye.service;

import cn.liwenye.bean.LastRecord;
import cn.liwenye.dao.PomosMapper;
import cn.liwenye.handler.ApiHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
        String laterThanDate = "2016/08/31";
        boolean ifContinue = true;
        while(ifContinue){
            String baseUrl = "https://api.pomotodo.com/1/pomos?offset=0&limit=100&abandoned=false&manual=false&started_later_than=";
            url = baseUrl + laterThanDate;
            String data = urlService.sendGet(url);
            urlService.importData(data);
            LastRecord lastRecord = pomosMapper.selectLastRecord();
            Date dayOfLastRecord = lastRecord.getDateOfLastRecord();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
            String lastDay = sf.format(dayOfLastRecord);
            if( laterThanDate.equals(lastDay)){
                ifContinue = false;
            }
            laterThanDate = lastDay;
        }
        pomosMapper.deleteDuplicatedRecord();
    }

    public void importHistoryByMultiThread(){
        String url;
        // 创建一个线程池
        // 可以执行Runnable对象或者Callable对象代表的线程
        for(int i = 2016; i < 2019; i ++){
            for(int j = 1; j < 13; j++){
                for (int k = 5; k < 26; k = k + 50){
                    String baseUrl = "https://api.pomotodo.com/1/pomos?offset=0&limit=100&abandoned=false&manual=false&started_later_than=";
                    url = baseUrl + i +"/" + j + "/" + k;
                    new ApiHandler(urlService,url).run();
                    url = baseUrl + i +"/" + j + "/" + (k+10);
                    new ApiHandler(urlService,url).run();
                    url = baseUrl + i +"/" + j + "/" + (k+20);
                    new ApiHandler(urlService,url).run();
                }
            }
        }
        //结束线程池
        pomosMapper.deleteDuplicatedRecord();
    }
}
