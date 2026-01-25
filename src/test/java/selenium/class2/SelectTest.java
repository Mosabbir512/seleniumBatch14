package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        Thread.sleep(2000);

        Select select=new Select(driver.findElement(By.id("state")));

        select.selectByIndex(1);
        Thread.sleep(2000);
        select.selectByValue("Rajasthan");
        Thread.sleep(2000);

        select.selectByValue("Haryana");
        Thread.sleep(2000);
        List<WebElement>ops=select.getOptions();
        System.out.println("Total options : "+ops.size());
        for(WebElement option:ops){
            System.out.println(option.getText()+" - "+option.getAttribute("value"));
        }

        driver.quit();
    }
}
