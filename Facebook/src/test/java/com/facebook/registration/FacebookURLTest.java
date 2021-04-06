package com.facebook.registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookURLTest {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		
		System.out.println("Facebook URL is "+ url);
		
		driver.close();
		
		

	}

}
