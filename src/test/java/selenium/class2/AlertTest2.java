package selenium.class2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTest2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        try {
            driver.manage().window().maximize();
            driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
            System.out.println("Page Title: " + driver.getTitle());
            Thread.sleep(2000);

            // ============ SIMPLE ALERT ============
            System.out.println("\n1. Testing Simple Alert with CSS: button[onclick='showAlert()']");
            driver.findElement(By.cssSelector("button[onclick='showAlert()']")).click();
            Thread.sleep(2000);
            Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
            String alert1Text = alert1.getText();
            System.out.println("Alert Text: " + alert1Text);
            alert1.accept();
            System.out.println("✓ Simple Alert Accepted");

            // ============ CONFIRMATION ALERT ============
            System.out.println("\n2. Testing Confirmation Alert with CSS: button[onclick='myConfirm()']");
            // সত্যি সত্যি check করি element আছে কিনা
            try {
                driver.findElement(By.cssSelector("button[onclick='myConfirm()']")).click();
                Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
                System.out.println("Confirm Alert Text: " + alert2.getText());
                alert2.dismiss();
                System.out.println("✓ Confirm Alert Dismissed");
            } catch (Exception e) {
                System.out.println("❌ 'myConfirm()' button not found. Trying alternative...");

                // Alternative: Try to find the correct button
                driver.findElement(By.cssSelector("button[onclick='myDesk()']")).click(); // আপনার original code
                Alert alert2 = wait.until(ExpectedConditions.alertIsPresent());
                System.out.println("Confirm Alert Text: " + alert2.getText());
                alert2.dismiss();
                System.out.println("✓ Confirm Alert Dismissed with 'myDesk()'");
            }

            // ============ PROMPT ALERT ============
            System.out.println("\n3. Testing Prompt Alert with CSS: button[onclick='myPromp()']");
            driver.findElement(By.cssSelector("button[onclick='myPromp()']")).click();
            Thread.sleep(2000);
            Alert alert3 = wait.until(ExpectedConditions.alertIsPresent());
            String alert3Text = alert3.getText();
            System.out.println("Prompt Alert Text: " + alert3Text);
            alert3.sendKeys("Selenium Alert Test");
            Thread.sleep(2000);
            alert3.accept();
            System.out.println("✓ Prompt Alert Accepted with text");

            Thread.sleep(2000);
            System.out.println("✅ All tests completed successfully!");

        } catch (Exception e) {
            System.err.println("❌ Error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            driver.quit();
            System.out.println("\nBrowser closed.");
        }
    }
}