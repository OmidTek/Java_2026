package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;

public class ExitIntent {
    public static void main(String[] args) throws AWTException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/exit_intent");
        Robot robot=new Robot();
        robot.mouseMove(0,50);

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Close']"))).click();
        //driver.findElement(By.xpath("//p[text()='Close']")).click();

    }
}
