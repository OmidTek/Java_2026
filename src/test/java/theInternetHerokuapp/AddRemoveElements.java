package theInternetHerokuapp;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.NoSuchElementException;

public class AddRemoveElements {

    public static void main (String [] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        String header =driver.findElement(By.tagName("h3")).getText();

        Assert.assertEquals(header,"Add/Remove Elements");

        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        try {driver.findElement(By.xpath("//button[text()='Delete']")).click();}
        catch(NoSuchElementException e)
        {System.out.println("NoSuchElementException");}


        Thread.sleep(5000);
        driver.close();

    }
}
