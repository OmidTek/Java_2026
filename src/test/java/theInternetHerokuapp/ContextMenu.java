package theInternetHerokuapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement contextMenu= driver.findElement(By.id("hot-spot"));
        Actions actions=new Actions(driver);
        actions.moveToElement(contextMenu).contextClick().perform();

        Thread.sleep(5000);

//• accept();
//•	dismiss();
//•	sendKeys();
//•	getText();

        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


    }
}
