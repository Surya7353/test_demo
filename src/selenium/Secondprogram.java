package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		
		//navigate to url
		driver.get("https://the-internet.herokuapp.com/");
		
		//click on nested frames
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		//go to top frame for more identification on middle frame
		driver.switchTo().frame("frame-top");
		
		// go to middle frame and grab the text in the middle frame  and print it in the console
		WebElement frameMiddle=driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(frameMiddle);
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());

	}

}
