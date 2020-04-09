package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public class CreateAccount {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\P0103366\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseURL = "http://www.automationpractice.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseURL);
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("reshma12345@gmail.com");
        driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement radio1 = driver.findElement(By.id("id_gender2"));
        radio1.click();
        driver.findElement(By.name("customer_firstname")).sendKeys("Reshma");
        driver.findElement(By.name("customer_lastname")).sendKeys("Gogula");
        driver.findElement(By.id("passwd")).sendKeys("qwert12345");
       WebElement Date = driver.findElement(By.id("days"));
       Select date = new Select(Date);
        date.selectByValue("16");
        WebElement Month = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select"));
        Select month = new Select(Month);
        month.selectByIndex(11);
        WebElement Year = driver.findElement(By.cssSelector("#years"));
        Select year = new Select(Year);
        year.selectByValue("1992");
        WebElement checkbox = driver.findElement(By.id("newsletter"));
        checkbox.click();
        driver.findElement(By.id("company")).sendKeys("NCS");
        driver.findElement(By.name("address1")).sendKeys("Jurong West, 641654");
        driver.findElement(By.name("city")).sendKeys("Singapore");
        driver.findElement(By.name("postcode")).sendKeys("56001");
        WebElement State = driver.findElement(By.name("id_state"));
        Select state = new Select(State);
        state.selectByVisibleText("Indiana");
        WebElement Country = driver.findElement(By.name("id_country"));
        Select country = new Select(Country);
        country.selectByVisibleText("United States");
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebDriverWait Wait = new WebDriverWait(driver, 20);
       WebElement element = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("phone_mobile")));
        driver.findElement(By.name("phone_mobile")).sendKeys("12345678910");
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span")).click();

    }
}
