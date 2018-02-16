package se.com.mail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Todo {
    private WebDriver driver;

    @Test(priority = 1)
    public void Browse() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8180/#/");
        // String title = driver.getTitle();
        //Assert.assertTrue(title.contains("localhost"));
    }

    @Test(priority = 3)
    public void AddTask() {

        driver.get("http://localhost:8180/#/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div/div/a[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div/div/form/fieldset[1]/input")).sendKeys("Dinesh");
        driver.findElement(By.xpath("/html/body/div/div/form/fieldset[2]/div/datetimepicker/ng-form/div[1]/input")).click();
        driver.findElement(By.xpath("/html/body/div/div/form/fieldset[3]/input")).sendKeys("topay ");
        driver.findElement(By.xpath("/html/body/div/div/form/fieldset[4]/select/option[3]")).click();
        driver.findElement(By.name("addTasks")).submit();
    }

    @Test(priority = 5)
    public void CompleteTask(){

        driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td[5]/a[1]/span")).click();
        // String title = driver.getTitle()//
        //Assert.assertTrue(title.contains("Pending tasks"));//
    }

    @Test(priority = 4)
    public void EditTask(){
        driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td[5]/a[2]/span")).click();
        driver.findElement(By.xpath("/html/body/div/div/form/fieldset[4]/select/option[2]")).click();
        driver.findElement(By.xpath("/html/body/div/div/form/fieldset[3]/input")).sendKeys("sheela");
        driver.findElement(By.xpath("/html/body/div/div/form/fieldset[5]/input")).click();

    }
    @Test(priority = 6)
    public void DeleteTask(){
        driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td[5]/a[3]/")).click();

    }
    @Test(priority = 2)
    public void  SearchTask(){
        driver.findElement(By.xpath("/html/body/div/div/div/div/input")).sendKeys("Sheela");
        driver.findElement(By.xpath("/html/body/div/div/div/div/span")).click();

    }

    @Test(priority = 7)
    public void CompletedTAskList(){
        driver.findElement(By.xpath("/html/body/div/div/a[2]")).click();
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

