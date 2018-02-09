package cn.liwenye.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liwenye on 2018/01/02
 */
public class DateUtil {
    public static Date convertDate(String strDate){
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

    /**
     *TODO
     *
     * 添加一个获取当前日期字符串的方法
     *
     */
}
