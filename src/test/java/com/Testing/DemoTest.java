package com.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
@Test(priority=3)
public void  verifyTitle()
{
	System.setProperty("webdriver.chrome.driver", "G:/chromedriver.exe");
	
	driver = new ChromeDriver();
			
	driver.get("file:///C:/Users/PRADIP/Downloads/Offline%20Website/Offline%20Website/index.html");
			
	driver.manage().window().maximize();
	Assert.assertEquals(driver.getTitle(),"JavaByKiran | Log in");
}
@Test(priority=4)
public void LoginVerify()
{
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiran@gmail.com"); // username
	
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123456"); // userpassword
			
	driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click(); // click
			
	String actMessage = driver.getTitle();
	System.out.println(actMessage);
			
	String expMessage = "JavaByKiran | Dashboard";
			
	Assert.assertEquals(actMessage, expMessage);
}

}
