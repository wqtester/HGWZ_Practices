package LoginData;

import org.testng.annotations.DataProvider;

public class LoginDataParams {

    /**
     * 提供用户登录测试方法数据,参数化与数据驱动测试
     * @return
     */
    @DataProvider(name = "dataProvider")
    public Object[][] getUsers(){
        return new Object[][] {
                {"","","用户名或密码不能为空"},
                {"user","","用户名或密码不能为空"},
                {"","123456","用户名或密码不能为空"},
                {"admin","admin","欢迎管理员"},
                {"user","123456","欢迎user"}
        };
    }
}
