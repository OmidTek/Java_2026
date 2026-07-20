package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class CheckBox {
//    IsDisplayed();
//    IsSelected();
//    IsEnabled();
public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/checkboxes");

    WebElement box1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
    System.out.println("check box one " + "Is Displayed:" + box1.isDisplayed() + "Is Selected:" + box1.isSelected() + "Is Enabled:" + box1.isEnabled());
    Thread.sleep(5000);
    box1.click();
    System.out.println("box one after click  Is Displayed:" + box1.isDisplayed() + "Is Selected:" + box1.isSelected() + "Is Enabled:" + box1.isEnabled());

    WebElement box2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
    System.out.println("check box two " + "Is Displayed:" + box2.isDisplayed() + "Is Selected:" + box2.isSelected() + "Is Enabled:" + box2.isEnabled());
    Thread.sleep(5000);
    box2.click();
    System.out.println("box two after click  Is Displayed:" + box2.isDisplayed() + "Is Selected:" + box2.isSelected() + "Is Enabled:" + box2.isEnabled());

}

}
