package pavansir;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Practice1 {

	@Test
	public void t1()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.icc-cricket.com/homepage");
		WebElement ele = driver.findElement(By.xpath("(//button[normalize-space()='Rankings'])[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[normalize-space()='Team Rankings'])[1]")).click();
		
		List<WebElement> ele2 = driver.findElements(By.xpath("//table/tbody/tr"));
		
//		for(int i=1; i<=ele2.size();i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//
//		       	String name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
//				//String str = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
//				System.out.print(name+" ");
//			
//	
//			}
//			System.out.println();
//		}
		
		for(int i=1;i<ele2.size();i++)
		{
       	String name=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+4+"]")).getText();
       	System.out.println(name+" ");

		}
	}
}
