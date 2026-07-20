package theInternetHerokuapp;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicAuth {
    public static void main (String [] args){
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
        String newUrl=driver.getCurrentUrl();
        String authUrl=newUrl.substring(0,8)+"admin:admin@"+newUrl.substring(8);
        System.out.println(authUrl);
        driver.navigate().to(authUrl);
        String message=driver.findElement(By.tagName("p")).getText();
        Assert.assertTrue(message.contains("Congratulations"));
        driver.navigate().back();
        driver.navigate().back();
        driver.close();

    }
}