package PageObj;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class document {


    WebDriver WebDriver;
    login log;
    @Before
    public void start() throws InterruptedException {
        WebDriver WebDriver = new ChromeDriver();
        WebDriver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(WebDriver, 300, 500);
        WebDriver.get("https://cabinet.nsd.ru/dcs-web2/pages/wr/login/login.xhtml");
        Thread.sleep(2000);}

    @Test
    public void test() {
        log = new login(WebDriver);
        log.fillUserName("friend");
        log.fillPassword("Reg1str@tor!");
        log.clickSubmitButton();

    }



}




