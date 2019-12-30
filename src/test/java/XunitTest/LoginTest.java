package XunitTest;

import LoginData.LoginDataParams;
import XunitDemo.Login;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {

      @Test(dataProvider= "dataProvider",dataProviderClass = LoginDataParams.class)
              //(dataProvider= "getUsers",dataProviderClass = LoginDataParams.class)
      //@DataProvider(dataProvider= "getUsers",dataProviderClass = LoginDataParams.class)
    //@Test(parameters = {"name","pwd","expect"})
    //@Parameters({"name","pwd","expect"})
    public void testUserLogin(String name1, String pwd1, String expect1){
        Login login = new Login();
        String ac = login.userLogin(name1,pwd1);
        Assert.assertEquals(ac,expect1);
    }
/*    @Test
    public void testUserLogin1(){
        Login login = new Login();
        String as1 = login.userLogin("测试","test");
        Assert.assertEquals(as1,"欢迎测试");
    }

    @Test
    public void testUserLogin2() {
        Login login =new Login();
        String as2 = login.userLogin("admin","admin");
        Assert.assertEquals(as2,"欢迎管理员");
    }

    @Test
    public void testUserLogin3() {
        Login login = new Login();
        String as3 = login.userLogin("","");
        Assert.assertEquals(as3,"用户名或密码不能为空");
    }*/
}
