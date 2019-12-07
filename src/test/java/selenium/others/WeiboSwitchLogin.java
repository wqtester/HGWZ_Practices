package selenium.others;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeiboSwitchLogin {


    @Test
    public void testlogin(){
        String webDriverPath="D:\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",webDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://testerhome.com");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//div[@id='J_Login']/div[@class='module taobao-enter']/a[@href='https://login.taobao.com/member/login.jhtml?from=wblogin&style=wblogin&wbp=&redirect_url=http%3A%2F%2Fweibo.com%2Fa%2Fbind%2Flogin%3Fentry%3Dtaobao%26sid%3D98244865e454172f229063defd75fe31']")).click();

        WebElement element= driver.findElement(By.cssSelector(".navbar-brand"));
        String style = "background:yellow";
        String js = "arguments[0].setAttribute('style',arguments[1])";
      //  ((JavascriptExecutor)driver).executeScript(js.element.style);
    }

/*    @Test
    public void addCookie(){
        Cookie cookie;
        cookie = new Cookie("");
    }*/

}
