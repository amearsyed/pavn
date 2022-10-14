package Testyantra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConditionsMethods {
	@Test
	public void conditionTest()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement element = driver.findElement(By.name("q"));
		System.out.println("Display status:"+element.isDisplayed());
		System.out.println("Enabled Status:"+element.isEnabled());
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		 WebElement male = driver.findElement(By.name("Gender"));
		WebElement female = driver.findElement(By.id("gender-female"));
		
		
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//false
		
		male.click();
		System.out.println(male.isSelected());//True
		System.out.println(female.isSelected());//false
		
		female.click();
		System.out.println(male.isSelected());//false
		System.out.println(female.isSelected());//True
		
		
		
		
		
		
		
		
		
	}

}
