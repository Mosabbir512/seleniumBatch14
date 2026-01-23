package selenium.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();


//        driver.get("https://parabank.parasoft.com/parabank/");
//        Thread.sleep(2000);
//        driver.navigate().to("https://www.saucedemo.com/");
//        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
//        driver.navigate().refresh();

        WebDriver.Navigation nav=driver.navigate();
        driver.get("https://parabank.parasoft.com/parabank/");
        Thread.sleep(2000);
        nav.to("https://www.saucedemo.com/");
        Thread.sleep(2000);
        nav.back();
        Thread.sleep(2000);
        nav.forward();
        Thread.sleep(2000);
        nav.refresh();
        driver.quit();
    }
}
