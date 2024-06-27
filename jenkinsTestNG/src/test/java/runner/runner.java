package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class runner {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Seed Tution\\Setup\\chromedriver-win64\\chromedriver.exe");

        // Configure Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Maximize browser window on startup

        // Initialize ChromeDriver
        driver = new ChromeDriver(options);
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
