package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		//identifying and switch to frame  
		driver.switchTo().frame(0);
        driver.findElement(By.id("Click")).click();
        
        //grab the text in the console
        String text=driver.findElement(By.id("Click")).getText();
        System.out.println(text);
        
        //switch  back to native frame 
        driver.switchTo().defaultContent();
        
        //switch to second frame
        driver.switchTo().frame(1);
        
        //switch to nested frame
        driver.switchTo().frame("frame2");
        driver.findElement(By.id("Click1")).click();
        
        //switch back to native frame
        driver.switchTo().defaultContent();
        
        //print the count of the frame
        List<WebElement> totalFrames=driver.findElements(By.tagName("iframe"));
        int size =totalFrames.size();
        System.out.println(size);
        
        
        
        
	}

}
