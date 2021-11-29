package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbtn {

	public static void main(String[] args) {
	
			   System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\drivers\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("http://leafground.com/");
		       
		       /*alert exzmples
		       
	           driver.findElement(By.xpath("//a[contains(@href,'Alert.html')]")).click();
	           driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
	           Alert alert=driver.switchTo().alert();
	           alert.accept();
	          
	           driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		       Alert confirmAlert=driver.switchTo().alert();
		       Thread.sleep(3000);
		       confirmAlert.accept();
		       
		       driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		       Alert confirmPrompt=driver.switchTo().alert();
		       confirmPrompt.sendKeys("Ducking");
		       Thread.sleep(3000);
		       confirmPrompt.accept();
		       
		       */
		       
			
			/* radio button examples
			

			 driver.findElement(By.xpath("//a[contains(@href,'radio.html')]")).click();
			 
			 WebElement unchecked = driver.findElement(By.xpath("//input[@name='news' and @value='0']"));
			 
			 WebElement checked= driver.findElement(By.xpath("//input[@name='news'and @value='1']"));
			 
			 boolean status1=unchecked.isSelected();
			 boolean status2=checked.isSelected();
			 
			 System.out.println("selection is"+ status1);
			 System.out.println("selection is"+ status2);
			 
			*/
		       
		       
		    //checkbox
		       
		       
		    driver.findElement(By.xpath("//a[contains(@href,'pages/checkbox.html')]")).click();
		    //following xpath
		    driver.findElement(By.xpath("//label[text()='Select the languages that you know?']//following::input[1]")).click();
		
		  WebElement selenium = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following::input[1]"));
			
			boolean seleniumSelected=selenium.isSelected();
			System.out.println("selenium selected"+ seleniumSelected);
			
			
			WebElement firstElement=driver.findElement(By.xpath("//label[text()='DeSelect only checked']//following::input[1]"));
			if(firstElement.isSelected()) {
				firstElement.click();
				}
			
			WebElement secondElement=driver.findElement(By.xpath("//label[text()='DeSelect only checked']//following::input[2]"));
			if(secondElement.isSelected()) {
			  secondElement.click();
			} 
			
	

	}

}
