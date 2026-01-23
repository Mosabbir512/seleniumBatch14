package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/");
        Thread.sleep(2000);

       List<WebElement>webElements= driver.findElements(By.tagName("a"));
        System.out.println("Total links: "+webElements.size());
        for (WebElement el:webElements) {
            System.out.println("Links is : "+el.getText()+ "= "+el.getAttribute("href"));
        }
        driver.quit();

    }
}
