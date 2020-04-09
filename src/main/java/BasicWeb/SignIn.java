package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SignIn {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\P0103366\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://www.automationpractice.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
        driver.findElement(By.id("email")).sendKeys("reshma12345@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("qwert12345");
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"categories_block_left\"]/div/ul/li[3]/a")).click();
        WebDriverWait Wait = new WebDriverWait(driver, 20);
        WebElement element = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("color_21")));
        driver.findElement(By.id("color_21")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
        WebDriverWait Wait1 = new WebDriverWait(driver,30);
        WebElement element1 = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("color_40")));
        driver.findElement(By.id("color_40")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        WebDriverWait Wait2 = new WebDriverWait(driver, 20);
        WebElement element2 = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("icon-trash")));
        driver.findElement(By.className("icon-trash")).click();
        //driver.findElement(By.xpath("//*[@id=\"6_31_0_295151\"]/i")).click();
        //WebElement Size = driver.findElement(By.id("group_1"));
        //Select size = new Select(Size);
       // size.selectByValue("3");
       // driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();


    }
}
