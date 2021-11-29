package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//WebElement firstImage=driver.findElement(By.xpath("//label[@for='home']/following-sibling::img"));
		//firstImage.click();
		
		WebElement secondImage=driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
		secondImage.click();
		
		if(secondImage.getAttribute("naturalWidth").equals("0")){
		  System.out.println("broken");
		}
		  else {
			  System.out.println("not broken");
		  
			
			
		}
		
		
		
		
	}

}
