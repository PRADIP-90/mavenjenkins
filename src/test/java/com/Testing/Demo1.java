package com.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	@Test(priority=1)
	public void  verifyTitle() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
		//**********doubt on chromedriver.exe
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/PRADIP/Downloads/Offline%20Website/Offline%20Website/index.html");
		System.out.println("10");
		driver.manage().window().maximize();
		System.out.println("11");
		Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");
		System.out.println("22");
		
	}
	@Test(priority=2)
	public void LoginVerify() throws Exception
	{
		
		System.out.println("33");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com"); // username
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456"); // userpassword
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click(); // click
		String actMessage = driver.getTitle();
		System.out.println("44");
		System.out.println(actMessage);
		String expMessage = "JavaByKiran | Dashboard";
		Assert.assertEquals(actMessage, expMessage);

	}
}
