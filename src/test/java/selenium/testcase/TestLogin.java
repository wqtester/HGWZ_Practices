package selenium.testcase;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestLogin {
    private WebDriver driver;
    @Test
    public void login() {
        driver.get("https://work.weixin.qq.com/");

    }
}
