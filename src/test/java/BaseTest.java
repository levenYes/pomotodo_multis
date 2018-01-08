import cn.liwenye.PomotodoServerApplication;
import cn.liwenye.dao.PomosMapper;
import cn.liwenye.service.BooklistService;
import cn.liwenye.service.ImportHistoryService;
import cn.liwenye.service.UrlService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liwenye
 * Created on 20180102
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PomotodoServerApplication.class)
public class BaseTest {
    @Autowired
    UrlService urlService;

    @Autowired
    BooklistService booklistService;

    @Autowired
    private PomosMapper pomosMapper;

    @Autowired
    ImportHistoryService importHistoryService;

    @Test
    public void test1(){
        String url = "https://api.pomotodo.com/1/account";
        String result = urlService.sendGet(url);
        System.out.println(result);
    }

    @Test
    public void test2(){
        String url = "https://api.pomotodo.com/1/pomos?offset=5&limit=100&abandoned=false&manual=false&started_earlier_than=2017/12/01";
        String data = urlService.sendGet(url);
        urlService.importData(data);
    }

    @Test
    public void test3(){
        long beginTime = System.currentTimeMillis();
        importHistoryService.importHistory();
        long endTime=System.currentTimeMillis();
        long costTime = (endTime - beginTime);
        System.out.println("消耗时间为：" +costTime/1000 + "秒");
    }

    @Test
    public void test4(){
        booklistService.showBooklist();
    }

    @Test
    public void test5(){
        long beginTime = System.currentTimeMillis();
        pomosMapper.deleteDuplicatedRecord();
        long endTime=System.currentTimeMillis();
        long costTime = (endTime - beginTime);
        System.out.println("消耗时间为：" +costTime/1000 + "秒");
    }

    @Test
    public void test6(){
        long beginTime = System.currentTimeMillis();
        importHistoryService.importHistoryByMutiltyThread();
        long endTime=System.currentTimeMillis();
        long costTime = (endTime - beginTime);
        System.out.println("消耗时间为：" +costTime/1000 + "秒");
    }
}
