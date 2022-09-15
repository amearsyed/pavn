
package pavansir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart {

	@Test
	public void listdata() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung tv");
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));
		
		for(WebElement ele1:ele) {
			String s = ele1.getText();
			System.out.println(s);
		}
		
	}

}
