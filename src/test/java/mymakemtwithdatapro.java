import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class mymakemtwithdatapro {
	@DataProvider
	public Object[][] dataprovide()
	{
		Object obj[][]=new Object[3][2];
		obj[0][0]="BLR";
		obj[0][1]="BKK";
		
		obj[1][0]="NYC";
		obj[1][1]="BOM";

		obj[2][0]="LON";
		obj[2][1]="MAA";
		
		 return obj;
		
	}
		@Test(dataProvider = "dataprovide")
		public void makemytripdata() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class='close']")).click();

		driver.findElement(By.id("fromCity")).sendKeys("triupati");
		driver.findElement(By.xpath("//div[text()='TIR']")).click();

		driver.findElement(By.id("toCity")).sendKeys("banglore");
		driver.findElement(By.xpath("//div[text()='BLR']")).click();	
	
		
	}
}


