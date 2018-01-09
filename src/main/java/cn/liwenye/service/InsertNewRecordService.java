package cn.liwenye.service;

import cn.liwenye.bean.LastRecord;
import cn.liwenye.dao.PomosMapper;
import cn.liwenye.handler.ApiHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liwenye on 2018/01/09
 */
@Service
public class InsertNewRecordService {
    @Autowired
    UrlService urlService;

    @Autowired
    PomosMapper pomosMapper;

    public void update(){
        String url;
        String baseUrl = "https://api.pomotodo.com/1/pomos?offset=0&limit=100&abandoned=false&manual=false&started_later_than=";
        LastRecord lastRecord = pomosMapper.selectLastRecord();
        Date dayOfLastRecord = lastRecord.getDateOfLastRecord();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
        String lastDay = sf.format(dayOfLastRecord);
        url = baseUrl + lastDay;
        String data = urlService.sendGet(url);
        urlService.importData(data);
        pomosMapper.deleteDuplicatedRecord();
    }
}
