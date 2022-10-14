package pavansir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinginnerfrm2 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
	driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
	driver.switchTo().frame("iframeResult");
	
	driver.switchTo().frame(0);
	String text = driver.findElement(By.xpath("//h1")).getText();
	System.out.println(text);
	
	driver.switchTo().parentFrame();
	String text2 = driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
	System.out.println(text2);
	
}
}
