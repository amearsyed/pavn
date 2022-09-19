package AMEAR;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	//private static String amazon;

	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Iphone 13");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Set<String> ele = driver.getWindowHandles();
		for(String ele2:ele) {
			String ele3 = driver.switchTo().window(ele2).getTitle();
			if(ele3.contains("13-midnight")) {
				driver.switchTo().window(ele3);
			}
		}
		String amazon = driver.findElement(By.xpath("//span[@id='productTitle']/../../../following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/div/div/span/span/span[2]")).getText();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")).click();
		Set<String> ele1 = driver.getWindowHandles();
		for(String ele2:ele1) {
			String ele3 = driver.switchTo().window(ele2).getTitle();
			if(ele3.contains("13-midnight")) {
				driver.switchTo().window(ele3);
			}
		}
		String flipkart = driver.findElement(By.xpath("//span[@class='B_NuCI']/../../following-sibling::div/following-sibling::div/following-sibling::div/div/div/div")).getText();

		//String str = Assignment.amazon;
		String fprice = flipkart.replaceAll("[^0-9]", "");
		int fp = Integer.parseInt(fprice);
		String aprice =amazon.replaceAll("[^0-9]", "");
		int ap = Integer.parseInt(aprice);
		if(fp>ap) {
			System.out.println("flipkartm price is more");
		}
		else
			System.out.println("amazon price is more");

	}
}


