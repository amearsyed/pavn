package com.crm.vtiger.Testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testcase2 {
	@Test
	public void display()
	{
		
		String orgname="Am6";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Syed Amear\\eclipse-workspace\\onlineBatch\\src\\browser_Jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.cssSelector("img[title='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		 WebElement ele=driver.findElement(By.name("industry"));
		Select s=new Select(ele);
		s.selectByValue("Education");
		driver.findElement(By.name("button")).click();
		WebElement ele1 = driver.findElement(By.className("dvHeaderText"));
		 String text=ele1.getText();
		 System.out.println(text);
		 if(text.contains(orgname))
		 {
		System.out.println("text contains : "+orgname);
		
	}
		 WebElement ele2 = driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]"));
		 Actions act=new Actions(driver);
		 act.moveToElement(ele2).perform();
		 driver.findElement(By.linkText("Sign Out")).click();
		 driver.close();

		
	}
}
