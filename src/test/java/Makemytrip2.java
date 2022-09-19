import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		driver.findElement(By.id("fromCity")).sendKeys("triupati");
		driver.findElement(By.xpath("//div[text()='TIR']")).click();
		
		driver.findElement(By.id("toCity")).sendKeys("mumbai");
		driver.findElement(By.xpath("//div[text()='BOM']")).click();
		driver.findElement(By.xpath("//input[@id='departure']")).click();
		
		for(int i=0;i<12;i++)
		{
			try {
				driver.findElement(By.xpath("//div[@aria-label='Sat Mar 04 2023']")).click();

			}catch (Exception e) {
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}

	}

}
