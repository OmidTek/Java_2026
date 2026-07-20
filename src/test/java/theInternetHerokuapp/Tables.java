package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tables {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/tables");
       String headerName= driver.findElement(By.xpath("//table[@id='table2']//th[3]")).getText();
        String value= driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[3]/td[3]")).getText();
        System.out.println(headerName+"of row 3 col 3:"+value);




    }
}
