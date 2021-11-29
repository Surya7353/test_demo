package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
			
			   //DROP BUTTON
		       
		      driver.findElement(By.xpath("//img[@alt='ListBox']")).click();
		      
		      //selection using index, value and text
		      
		      WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		      Select select = new Select(dropDown1);
		      select.selectByIndex(3);
		      select.selectByValue("2");
		      select.selectByVisibleText("Selenium");
		      
		      //get the list of dropdown option
		      
		      List<WebElement> listOfOptions =select.getOptions();
			  int size =  listOfOptions.size();
			  System.out.println("number of elements "+ size);
			  
			  // get the option using sendkeysjj
			  
		    dropDown1.sendKeys("LoadRunner");
		    WebElement multiSelect=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select/option[1]"));
		    Select multiSelectBox=new Select(multiSelect);
		    
		    multiSelectBox.selectByIndex(1);
		    
		    multiSelectBox.selectByIndex(2); 
		    multiSelectBox.selectByIndex(3);
		   // multiSelectBox.selectByIndex(1);
		    //multiSelectBox.selectByIndex()
			
			
			
	

	}

}
