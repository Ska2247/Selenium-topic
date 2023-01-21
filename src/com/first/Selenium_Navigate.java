package com.first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Navigate {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABI K\\eclipse-workspace\\First_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.manage().window().minimize();

		driver.manage().window().maximize();

		driver.navigate().to("https://www.instagram.com/");

		driver.navigate().back();

		driver.navigate().refresh();

		driver.navigate().forward();

		driver.navigate().refresh();
		
		
	}

}
