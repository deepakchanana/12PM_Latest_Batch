package pkg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AUtomation 
{
public static void main(String[] args) {
	
	System.out.println("DSZFgbnasdgfh");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement el1=driver.findElement(By.id("fgg"));
	WebDriverWait w=new WebDriverWait(driver, 5);
	w.until(ExpectedConditions.elementToBeClickable(el1));
	w.until(ExpectedConditions.visibilityOf(el1));
	w.until(ExpectedConditions.textToBePresentInElementValue(el1, "Welcome deepak"));

	WebElement el2=driver.findElement(By.id(""));
	
	
}
 
}
