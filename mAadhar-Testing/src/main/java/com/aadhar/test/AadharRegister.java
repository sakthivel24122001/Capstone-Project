package com.aadhar.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AadharRegister {
	static WebDriver webdriver = null;

	@Test
	public void ChromeBrowser() {
		webdriver = new ChromeDriver();
		webdriver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");

	}

	@Test
	public void TestHome() {
		webdriver.get("http://localhost:4200/login");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		webdriver.findElement(By.xpath("//div[@class='login-container']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.get("http://localhost:4200/user-register");

		webdriver.findElement(By.id("name")).sendKeys("Nithanya P A");
		webdriver.findElement(By.id("dob")).sendKeys("16/06/2008");
		webdriver.findElement(By.id("emailid")).sendKeys("Nithanya@gmail.com");
		webdriver.findElement(By.id("address")).sendKeys("South Street,Salem");
		webdriver.findElement(By.id("mobileno")).sendKeys("9344621162");
		webdriver.findElement(By.id("gender")).sendKeys("female");
	}

}