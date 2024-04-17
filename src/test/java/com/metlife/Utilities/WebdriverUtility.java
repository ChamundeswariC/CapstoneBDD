package com.metlife.Utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class WebdriverUtility {
    public static WebDriver driver;
    public static WebDriverWait wait;
    static ExtentReports extent;
    static ExtentTest test;
    public static void initialize() {
        switch (PropertiesUtils.getProperty("browser")) {
            case "ff":
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ec":
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications");
                driver = new ChromeDriver(options);
                break;
            case "edge":
                EdgeOptions options1 = new EdgeOptions();
                //  options1.addArguments("--disable-notifications");
                driver=new EdgeDriver(options1);
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }


    public static String gettext(By locator) {
        String text = driver.findElement(locator).getText();
        return text;
    }

    public static void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    public static void assertion(String ErrorValue, String ActualValue) {
        Assert.assertEquals(ErrorValue, ActualValue);
    }

    public static void navigate(String url) {
        driver.get(url);
    }

    public static void type(By locator, String value) throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(value);
        Thread.sleep(3000);
    }

    public static String getText(By locator) {
        return driver.findElement(locator).getText();
    }


    public static void click(By locator) throws InterruptedException {
        // wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        //  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

        driver.findElement(locator).click();
        Thread.sleep(3000);

    }

    public static void assertText(By locator) throws InterruptedException {
        //wait.until(ExpectedConditions.textToBe(locator, text));
        Thread.sleep(1000);
        driver.findElement(locator).getText();

    }


    public static void ScrollintoView(By element) throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(element));


    }


    public static void clickjs(By element) throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();", driver.findElement(element));
    }
}
