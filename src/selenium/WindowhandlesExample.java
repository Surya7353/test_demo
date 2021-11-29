package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandlesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		// store current window identity
		String oldWindow =driver.getWindowHandle();
		
		WebElement firstBtn=driver.findElement(By.id("home"));
		firstBtn.click();
		
		//store multiple windows,including old windows it collecting  using set operation
        Set<String> handles=driver.getWindowHandles();
        
        //changing control to old to new window
        for (String newWindow : handles) {
        	
        	//changing old window handle to new window
        	// string newWindow store the iterated value 
        	driver.switchTo().window(newWindow);
			
		}
        //new window operation click edit button
        driver.findElement(By.xpath("//h5[text()='Edit']")).click();
        driver.close();
        //switch to oldwindow
        driver.switchTo().window(oldWindow);
        
        //click on another button
        driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
        
        //to count the number of windows and print it in the console
        int numberOfWindows= driver.getWindowHandles().size();
       System.out.println("number of windows: " + numberOfWindows);
       
       
        Set<String>newWindowHandles=driver.getWindowHandles();
        //closing only the new windows
        for(String allWindows:newWindowHandles) {
        	//checking the condition that parent window not equal to allwindows switch to new window and close the window
        	if(!allWindows.equals(oldWindow)) {
        		driver.switchTo().window(allWindows);
        		driver.close();
        		
        	}
        }
        
	}
}
