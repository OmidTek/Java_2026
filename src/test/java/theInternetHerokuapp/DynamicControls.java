package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControls {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Add']"))).click();

        driver.findElement(By.xpath("//button[text()='Enable']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']"))).sendKeys("Hello");





    }
}
