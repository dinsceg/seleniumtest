package se.com.mail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NewTest {
    private WebDriver driver;

    @Test
    public void testEasy() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }

    @Test
    public void testEasy1() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99000 Page"));
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/dinesh/Downloads/Sheela/selenium/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}