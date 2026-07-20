package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class disappearingElement {

    public static void main (String [] args) {

        WebDriver driver = new ChromeDriver();
        List<WebElement> list;
        do {
            driver.get("https://the-internet.herokuapp.com/disappearing_elements");
            list = driver.findElements(By.tagName("li"));
        }
        while (list.size() != 5);

//a[text()='Gallery']
        driver.findElement(By.linkText("Gallery")).click();
    }
}
