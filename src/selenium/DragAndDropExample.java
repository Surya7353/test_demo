package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		
		
		//Drag and Drop
		
		
		/*driver.get("http://www.leafground.com/pages/drop.html");
		
		WebElement From=driver.findElement(By.id("draggable"));
		WebElement To =driver.findElement(By.id("droppable"));	
		
		Actions actions=new Actions(driver);
		//drag and drop using mouse action
		actions.clickAndHold(From).moveToElement(To).release(To).build().perform();
		//drag and drop simple method
		actions.dragAndDrop(From, To).build().perform();*/
		
		
		//ToolTip
		
		
		driver.get("http://www.leafground.com/pages/tooltip.html");
	    WebElement name=driver.findElement(By.id("age"));
		
		String toolTip=name.getAttribute("title");
		System.out.println(toolTip);
		
		//Selectable
		
		driver.get("http://www.leafground.com/pages/selectable.html");
	    List<WebElement> selectable =driver.findElements(By.xpath("//ol[@class='ui-selectable']/li"));
		int listSize=selectable.size();
		System.out.println(listSize);
		
		//select multiple selectBox
		
		//first method
		Actions act=new Actions(driver);
		/*act.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2)).build().perform();*/
		
		//second method
		act.clickAndHold(selectable.get(0));
		act.clickAndHold(selectable.get(1));
		act.clickAndHold(selectable.get(2));
		act.build().perform();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
