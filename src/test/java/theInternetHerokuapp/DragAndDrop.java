package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
        Actions actions=new Actions(driver);
        WebElement sourse=driver.findElement(By.id("column-a"));
        WebElement target=driver.findElement(By.id("column-b"));
        actions.dragAndDrop(sourse,target).perform();


    }


}
