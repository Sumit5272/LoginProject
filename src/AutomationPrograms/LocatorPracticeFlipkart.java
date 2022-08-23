package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPracticeFlipkart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//basic locator
		//1.id
		driver.findElement(By.id("container"));
		
		//2.name
		driver.findElement(By.name("otracker"));
		
		//3.linked Text
		driver.findElement(By.linkText("Forgot?"));
		
		//4.Partial Link Text
		driver.findElement(By.linkText("Forgot"));
		
		//5.classname
		driver.findElement(By.className("_2IX_2- VJZDxU"));
		
		//6.tagname
		driver.findElement(By.tagName("button"));
		
		//customize xpath
		//9.xpath with regular expression
		driver.findElement(By.xpath("//input[@type='text']"));
		
		//10.xpath with text()
		driver.findElement(By.xpath("//button [text()='Request OTP']"));
		
		//11.xpath by contains
		driver.findElement(By.xpath("//input [contains(@title,'//input [contains(@title,'products')]')]"));
		
		//12.xpath by start-with
		driver.findElement(By.xpath("//input [starts-with(@title,'Search for')]"));
		
		//13.xpath by logical operator==>and
		driver.findElement(By.xpath("//input [@type='text' and @class='_2IX_2- VJZDxU']"));
		
		//14.xpath by logical operator==>or
		driver.findElement(By.xpath("//input [@type='text' or @class='_3704LK']"));
		
		//locator by css selector
		//15.tag#id
		driver.findElement(By.cssSelector("script#jsonLD"));
		
		//16.tagname.classname
		driver.findElement(By.cssSelector("div._1kidPb"));
		
		//17.tagname[attribute='value']
		driver.findElement(By.cssSelector("div[class='_1rH5Jn']"));
		
		//18.tagname.classname[attribute='value']
		driver.findElement(By.cssSelector("button,L0Z3Pu[type='submit']"));
		
		
	}
}
