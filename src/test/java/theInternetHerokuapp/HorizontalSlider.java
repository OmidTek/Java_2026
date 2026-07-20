package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Random;

public class HorizontalSlider {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider= driver.findElement(By.tagName("input"));
        WebElement sliderNum=driver.findElement(By.id("range"));
        Random random=new Random();
        Actions actions=new Actions(driver);

        double range=0;
        double target=random.nextInt(11)/2.0;
        System.out.println( target);

        actions.click(slider);

        while(Double.compare(range,target)!=0)
       {
           System.out.println(Double.compare(range,target)+"range"+range);
            if (target > range)
            {actions.sendKeys(Keys.ARROW_RIGHT).perform();}
            else {
                actions.sendKeys(Keys.ARROW_LEFT).perform();
            }
            range = Double.parseDouble(sliderNum.getText());
        };



       //this code works well without Actions class
        /*
        slider.click();

        double range = 0.0;
        double target = 3.5;

        while (Double.compare(range, target) != 0) {

            System.out.println(Double.compare(range, target) + " range " + range);

            if (target > range) {
                slider.sendKeys(Keys.ARROW_RIGHT);
            } else {
                slider.sendKeys(Keys.ARROW_LEFT);
            }

            range = Double.parseDouble(sliderNum.getText());
        }
*/



    }
}
