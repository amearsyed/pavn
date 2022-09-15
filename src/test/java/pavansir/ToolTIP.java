package pavansir;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToolTIP {
	@Test
	public void tooltiptest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com/");
	      List<WebElement> list = driver.findElements(By.xpath("//nav[@class='topNav_bar is-no-scroll']/ul[@class='display-flex']/li/a"));
	      for(int i=0;i<list.size();i++) {
	    	  String attribute = list.get(i).getAttribute("title");
	    	  System.out.println(attribute);
	      }
		
}
}
