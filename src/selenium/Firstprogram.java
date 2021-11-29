package selenium;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		
		//navigate to url
		driver.get("https://the-internet.herokuapp.com/");
		
		//click on multiple windows
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		//click on "click here" option in new window
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		//storing the multiple windows in one variable(child windows)
		Set<String> handle=driver.getWindowHandles();
		
		//iterator operation for  traverse all the windows
        Iterator<String> it = handle.iterator();
        String childWin1=it.next();
        String childWin2=it.next();
        
        //switching to second child window
        driver.switchTo().window(childWin2);
        
        //grabbing the test in the child window and store it in the variable and print it in the console
		String msg =driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println(msg);
		
		//switch back to first child window
	     driver.switchTo().window(childWin1);
		
	   //grabbing the test in the old window and store it in the variable and print it in the console
		 String text=driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
		 System.out.println(text);

	}

}
