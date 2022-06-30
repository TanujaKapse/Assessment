package com.mindtree.seleniumclass;



import java.util.concurrent.TimeUnit;

import javax.swing.text.html.FormSubmitEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Github");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
	}

}
