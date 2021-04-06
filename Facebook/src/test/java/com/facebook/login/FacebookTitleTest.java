package com.facebook.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTitleTest {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
