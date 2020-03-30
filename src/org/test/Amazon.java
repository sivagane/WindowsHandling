package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\WindowsHandling\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.amazon.com/");
	d.manage().window().maximize();
	
	WebElement search=d.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphonesX");
	WebElement searchbtn=d.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
	searchbtn.click();
	Thread.sleep(3000);
	
	WebElement ipX=d.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	ipX.click();
	
	WebElement cart=d.findElement(By.xpath("(//input[@class='a-button-input'])[7]"));
     cart.click();
     
     WebElement prbtn= d.findElement(By.id("hlb-ptc-btn-native"));
     prbtn.click();
}
}
