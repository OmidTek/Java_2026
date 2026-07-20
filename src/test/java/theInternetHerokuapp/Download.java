package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class Download {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/download");

        // First
        /*
        List< WebElement> list=driver.findElements(By.xpath("//div[@class='example']/a"));
        String downloadLink=list.get(51).getAttribute("href");
        System.out.println(downloadLink);
        //driver.get(downloadLink);
        driver.navigate().to(downloadLink);
        */


        //Second
        List< WebElement> list=driver.findElements(By.xpath("//div[@class='example']/a"));
       list.get(53).click();
       Thread.sleep(5000);
       Robot robot=new Robot();
       robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
       robot.keyRelease(KeyEvent.VK_ENTER);


       /* third way
       import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

Map<String, Object> prefs = new HashMap<>();

prefs.put("download.default_directory", "C:\\Downloads");
prefs.put("download.prompt_for_download", false);
prefs.put("download.directory_upgrade", true);

ChromeOptions options = new ChromeOptions();
options.setExperimentalOption("prefs", prefs);

WebDriver driver = new ChromeDriver(options);
driver.findElement(By.linkText("sample.pdf")).click();
        */
    }
}
