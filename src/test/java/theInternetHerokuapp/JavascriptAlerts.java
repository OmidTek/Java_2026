package theInternetHerokuapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class JavascriptAlerts {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
      //  WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //accept()
        driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
        Alert alert=driver.switchTo().alert();
      //  Thread.sleep(3000);
        alert.accept();
         // dismiss() or accept()
        driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
        Alert alert2=driver.switchTo().alert();
       // Thread.sleep(3000);
        alert2.accept();

        // Prompt getText() and sendKeys();
        driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
        Alert alert3=driver.switchTo().alert();
        System.out.println(alert3.getText());
        Thread.sleep(3000);
       alert3.sendKeys("Hello");
        //  alert3.sendKeys("22");
        Thread.sleep(5000);
       alert3.accept();


        driver.navigate().to("https://www.selenium.dev/selenium/web/alerts.html#");
        driver.findElement(By.id("prompt")).click();
        Alert alert4 = driver.switchTo().alert();
        Thread.sleep(3000);
        alert4.sendKeys("Hello");
        alert4.accept();

    }
}
