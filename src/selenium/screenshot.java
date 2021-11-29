package selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws InterruptedException {
     
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("http://www.leafground.com/");
		//File src=((TakeScreenshot)driver).getScreenshotAs(Output Type.FILE);
		//System.out.println(src);
		String[] item= {"Bru Instant Coffee Pouch 50 g"};
		driver.get("https://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bru coffee");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("//span[text()='Bru Instant Coffee Pouch 50 g']")).click();

	     //driver.findElement(By.xpath("//meta[contains(@content,'Bru Instant Coffee Pouch 50 g :')]//following::div[124]/span/span")).click();

		
		List<WebElement> products= driver.findElements(By.cssSelector("data-image-index"));
		for(int i=0;i<products.size();i++) {
			String[] name =products.get(i).getText().split(" ");
			
			String formattedName=name[0].trim();
			System.out.println(name);
			
			List itemList=Arrays.asList(item);
			
			if(itemList.contains(formattedName)) {
				driver.findElement(By.cssSelector("add-to-cart-button")).click();
			}
			
			
			
			
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}