package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPracticeAmazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//basic locator
		
		//1.id
		driver.findElement(By.id("ap_email"));
		
		//2.name
		driver.findElement(By.name("email"));
		
		//3.Linked text
		driver.findElement(By.linkText("Privacy Notice"));
		
		//4.Partial Link Text
		driver.findElement(By.partialLinkText("Notice"));
		
		//5.classname
		driver.findElement(By.className("a-form-label"));
		
		//6.tagname
		driver.findElement(By.tagName("I"));
		
		//customized path
		//9.xpath by reggular expression
		
		driver.findElement(By.xpath("//input[@type='email']"));
		
		//10.xpath by text()
		driver.findElement(By.xpath("//a[text()='Fashion']"));
		
		//11.xpath by contains
		driver.findElement(By.xpath("//input[contains(@id,'mail')]"));
		
		//12.xpath by starts-with
		driver.findElement(By.xpath("//input[starts-with(@id,'ap_')]"));
		
		//13.xpath by logical operator==>and
		driver.findElement(By.xpath("//input[@type='email' and @name='email']"));
		
		//14.xpath by logical operator==>or
		driver.findElement(By.xpath("//input[@type='email' or @id='ap_email']"));
		
		//locator by css selectors
		//15.tag#id
		driver.findElement(By.cssSelector("input#ap_email"));
		
		//16.tagname.classname
		driver.findElement(By.cssSelector("div.nav-left"));  //classname=3 result
		
		//17.tagname[atribute='value']
		driver.findElement(By.cssSelector("input[type='email']"));
		
		//18.tagname.classname[attribute='value']
		
		
	}
}
