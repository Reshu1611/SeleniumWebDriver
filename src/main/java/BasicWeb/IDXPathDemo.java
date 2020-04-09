package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IDXPathDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\P0103366\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://facebook.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        driver.findElement(By.id("u_0_m")).sendKeys("Rishaan");
        driver.findElement(By.id("u_0_o")).sendKeys("Samrat");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"u_0_r\"]")).sendKeys("1234567");
        driver.findElement(By.name("reg_passwd__")).sendKeys("facebook1234");
    }
}