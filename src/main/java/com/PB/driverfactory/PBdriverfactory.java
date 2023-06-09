package com.PB.driverfactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PBdriverfactory {
	WebDriver driver;
	Properties prop;
	FileInputStream fl;
	
	public WebDriver launchbrowser(Properties prop) {
		
		prop=Initial_prop();
		
		String portal=prop.getProperty("Browsername");
		
		System.out.println("browser name :"+portal);
		if(portal.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			driver=new ChromeDriver();
		}else if(portal.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else {
			System.out.println("Check your browser");
		}
		
		driver.get(prop.getProperty("Login_url"));		
		return driver;
	}
	public Properties Initial_prop() {
		prop = new Properties();
		try {
			fl=new FileInputStream(new File("./src/test/resources/propertites/config.properties"));
			prop.load(fl);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return prop;
	}
	

}

