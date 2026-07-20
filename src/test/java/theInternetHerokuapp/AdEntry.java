package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AdEntry {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/entry_ad");
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.cssSelector("#modal .modal-footer")));
        wait.until(ExpectedConditions.elementToBeClickable(
               By.xpath("//p[text()='Close']"))).click();
     //   driver.findElement(By.tagName("body")).click();


    }
}
