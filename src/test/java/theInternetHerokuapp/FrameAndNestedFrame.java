package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndNestedFrame {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/frames");
        driver.findElement(By.linkText("Nested Frames")).click();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String left =driver.findElement(By.tagName("body")).getText();
        System.out.println(left);
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        String middle =driver.findElement(By.tagName("body")).getText();
        System.out.println(middle);

        driver.switchTo().defaultContent();
        driver.close();








    }
}
