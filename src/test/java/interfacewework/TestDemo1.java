package interfacewework;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDemo1 {

    @Test
    void demo(){
        assertTrue(false);
    }

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
    }

    @Test
    void post(){
        //useRelaxedHTTPSValidation(); 走代理抓包时用
        given().
                log().all().
                //proxy(8080). 可以走代理抓包
                queryParam("access_token", "1TUNmjyf5w-pFOMvByLuHKeRmfsrP8c4NNzAUa9h9SZ8PBIcDTq8cS8IUVu7KTKMXc-mevm6Z3itzwYYJlZE3-z8ZuZ0Lsf9IgfAo3uHJ1nQAHz7IwBSJ5ATNoex9MyIlT7Z7x0PfqJRiBTISaU3WIB-dvULfDyIIeEWJ8n3TAkAsd6AMZkXok5p15HmP9D-ADotVKN0d_AVzr2KiNsqCQ").
                contentType(ContentType.JSON).
                body("{\n"+
                        "\"touser\" : \"@all\",\n"+
                        "\"toparty\" : \"\",\n" +
                        "\"totag\" : \"\",\n" +
                        "\"msgtype\" : \"text\",\n" +
                        "\"agentid\" : 1000002,\n" +
                        "\"text\" : {\n" +
                        "\"content\" : \"自动化测试：你的快递已到，请携带工卡前往邮件中心领取。\\n出发前可查看<a href=\\\"http://work.weixin.qq.com\\\">邮件中心视频实况</a>，聪明避开排队。\"\n" +
                        "        },\n" +
                        "\"safe\":0,,\n" +
                        " \"enable_id_trans\": 0,\n" +
                        "\"enable_duplicate_check\": 0,\n" +
                    "},\n").
                when().
                post("https://qyapi.weixin.qq.com/cgi-bin/message/send").
                then().log().all().
                statusCode(200).
                body(containsString("ok"));
    }
}
