package com.crm.vtiger.Testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class practice {
	@Test
	public void pract() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("denyBtn")).click();
		WebElement ele = driver.findElement(By.cssSelector("[title='Rings']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[@title='Diamond Rings']")).click();
		List<WebElement> ele1 = driver.findElements(By.xpath("//span[@class='new-price']"));
		for(WebElement ele2:ele1) {
			System.out.println(ele2.getText());
		}

		WebElement ele3 = driver.findElement(By.xpath("//span[text()=' Popular ']"));
		act.moveToElement(ele3).perform();
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
		List<WebElement> ele4 = driver.findElements(By.cssSelector("span[class='new-price']"));
		for(WebElement ele5:ele4) {
			System.out.println(ele5.getText());
		}
				 for(int i=0; i<ele4.size();i++) {
				 if(ele1.equals(ele4)) {
					 System.out.println("prices are same");
				 }
				 else{
					 System.out.println("prices are not same");
				 }
				 }
		driver.close();

	}
}
