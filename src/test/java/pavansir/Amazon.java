package pavansir;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void amazontest() throws Exception
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		WebElement ele = driver.findElement(By.linkText("Mobiles"));
		Actions act= new Actions(driver);
		act.contextClick(ele).build().perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ele1 = driver.findElement(By.linkText("Today's Deals"));
		act.contextClick(ele1).build().perform();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ele2 = driver.findElement(By.linkText("Customer Service"));
		act.contextClick(ele2).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ele3 = driver.findElement(By.linkText("Books"));
		act.contextClick(ele3).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement ele5= driver.findElement(By.linkText("Fashion"));
		act.contextClick(ele5).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		while(it.hasNext())
		{
			String winid = it.next();
			String title = driver.switchTo().window(winid).getTitle();
			if(!title.contains("Books")) {
				driver.close();
			}
		}
		
	}

	

}