package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ebay {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\P0103366\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://www.ebay.com/";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("iPad");
        driver.findElement(By.id("gh-btn")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Boolean isPresent = driver.findElements(By.xpath("//div/div[1]/div[3]/div[1]/div/button")).size() > 0;

        if(isPresent){
            Actions actions = new Actions(driver);
            WebElement target = driver.findElement(By.xpath("//button/div/div"));
            actions.moveToElement(target).perform();
            driver.findElement(By.xpath("//div[3]/div[1]/div/span/span/div/a[5]/span[1]/span")).click();
        }
        else{
          driver.findElement(By.xpath("//div[3]/div[1]/div/span/button")).click();
          driver.findElement(By.xpath("//div[3]/div[1]/div/span/span/div/a[5]/span[1]/span")).click();
        }

        List <WebElement> results = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul/li"));
        for(int i = 0; i<5; i++){
            System.out.println(results.get(i).getText());
        }

    }
}
