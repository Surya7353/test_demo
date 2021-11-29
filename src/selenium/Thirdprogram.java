package selenium;

import java.util.List;
import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Thirdprogram {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//click on checkBox option3 
		driver.findElement(By.id("checkBoxOption3")).click();
		
		//get the label on checkBox
        System.out.println(driver.findElement(By.xpath("//label[@for='honda']")).getText());
        
        //click on dropDown option
        driver.findElement(By.id("dropdown-class-example")).click();
        
        //using list operation finding the dropDown selection
        List<WebElement> skills =driver.findElements(By.cssSelector("#dropdown-class-example>option"));
        for(WebElement skill:skills) {
        	
    	 //checking options  have this value or not 
    	 if(skill.getText().equals("Option3")) {
    		 skill.click();
    		 break;
    	  }
        }
     //click on name textBox
     WebElement TextBox=driver.findElement(By.id("name"));
     TextBox.click();
     Thread.sleep(3000);
     
     //give name using javaScript executor 
     JavascriptExecutor jse=(JavascriptExecutor)driver;
     jse.executeScript("arguments[0].value='Option3'",TextBox);
     
     //click on alert  button
     driver.findElement(By.id("alertbtn")).click();
     
      Thread.sleep(3000);
     //switch to alert box 
     Alert alt=driver.switchTo().alert();
     
     //grab the text in the alert box
     String Textmsg =  driver.switchTo().alert().getText();
     System.out.println(Textmsg);
     
     //accept the alert msg
     driver.switchTo().alert().accept();   
     
     
     //checking the name in the alert msg was same in the textBox or not
      String expect_msg="Hello Option3, share this practice page and share your knowledge";
      Assert.assertEquals(Textmsg,expect_msg);
      
        driver.close();
        //splitting the msg for identifying the index
      String[] strArr=Textmsg.split("\\s+");
      for(String word1:strArr) {
    	 System.out.println(word1);
     }
     String Msg="Option3,";
       
	  if(Msg=="Option3,") {
    	   System.out.println("same");
       }
       else {
    		  
            System.out.println("not same");
    	
    	    }
    	   
	}
	

}
