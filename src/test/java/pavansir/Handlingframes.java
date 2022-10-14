package pavansir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingframes {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame("packageFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Alert']")).click();
		driver.switchTo().defaultContent();


		driver.switchTo().frame("classFrame");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();


	}

}
