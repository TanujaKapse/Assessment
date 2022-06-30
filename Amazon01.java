package com.mindtree.seleniumclass;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("refrigerator");
		driver.manage().timeouts().implicitlyWait(33,TimeUnit.SECONDS);
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath("//img[@alt='Samsung 192 L 2 Star Direct Cool Single Door Refrigerator (RR19A241BGS/NL, Grey Silver)'] ")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//(span[@class='a-price a-text-price a-size-medium apexPriceToPay'])"));
		
		WebElement  pri = driver.findElement(By.xpath("//span[@class=' a-price a-text-price a-size-medium apexPriceToPay'])[3]"));
			   String pri1=pri.getText().concat(".00");
			    System.out.println(pri1);
			    Set<String> windows=driver. getWindowHandles();
}
}