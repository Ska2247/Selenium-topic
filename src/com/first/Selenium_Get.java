package com.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Get {

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABI K\\eclipse-workspace\\First_Project\\Driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
		Username.sendKeys("abc@gmail.com");

		WebElement Pass = driver.findElement(By.xpath("//input[@name='pass']"));
		Pass.sendKeys("123456");

		WebElement Login_Btn = driver.findElement(By.xpath("//button[@name='login']"));
		Login_Btn.click();

		WebElement Forgot_Pass = driver.findElement(By.xpath("//a[.='Forgotten password?']"));
		Forgot_Pass.click();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

}
