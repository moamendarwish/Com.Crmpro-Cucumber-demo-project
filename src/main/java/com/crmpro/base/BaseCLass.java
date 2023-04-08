package com.crmpro.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseCLass {
    public static WebDriver driver;
    public static Properties props = new Properties();
    public BaseCLass(){
        try {
            FileInputStream fis = new FileInputStream(new File("E:\\First_Selenium_Cucumber_Project\\" +
                    "Cucumber-Course\\src\\main\\java\\com\\crmpro\\properties\\config.properties"));
            props.load(fis);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void launchBrowser() {
        if (props.getProperty("browser").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();}
            else if (props.getProperty("browser").equalsIgnoreCase("edge")){
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            else {
            System.out.println("this browser is not supported");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(props.getProperty("url"));
    }


}
