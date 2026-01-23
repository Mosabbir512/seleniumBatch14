package selenium.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorCssSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector(".shopping_cart_badge")).click();
        driver.findElement(By.cssSelector("#checkout")).click();


        driver.findElement(By.cssSelector("#first-name")).sendKeys("Mosabbir");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Hoss");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("5200");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#continue")).click();
        Thread.sleep(2000);

        System.out.println("success : == "+driver.getTitle());

        driver.quit();
    }
}
