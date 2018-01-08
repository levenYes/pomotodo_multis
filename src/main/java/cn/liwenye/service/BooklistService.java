package cn.liwenye.service;

import cn.liwenye.bean.Booklist;
import cn.liwenye.dao.PomosMapper;
import cn.liwenye.util.TxtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
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
        initMdConent(mdContent);
        for(int i = 0; i<booklist.size(); i++){
            String book = booklist.get(i).getBook();
            Date date =booklist.get(i).getLastDay();
            String lastDate = "";
            lastDate = new SimpleDateFormat("yyyy-MM-dd").format(date);
            String yearAndMonth = lastDate.substring(0,7);
            if(!subTitle.equals(yearAndMonth)){
                subTitle = yearAndMonth;
                System.out.println("## "+subTitle);
                String titleRow = "## " + subTitle;
                mdContent.add(titleRow);
            }
            System.out.println("book name: "+ getBookName(book)
                    +"       last day: "+lastDate);
            String contentRow = "book name: "+ getBookName(book)
                    +"       last day: "+lastDate;
            mdContent.add(contentRow);
        }
        //打开预设文件
        File mdFile = new File("D:\\\\file\\\\test.md");
        TxtUtil.writeTxt(mdFile,mdContent);
    }

    //util方法
    String getBookName(String book){
        String bookName= "";
        int begin = 0;
        int end = 0;
        for(int i = 0; i < book.length(); i++){
            if(book.charAt(i)=='《'){
                begin = i;
            }
            if(book.charAt(i)=='》'){
                end = i;
            }
        }
        bookName = book.substring(begin,end+1);
        return bookName;
    }

    //init mdContent
    void initMdConentBackup(List<String> mdContent) {
        String fileName = "/doc/bookList.md";
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                System.out.println(tempString);
                mdContent.add(tempString);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

    //init mdContent
    void initMdConent(List<String> mdContent) {
        mdContent.add("---");
        mdContent.add("title: 阅读清单");
        mdContent.add("date: 2018/01/08");
        mdContent.add("categories: 定时任务生成");
        mdContent.add("---");
        mdContent.add(" ");
        mdContent.add("作为pomotodo的重度用户，从16年8月底开始，几乎每一次阅读都会用这个应用记录下来。" +
                "利用API接口和定时任务拉取历史记录，抽取每一本书的最后一条记录。" +
                "这样就可以看到都看过哪些书、每本书的上一次阅读是在哪一天。" +
                "利用这些数据，试图更好地安排接下来的阅读计划。" +
                "作为初步尝试，将来还会有更多的想法在此基础上发展和实现。");
        mdContent.add("<!-- more -->");
    }
}
