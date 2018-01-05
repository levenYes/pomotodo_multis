import cn.liwenye.PomotodoServerApplication;
import cn.liwenye.dao.PomosMapper;
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
    private PomosMapper pomosMapper;

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
        String url = "";
        for(int i = 2016; i < 2019; i ++){
            for(int j = 1; j < 13; j++){
                for (int k = 5; k < 30; k = k + 5){
                    String baseUrl = "https://api.pomotodo.com/1/pomos?offset=0&limit=100&abandoned=false&manual=false&started_later_than=";
                    url = baseUrl + i +"/" + j + "/" + k;
                    String data = urlService.sendGet(url);
                    urlService.importData(data);
                }
            }
        }
    }
}
