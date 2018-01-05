package cn.liwenye.service;

import cn.liwenye.bean.Pomos;
import cn.liwenye.dao.PomosMapper;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author liwenye on 2018/01/02
 */
@Service
public class UrlService {
    @Autowired
    PomosMapper pomosMapper;

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

    public void importData(String data){
        List<Pomos> result = new ArrayList<Pomos>();
        JSONArray array = JSONArray.fromObject(data);
        for (int i = 0; i < array.size(); i++) {
            JSONObject object = array.getJSONObject(i);
            Pomos pomos = (Pomos) JSONObject.toBean(object, Pomos.class);
            //created_at
            String strCreatedAt = pomos.getCreated_at();
            Date dateCreatedAt = convertDate(strCreatedAt);
            pomos.setCreatedAt(dateCreatedAt);
            //updated_at
            String strUpdatedAt = pomos.getUpdated_at();
            Date dateUpdatedAt = convertDate(strUpdatedAt);
            pomos.setUpdatedAt(dateUpdatedAt);
            //started_at
            String strStartedAt = pomos.getStarted_at();
            Date dateStartedAt = convertDate(strStartedAt);
            pomos.setStartedAt(dateStartedAt);
            //ended_at
            String strEndedAt = pomos.getEnded_at();
            Date dateEndedAt = convertDate(strEndedAt);
            pomos.setEndedAt(dateEndedAt);
            //local_started_at
            String strLocalStartedAt = pomos.getLocal_started_at();
            Date dateLocalStartedAt = convertDate(strLocalStartedAt);
            pomos.setLocalStartedAt(dateLocalStartedAt);
            //local_ended_at
            String strLocalEndedAt = pomos.getLocal_ended_at();
            Date dateLocalEndedAt = convertDate(strLocalEndedAt);
            pomos.setLocalEndedAt(dateLocalEndedAt);
            //insert
            pomosMapper.insert(pomos);
        }
    }

    Date convertDate(String strDate){
        try {
            strDate = strDate.substring(0,22);
            strDate = strDate.replace("T"," ");
            Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(strDate);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    boolean checkInDatabase(Pomos pomos){
        return false;
    }
}
