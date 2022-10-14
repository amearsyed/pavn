package Testyantra;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLibrary.WebDriverUtility;

public class ScriptMethods {
	
	@Test
	public void methods() throws Throwable
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebDriverUtility util=new WebDriverUtility();
		
		//flash
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		util.flash(logo, driver);
		
		//draw border
		//WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//util.drawBroder(logo, driver);
//		
//		TakesScreenshot ts =(TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dest= new File(".//screenshots2\\logo.png");
//		FileUtils.copyFile(src, dest);
		
//		title
//		String title = util.getTiltleByJs(driver);
//		System.out.println(title);
//		
		//click
//		WebElement reglink = driver.findElement(By.xpath("//a[text()='Register']"));
//		util.clickElementByJs(reglink, driver);
//		
		//Alert
		//util.generateAlert(driver, "This is my Alert...");
		
		//refresh
//		util.refreshBrowser(driver);
		
		//zoom
//		util.zoomPageByJs(driver);
//		
		
		
		
		
		
		
		
		
	}

}
