package Testyantra;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScriptMethod2 {
	@Test
	public void methodTest() throws Throwable
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.hyrtutorials.com/");

		JavascriptExecutor js=(JavascriptExecutor) driver;

		//		//by id
		//		WebElement element = (WebElement)js.executeScript("return document.getElementById('email');");
		//		element.sendKeys("id");
		//		
//		//Enter text
//		js.executeScript("document.getElementById('email').value='amearsyed1';");
//		Thread.sleep(3000);
//		js.executeScript("document.getElementsByName('email')[0].value='amearsyed2';");
//		Thread.sleep(3000);
//		js.executeScript("document.getElementsByClassName('inputtext _55r1 _6luy')[0].value='amearsyed3';");
//		Thread.sleep(3000);
//		js.executeScript("document.querySelector('#email').value='amearsyed4';");
//		Thread.sleep(3000);
//		js.executeScript("document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue='amearsyed6';");
//
		
//		//click
//		js.executeScript("document.getElementsByName('login')[0].click();");
		
//		js.executeScript("document.getElementById('email').style.border='10px red dashed';");
//		
//		js.executeScript("document.getElementById('email').style.background='yellow';");
//		
		//js.executeScript("document.getElementById('email').setAttribute('style','border:8px blue dotted;background:orange');");

		js.executeScript("window.scroll(0, 500);");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, 500);");

		
		
		
		
		
		
		
		

	}

}
