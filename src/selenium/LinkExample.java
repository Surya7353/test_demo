package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		 WebElement homePage=driver.findElement(By.linkText("Go to Home Page"));
		 homePage.click();
		 Thread.sleep(3000);
		 
		 //navigate back to original link
		 driver.navigate().back();
		 
		 //get the link without clicking
		 WebElement WhereToGo=driver.findElement(By.partialLinkText("Find where"));
		 String where=WhereToGo.getAttribute("href");
		 System.out.println(where);
		 Thread.sleep(2000);
		 
		 //verifying the link was broken or not
		 driver.findElement(By.linkText("Verify am I broken?")).click();
		 
		 String title=driver.getTitle();
		 if(title.contains("404")) {
			 System.out.println("broken");
		 }
		 driver.navigate().back();	
		
		//count the number of link 
		List<WebElement> TotalLinks= driver.findElements(By.tagName("a"));
		int linkCount= TotalLinks.size();
		 System.out.println(linkCount);
		 
	}

}
