package BasicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Gmail {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\P0103366\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        String baseURL = "http://www.stackoverflow.com";
        WebElement target;

        driver.get(baseURL);
        driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("//div[2]/button[1]")).click();
        driver.findElement(By.xpath("//div/form/span/section/div/div/div[1]/div/div[1]/div/div[1]/input")).sendKeys("mskumar0918");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#password >div input")).sendKeys("Work2win$");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mainbar\"]/div[1]/div/a")));
        driver.navigate().to("http://www.gmail.com");
        driver.findElement(By.xpath("//div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("to")));
        driver.findElement(By.name("to")).sendKeys("mskumar0918@gmail.com");
        driver.findElement(By.name("subjectbox")).sendKeys("Test");
        driver.findElement(By.xpath("(//div/table/tbody/tr/td[2]/div[2]/div)[1]")).sendKeys("Hello how are you?");
        driver.findElement(By.xpath("//table/tbody/tr/td[5]/div/div[1]/div/div[2]")).click();
        driver.findElement(By.xpath("//div/div[7]/div/div[3]/div")).click();
        driver.findElement(By.xpath("//*[@title=\"Social\"]/div")).click();
        driver.findElement(By.xpath("//*[@data-tooltip=\"Send \u202A(Ctrl-Enter)\u202C\"]")).click();
        driver.findElement(By.xpath("//*[@aria-label =\"Social\"]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody/tr[1]/td[6])[2]")));

        int attempts = 0;
        while(attempts < 10) {
            try {
                Boolean isPresent = driver.findElements(By.xpath("(//tbody/tr[1]/td[6])[2]")).size() > 0;
                if(isPresent){
                    target = driver.findElement(By.xpath("(//tbody/tr[1]/td[6])[2]"));
                }
                else{
                    target = driver.findElement(By.xpath("//tbody/tr[1]/td[6]"));
                }
                target.click();
                break;
            } catch(Exception e) {
                System.out.println("Exception Occured"+ " " + attempts);
            }
            attempts++;
        }

    }
}
