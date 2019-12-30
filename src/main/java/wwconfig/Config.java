package wwconfig;

import static io.restassured.RestAssured.given;

public class Config {
    public String corpid = "wwa131c31a3cf7bed0";
    public String corpsecret = "tguwhKItmi36vh8MBpfhsO0clzrflRy9EHP80I6We0w";
    public Integer agentid = 1000002;
    public String agentsecret = "tguwhKItmi36vh8MBpfhsO0clzrflRy9EHP80I6We0w";
    public String token; //可以给一个初始化值token=""，也可以设置为null

    //单例模式实现全局都可以访问这些参数
    static Config config;
    public static Config getInstance(){  //为getInstance创建单测用例：鼠标点中类名，使用“Ctrl+Shift+T”（默认）， 会弹出 create new test
        if(config==null){
            config=new Config(); //初始化对象
            //获取token信息,为token赋值
            config.token=config.getToken();
        }
        return config;
    }

    private String getToken(){
        return given().
                log().all().
                queryParam("corpid",Config.getInstance().corpid).
                queryParam("corpsecret",Config.getInstance().agentsecret).
            when().
                get("https://qyapi.weixin.qq.com/cgi-bin/gettoken").
            then().
                log().all().
                statusCode(200).
            extract().path("access_token");
    }
}
