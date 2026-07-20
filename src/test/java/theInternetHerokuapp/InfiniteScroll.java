package theInternetHerokuapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class InfiniteScroll {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://the-internet.herokuapp.com/infinite_scroll");
        Thread.sleep(5000);
        WebElement body= driver.findElement(By.tagName("body"));
        //First way Page Down
//        body.click();
//        body.sendKeys(Keys.PAGE_DOWN);

        //second way
     //   Actions actions=new Actions(driver);
       // actions.click(body).perform();
      //  actions.scrollByAmount(0, 1000).perform();
/*  this does not work
       List<WebElement>paragraphs = driver.findElements(By.xpath("//div[@class='jscroll-added']"));
        WebElement last = paragraphs.get(paragraphs.size() - 1);
        actions.scrollToElement(last).perform();
*/

        //Third way
//        scrollTo() → absolute position.
//        scrollBy() → relative movement.
        JavascriptExecutor js=(JavascriptExecutor) driver;
     //   js.executeScript("window.scrollBy(0, 1000)");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");


    }
}
