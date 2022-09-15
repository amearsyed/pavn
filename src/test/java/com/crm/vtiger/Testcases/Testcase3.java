package com.crm.vtiger.Testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase3 {
	@Test
	public void show() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Syed Amear\\eclipse-workspace\\onlineBatch\\src\\browser_Jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[title='Create Contact...']")).click();
		 WebElement ele=driver.findElement(By.name("salutationtype"));
		 Select s=new Select(ele);
		 s.selectByValue("Mr.");
		 driver.findElement(By.cssSelector("input[style='width:58%;']")).sendKeys("jhvkv");
		 driver.findElement(By.name("lastname")).sendKeys("mumum");
			Thread.sleep(3000);
	driver.get("http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
	driver.findElement(By.name("search_text")).sendKeys("Amear");
	Thread.sleep(3000);
	driver.findElement(By.name("search")).click();
//		 String mainID=driver.getWindowHandle();
//			Set<String>allID=driver.getWindowHandles();
//			for(String i:allID)
//			{
//				if(!mainID.equals(i)) {
//					driver.switchTo().window(i);
//				}
//				driver.findElement(By.className("txtBox")).sendKeys("Amear");		
//	}
}
}
