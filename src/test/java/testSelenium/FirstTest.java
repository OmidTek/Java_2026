package testSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static void main(String[] args) throws InterruptedException {

            WebDriver driver= new ChromeDriver();
            driver.get("https://www.selenium.dev/documentation/overview/components/");
Thread.sleep(5000);
            driver.quit();

        }
    }

