package com.snapdeal.hooks;

import com.snapdeal.factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.snapdeal.utils.ConfigReader;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Locale;
import java.util.Properties;

public class Myhooks {
    WebDriver driver;

    @Before
    public void setup() throws IOException {
        Properties prop = ConfigReader.intializeProperties();
        Driverfactory.initializedriver(prop.getProperty("browser"));


        driver = Driverfactory.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        driver.get(prop.getProperty("url"));
    }
    @After
    public void tearDown(Scenario scenario){
        String scenarioName = scenario.getName().replaceAll(" ","-");
        if (scenario.isFailed()){
           byte [] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
           scenario.attach(srcScreenshot,"image/png",scenarioName);

        }
        driver.quit();
    }
}
