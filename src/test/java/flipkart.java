import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 13");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']")).click();
		Set<String> fele = driver.getWindowHandles();
		for(String ele2:fele) {
			String ele3 = driver.switchTo().window(ele2).getTitle();
			if(ele3.contains("13-midnight")) {
				driver.switchTo().window(ele3);
			}
		}
		String str = driver.findElement(By.xpath("//span[@class='B_NuCI']/../../following-sibling::div/following-sibling::div/following-sibling::div/div/div/div")).getText();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Iphone 13");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Set<String> aele = driver.getWindowHandles();
		for(String ele2:aele) {
			String ele3 = driver.switchTo().window(ele2).getTitle();
			if(ele3.contains("13-midnight")) {
				driver.switchTo().window(ele3);
			}
		}
		String str1 = driver.findElement(By.xpath("//span[@id='productTitle']/../../../following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/div/div/span/span/span[2]")).getText();


		String fprice = str.replaceAll("[^0-9]", "");
		int fp = Integer.parseInt(fprice);
		String aprice = str1.replaceAll("[^0-9]", "");
		int ap = Integer.parseInt(aprice);
		if(fp>ap) {
			System.out.println("flipkartm price is more"+ fp+" "+ap);
		}
		else if(fp<ap) {
			System.out.println("amazon price is more"+ ap+" "+fp);
		}
		else
			System.out.println("flipkart price is equal to amazon price"+ap+fp);
	}
}
