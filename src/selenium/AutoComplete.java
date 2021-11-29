package selenium;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	private static final String ToolKit = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\drivers\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		
		//Autocompletion
		
		
		/*driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input=driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(3000);
		 //using list get the values in the selection
		List<WebElement> optionList=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(optionList.size());
		//print the values by checking condition 
		for (WebElement elem : optionList) {
			 if(elem.getText().equals("Web Services")) {
				 elem.click();
				 break;
			 }
	
		}*/
		
		
		//how to download
		
		
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement downloadLink=driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		//using file class mentioning the path where file want to download
		File fileLocation=new File("F:\\surya\\screenshots\\Screenshots");
		//getting the total files in a list in the download folder
	    File[] TotalFiles=	fileLocation.listFiles();
		//checking file download or not in the folder
		for (File file : TotalFiles) {
		if(file.getName().equals("Download Excel"));{
			System.out.println("file is downloaded");
			break;
		}
		}
		
			}

	}
