package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		//get the count of columns in the table
		List<WebElement> columns=driver.findElements(By.tagName("th"));
		int columnCount=columns.size();
		System.out.println("number of columns "+columnCount);
		//get the count of rows in the table
		List<WebElement> rows =driver.findElements(By.tagName("tr"));
		int rowsCount=rows.size();
		System.out.println("number of rows "+ rowsCount);
		//get the second row value and print in the cosole
		WebElement getPercent=driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']//following-sibling::td[1]"));
		String percent=getPercent.getText();
		System.out.println("percentage is "+ percent);
		
		//getting three td values in table 
		List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]")); 
		//get the progress values in array list
		List<Integer>numberList= new ArrayList<Integer>();
		
		
		//getting particular value using for loop
		for (WebElement webElement : allProgress) {
			//get the values in the progress and change string into integer
			String individualValue=webElement.getText().replace("%","");
			//to change string into integer
			numberList.add(Integer.parseInt(individualValue));
		}
		//print the all  progress values in the console
		System.out.println("final list "+ numberList);
		//get  minimum  value from the progress value
		int smallValue=Collections.min(numberList);
		System.out.println(smallValue);
		String smallValueString=Integer.toString(smallValue)+"%";
		String finalXpath="//td[normalize-space()="+"\""+ smallValueString + "\""+"]"+"//following::td[1]";
		System.out.println(finalXpath);
		
		WebElement check=driver.findElement(By.xpath("//td[text()='Learn to interact using Keyboard, Actions']/following-sibling::td[2]"));
		check.click();				
		
		
	}
}