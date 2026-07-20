package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JQuery {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/jqueryui/menu");
        driver.findElement(By.linkText("Enabled")).click();
        driver.findElement(By.linkText("Downloads")).click();
        driver.findElement(By.linkText("CSV")).click();


    }
}
