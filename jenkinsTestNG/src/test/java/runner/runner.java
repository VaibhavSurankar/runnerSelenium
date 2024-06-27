package runner;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class runner {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Initialize WebDriver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Seed Tution\\Setup\\chromedriver-win64\\chromedriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void GoogleTest() {
        driver.get("https://google.com");
        System.out.println("Title:" + driver.getTitle());
    }

    @AfterTest
    public void tearDown() {
        // Quit WebDriver
        if (driver != null) {
            driver.quit();
        }
    }
}
