package wwconfig;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

/**
 * 封装sendMessage的所有方法
 */
public class Message {
    public Response send(HashMap<String,Object> data){
        //todo:xxx
        //return json
        return given().log().all().
                queryParam("access_token", Config.getInstance().token).
                contentType(ContentType.JSON).
                body(data).
            when().
                post("https://qyapi.weixin.qq.com/cgi-bin/message/send").
            then().
                log().all().extract().response();
    }
}
