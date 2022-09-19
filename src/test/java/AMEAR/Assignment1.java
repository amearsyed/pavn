package AMEAR;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung s22 ultra");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Set<String> ele = driver.getWindowHandles();
		for(String ele1:ele)
		{
			String ele2 = driver.switchTo().window(ele1).getTitle();
			if(ele2.contains("Samsung-Phantom-Storage")) {
				driver.switchTo().window(ele2);
			}
		}
		String amazonprice = driver.findElement(By.xpath("//h1[@class='a-size-large a-spacing-none']/../../following-sibling::div[9]/div/style/following-sibling::div/span[2]/span/span[2]")).getText();
		System.out.println(amazonprice);

		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung galaxy s22 ultra");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy S22 Ultra 5G (Burgundy, 256 GB)']")).click();
		Set<String> ele1 = driver.getWindowHandles();
		for(String ele2:ele1)
		{
			String ele3 = driver.switchTo().window(ele2).getTitle();
			if(ele3.contains("samsung-galaxy-s22-ultra"))
			{
				driver.switchTo().window(ele3);
			}
		}

		String flipkartprice = driver.findElement(By.xpath("//span[@class='B_NuCI']/../../following-sibling::div[2]/div/div/div")).getText();
		System.out.println(flipkartprice);


		String aprice = amazonprice.replaceAll("[^0-9]", "");
		String fprice = flipkartprice.replaceAll("[^0-9]", "");
		int ap = Integer.parseInt(aprice);
		int fp = Integer.parseInt(fprice);

		if(ap==fp)
		{
			System.out.println("price are same");
		}
		else if(ap>fp)
		{
			System.out.println("Amazon price is more");
		}
		else
		{
			System.out.println("Flipkart price is more");
		}

	}

}
