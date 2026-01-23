package selenium.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorName {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
        System.out.println("Current element : "+driver.getCurrentUrl());
        System.out.println("current title :"+driver.getTitle());

        driver.quit();

    }
}
