package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\WindowsHandling\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.homedepot.com/");
	WebElement search=d.findElement(By.id("headerSearch"));
    search.sendKeys("Ceiling Fan");
    
    WebElement searchbtn=d.findElement(By.id("headerSearchButton"));
    searchbtn.click();
    
    WebElement Fan=d.findElement(By.xpath("(//div[@class='pod-plp__description js-podclick-analytics'])[1]"));
    Fan.click();
    
    WebElement cart=d.findElement(By.xpath("//span[@class='bttn__content'][4]"));
   cart.click();
}
}
