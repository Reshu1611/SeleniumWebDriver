package BasicWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class FirstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\P0103366\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

String baseURL = "http://www.letskodeit.com";
driver.get(baseURL);

    }
}
