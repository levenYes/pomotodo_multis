package cn.liwenye.service;

import cn.liwenye.bean.Booklist;
import cn.liwenye.dao.PomosMapper;
import cn.liwenye.util.StrUtil;
import cn.liwenye.util.TxtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author liwenye on 2018/01/08
 */
@Service
public class BooklistService {
    @Autowired
    PomosMapper pomosMapper;

    public void showBooklist(){
        List<Booklist> booklist = pomosMapper.selectBooklist();
        String subTitle = "";
        List<String> mdContent = new ArrayList<String>(16);
        TxtUtil.initMdConent(mdContent);
        for(int i = 0; i<booklist.size(); i++){
            String book = booklist.get(i).getBook();
            Date date =booklist.get(i).getLastDay();
            String lastDate;
            lastDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
            String yearAndMonth = lastDate.substring(0,7);
            if(!subTitle.equals(yearAndMonth)){
                subTitle = yearAndMonth;
                System.out.println("## "+subTitle);
                String titleRow = "## " + subTitle;
                mdContent.add(titleRow);
            }
            System.out.println("book name: "+ StrUtil.getBookName(book)
                    +"       last day: "+lastDate);
            String contentRow = "book name: "+ StrUtil.getBookName(book)
                    +"       last day: "+lastDate;
            mdContent.add(contentRow);
        }
        //打开预设文件
        File mdFile = new File("D:\\\\file\\\\test.md");
        TxtUtil.writeTxt(mdFile,mdContent);
    }
}
