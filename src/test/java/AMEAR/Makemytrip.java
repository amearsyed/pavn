package AMEAR;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {
	public static void main(String[] args) {
		Date d=new Date();
		String str = d.toString();
		String[] s = str.split(" ");
		String day=s[0];
		String month=s[1];
		String date=s[2];
		String year=s[5];
		String current_date=day+" "+month+" "+date+" "+year;
		System.out.println(current_date);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");

		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		driver.findElement(By.id("fromCity")).sendKeys("mumbai");
		driver.findElement(By.xpath("//div[text()='BOM']")).click();

		driver.findElement(By.id("toCity")).sendKeys("banglore");
		driver.findElement(By.xpath("//div[text()='BLR']")).click();

		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']")).click();
	}

}
