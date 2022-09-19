package AMEAR;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBus {
	@Test
	public void bookticket() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("src")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//li[@class='selected']")).click();

		driver.findElement(By.id("dest")).sendKeys("karimnagar");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		int i=1;
		while( i>0) {
			try {
				driver.findElement(By.xpath("(//td[@class='wd day'])[4]")).click();
			}
			catch (Exception e) {
				driver.findElement(By.xpath("//button[text()='>']")).click();

			}
			i++;
		}

	}
}
