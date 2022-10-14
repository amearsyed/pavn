package Testyantra;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PracticeWait {
	@Test
	public void practiceTest() throws Throwable
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://testproject.io/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String win:allwindows)
		{
			if(!win.equals(parent))
			{
				driver.switchTo().window(win);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				//Thread.sleep(5000);
				driver.findElement(By.id("username")).sendKeys("Amear");
			}
		}

	}

}
