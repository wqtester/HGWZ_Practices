package selenium.pages;

import com.sun.org.apache.bcel.internal.ExceptionConstants;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestWeWork {
    public static String url="https://work.weixin.qq.com";

    @Test
    public void testStart() throws InterruptedException {
        String webDriverPath="D:\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",webDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("企业登录")).click();
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);//隐式等待
       // new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(By.name(("q"))));//显式等待 ExpectedConditions.titleContains("XXX")
        System.out.println(driver.manage().getCookies());

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().addCookie((new Cookie("wwrtx.refid","20538924683068580")));
        driver.manage().addCookie(new Cookie("wwrtx.sid","XoYETZnTAbL515AsyqT0_39X4PnOIpkM1KtuLo6stHy-dTjYXFCd2ptTtwNqsdHF"));
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.quit();
    }

}
