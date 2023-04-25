package com.aws.demo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LauchBrowserTest {
	
	@Test
    public void OpenBrowser()  {
    	WebDriver driver;
    	//String chromeDriverPath = System.getenv("CHROMEDRIVER_PATH");
    	//System.setProperty("webdriver.chrome.driver", chromeDriverPath);
    	//WebDriver driver = new ChromeDriver();

    	//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
    	
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        System.out.println("New Updates to be printed on console");

        System.out.println("TestCase 1");
        
		driver.close();
    
    }

}
