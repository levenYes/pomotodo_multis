package cn.liwenye.util;

/**
 * @author liwenye on 2018/01/02
 */
public class StrUtil {
    public static String getBookName(String book){
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
}
