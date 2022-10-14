package Testyantra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationandSize {
	public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demo.nopcommerce.com/");
	
	WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	System.out.println("Location(x,y):"+logo.getLocation());
	System.out.println("Location(x,y):"+logo.getLocation().getX());
	System.out.println("Location(x,y):"+logo.getLocation().getY());
	
	
	System.out.println("size(width,height):"+logo.getSize());
	System.out.println("size(width,height):"+logo.getSize().getWidth());
	System.out.println("size(width,height):"+logo.getSize().getHeight());

	
	

}
}