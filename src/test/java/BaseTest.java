import cn.liwenye.PomotodoServerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * @author liwenye
 * Created on 20180102
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PomotodoServerApplication.class)
public class BaseTest {
    @Test
    public void test1(){
        String url = "https://api.pomotodo.com/1/account";
        String result = sendGet(url,"");
        System.out.println(result);
    }

    @Test
    public void test2(){
        String url = "https://api.pomotodo.com/1/pomos?offset=5&limit=100&abandoned=false&manual=false&started_earlier_than=2017/12/01";
        String result = sendGet(url,"");
        System.out.println(result);
    }

    @Test
    public void test3(){
        String url = "https://api.pomotodo.com/1/account";
        String result = sendGet(url,"");
        System.out.println(result);
    }

    /**
     * 向指定URL发送GET方法的请求
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url;// + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            //"Authorization: token YOUR_PERSONAL_ACCESS_TOKEN
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
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}
