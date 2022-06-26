package pkg1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Class1
{
 public static void main(String[] args) throws InterruptedException
 {
   System.setProperty("webdriver.chrome.driver","../SeleniumIntro/chromedriver.exe");
   ChromeDriver driver=new ChromeDriver();
   driver.get("https://www.youtube.com");
   driver.manage().window().maximize();
   WebElement element=driver.findElement(By.id("video-title"));
   Actions ac=new Actions(driver);
   ac.keyDown(Keys.CONTROL).click(element).keyUp(Keys.CONTROL).build().perform();
  
   String firsttab=driver.getWindowHandle(); // address of current tab
  Set<String> alltabs= driver.getWindowHandles(); // address of all tabs
   System.out.println("total tabs "+alltabs.size());
   System.out.println("before switching url is "+driver.getCurrentUrl());
   int kunal=0;
   for(String s:alltabs)
   {
	   kunal=kunal+1;
	   if(kunal==2)
	   {
	   driver.switchTo().window(s);
	   break;
	   }
   }
   System.out.println("After switching url is "+driver.getCurrentUrl());
   driver.switchTo().window(firsttab);
   System.out.println("Finally url is "+driver.getCurrentUrl());
 }
 
 
}
