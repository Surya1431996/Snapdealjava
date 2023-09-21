package com.snapdeal.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Collections;

public class Driverfactory {
    static WebDriver driver = null;
    public static void  initializedriver(String browser){


        if(browser.equals("chrome")){

             driver = new ChromeDriver();



        }

        else if (browser.equals("firefox")){

             driver = new FirefoxDriver();
        }

        else if (browser.equals("edge")) {

             driver = new EdgeDriver();
        }


    }
    public static org.openqa.selenium.WebDriver getDriver(){
        return driver;

    }
}
