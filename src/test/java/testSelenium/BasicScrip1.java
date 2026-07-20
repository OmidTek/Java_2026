package testSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BasicScrip1 {

    public static void main (String [] args){

        ChromeOptions options;
        options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


               //run chrome from 127.0.0.1 port
     //   ChromeOptions options = new ChromeOptions();
      //  options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");


        WebDriver driver=new ChromeDriver(options);
     //   WebDriver driver=new EdgeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://admin-demo.nopcommerce.com");

      // driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");

       WebElement emailBox= driver.findElement(By.id("Email"));
       emailBox.clear();
       emailBox.sendKeys("admin@yourstore.com");

        WebElement passwordBox= driver.findElement(By.name("Password"));
        passwordBox.clear();
        passwordBox.sendKeys("admin");


        driver.findElement(By.xpath("//*[text()='Log in']")).click();
        String title = driver.getTitle();
        System.out.println("Title is :"+ title);

    }
}
