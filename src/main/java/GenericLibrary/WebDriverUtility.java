package GenericLibrary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;


public class WebDriverUtility {

	/**
	 * This method is for maximizing the window
	 * @author Syed Amear
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}


	/**
	 * This method is for implicitwait
	 * @author Syed Amear
	 * @param driver
	 */
	public void waitForpageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}


	/**
	 * This method is for Explicitwait
	 * @author Syed Amear
	 * @param driver
	 * @param ele
	 */
	public void waitForVisibilityofElement(WebDriver driver,WebElement ele)
	{
		WebDriverWait wb=new WebDriverWait(driver,30);
		wb.until(ExpectedConditions.visibilityOf(ele));
	}


	/**
	 * This method is for handling dropdown by index
	 * @author Syed Amear
	 * @param ele
	 * @param index
	 */
	public void selectingByIndex(WebElement ele, int index)
	{
		Select s=new Select(ele);
		s.selectByIndex(index);
	}


	/**
	 * This method is for handling dropdown by value
	 * @author Syed Amear
	 * @param ele
	 * @param value
	 */
	public void selectingByValue(WebElement ele, String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}


	/**
	 * This method is for handling dropdown by text
	 * @author Syed Amear
	 * @param ele
	 * @param text
	 */
	public void selectingByText(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}


	/**
	 * This method is for handling dropdown by index
	 * @author Syed Amear
	 * @param ele
	 * @param index
	 */
	public void deselectingByIndex(WebElement ele, int index)
	{
		Select s=new Select(ele);
		s.deselectByIndex(index);
	}


	/**
	 * This method is for handling dropdown by value
	 * @author Syed Amear
	 * @param ele
	 * @param value
	 */
	public void deselectingByValue(WebElement ele, String value)
	{
		Select s=new Select(ele);
		s.deselectByValue(value);
	}


	/**
	 * This method is for handling dropdown by text
	 * @author Syed Amear
	 * @param ele
	 * @param text
	 */
	public void deselectingByText(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}


	/**
	 * This method is for mousehandling to movetoElement
	 * @author Syed Amear
	 * @param driver
	 * @param ele
	 */
	public void mouseoverAction(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}


	/**
	 * This method is for mousehandling for doubleclick
	 * @author Syed Amear
	 * @param driver
	 * @param ele
	 */
	public void mouseoverdouble(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	/**
	 * This method is for mousehandling for rightclick
	 * @author Syed Amear
	 * @param driver
	 * @param ele
	 */
	public void mouseoverright(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).contextClick().build().perform();
	}


	/**
	 * This method is for mousehandling to draganddrop
	 * @author Syed Amear
	 * @param driver
	 * @param ele
	 */
	public void mouseoverDragandDrop(WebDriver driver, WebElement ele)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(ele, ele).perform();
	}


	/**
	 * This method is for robotclass
	 * 
	 * @throws Exception
	 */
	public void handlingEnterButton() throws Exception
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}


	/**
	 * This method is for tohandlewindow
	 * @author Syed Amear
	 * @param driver
	 * @param partialWindowText
	 */
	public void switchingWindow(WebDriver driver, String partialWindowText)
	{
		Set<String> win = driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		while(it.hasNext())
		{
			String winid = it.next();
			String title = driver.switchTo().window(winid).getTitle();
			if(title.contains(partialWindowText))
			{
				break;
			} 
		}
	}

	/**
	 * This method is for takescreenshot
	 * @author Syed Amear
	 * @param driver
	 * @throws Exception
	 */
	public void takingScreenshot(WebDriver driver) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot");
		Files.copy(src, dest);
	}


	/**
	 * This method is for switchframe by index
	 * @author Syed Amear
	 * @param driver
	 * @param index
	 */
	public void switchframe(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}


	/**
	 * This method is for switchframe WebElement
	 * @author Syed Amear
	 * @param driver
	 * @param ele
	 */
	public void switchframe(WebDriver driver, WebElement ele) {
		driver.switchTo().frame(ele);
	}


	/**
	 * This method is for switchframe by value
	 * @author Syed Amear
	 * @param driver
	 * @param value
	 */
	public void changeframe(WebDriver driver, String value) {
		driver.switchTo().frame(value);
	}

	/**
	 * This method is for scrolling down
	 * @author Syed Amear
	 * @param driver
	 */
	public void scrollhandle(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("windows.ScrollBy(x,y)");
	}



















}
