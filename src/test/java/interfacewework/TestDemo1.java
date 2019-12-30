package interfacewework;

/**
 * 先写TestDemo1，在把这部分第一步获取token放到java-wwconfig-Config里，再把Config里的getInstance生成单测wwconfig-ConfigTest
 *
 */

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import wwconfig.Config;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDemo1 {

    @Test
    void demo(){
        assertTrue(false);
    }
/* //写在wwconfig里的Config了，为了动态获取token
    @Test
    void getToken(){
        given().
                log().all().
                queryParam("corpid","wwa131c31a3cf7bed0").
                queryParam("corpsecret","tguwhKItmi36vh8MBpfhsO0clzrflRy9EHP80I6We0w").
                when().
                get("https://qyapi.weixin.qq.com/cgi-bin/gettoken").
                then().
                log().all().
                statusCode(200).
                body(containsString("ok"));
    }*/

    @ParameterizedTest
    @ValueSource(strings = { " ", "测试中文", "welcome to wework" ,"企業へようこそ微信",
            "自动化测试：欢迎测试~ \n不懂的可查看 <a href=\"http://www.baidu.com\">百度</a>，自己解决问题。"})
    void sendMessage(String msg){

        HashMap<String,Object> data = new HashMap<String, Object>();
        data.put("touser","@all");
        data.put("toparty","");
        data.put("totag","");
        data.put("msgtype","text");
        data.put("agentid",Config.getInstance().agentid);
        data.put("safe","0");
        data.put("enable_id_trans","0");
        data.put("data.put(\"safe\",\"0\");","0");

        //data.put("text",new HashMap<String,Object>());text里是一个新的HashMap content，里面要塞值的
        HashMap<String,Object> content=new HashMap<String,Object>();
        content.put("content",msg);
        //content.put("content","自动化测试：欢迎测试~ \\n不懂的可查看 <a href=\\\"http://www.baidu.com\\\">百度</a>，自己解决问题。");
        data.put("text",content);
        //useRelaxedHTTPSValidation(); 走代理抓包时用
        given().
                log().all().
                //proxy(8080). 可以走代理抓包
                queryParam("access_token", Config.getInstance().token).
                contentType(ContentType.JSON).
                body(data).
/*                body("{\n"+
                        "\"touser\" : \"@all\",\n"+
                        "\"toparty\" : \"\",\n" +
                        "\"totag\" : \"\",\n" +
                        "\"msgtype\" : \"text\",\n" +
                        "\"agentid\" : 1000002,\n" +
                        "\"text\" : {\n" +
                        "\"content\" : \"自动化测试：你的快递已到，请携带工卡前往邮件中心领取。\\n出发前可查看<a href=\\\"http://work.weixin.qq.com\\\">邮件中心视频实况</a>，聪明避开排队。\"\n" +
                        "        },\n" +
                        "\"safe\":0,\n" +
                        " \"enable_id_trans\": 0,\n" +
                        "\"enable_duplicate_check\": 0,\n" +
                    "},\n").*/
                when().
                post("https://qyapi.weixin.qq.com/cgi-bin/message/send").
                then().log().all().
                statusCode(200).
                body(containsString("ok"));
    }
}
