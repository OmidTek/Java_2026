package theInternetHerokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Shadowdom {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

//        driver.get("https://the-internet.herokuapp.com/shadowdom");
//
//        String text=driver.findElement(By.xpath("//span[@slot='my-text']")).getText();
//        System.out.println(text);

        driver.get("https://shop.polymer-project.org/");
        //shop-app
         WebElement shadowDomShopApp= driver.findElement(By.cssSelector("shop-app[page='home']"));
        SearchContext shadowRootShopApp = shadowDomShopApp.getShadowRoot();

        //iron-pages
         WebElement shadowDomIronPages= shadowRootShopApp.findElement(By.cssSelector("iron-pages"));
        List<WebElement> elements = shadowDomIronPages.findElements(By.cssSelector("shop-home"));
        System.out.println(elements.size());


        // shop-home
        WebElement shadowDomShopHome= shadowDomIronPages.findElement(By.cssSelector("shop-home"));
        SearchContext shadowRootShopHome = shadowDomShopHome.getShadowRoot();

        shadowRootShopHome.findElement(By.cssSelector("shop-button>a")).click();

    }
}

