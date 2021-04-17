package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/home/szymon/IdeaProjects/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://forum.gazeta.pl/forum");
        driver.manage().window().maximize();
        WebElement cookiesAccept = driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookiesAccept.click();

    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
    }

}


