package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//for facebook website
		//Basic Locator
		
		//1.id
		driver.findElement(By.id("provide the id value from the website"));
		driver.findElement(By.id("email"));
		
		//2.name
		driver.findElement(By.name("provide the name value from the website"));
		driver.findElement(By.name("email"));
		
		//3.linked text
		driver.findElement(By.linkText("provide the text from the website which written in><symbol"));
		driver.findElement(By.linkText("Forgotten password?"));
		
		//4.Partial Link Text
		driver.findElement(By.partialLinkText("provide the part of text from the website which written in><symbol"));
		driver.findElement(By.partialLinkText("password?"));
		
		
		//5.classname
		driver.findElement(By.className("provide the attribute value for the class attribute from website"));
		driver.findElement(By.className("inputtext _55r1 _6luy"));
		
		//6Tagname
		driver.findElement(By.tagName("provide the attribute value for the tagname attribute from website"));
		driver.findElement(By.tagName("button"));
		
		//7.Absolute xpath
		driver.findElement(By.xpath("provide the Absolute xpath from the website"));
		driver.findElement(By.xpath("             "));
		
		//8.Relative xpath
		driver.findElement(By.xpath("provide the Relative xpath from the website"));
		driver.findElement(By.xpath("           "));
		
		//Costomized xpath
		
		//9.xpath with reggular expression
		driver.findElement(By.xpath("//tagname[@attribute='attribute value']"));
		driver.findElement(By.xpath("//input[@id='email']"));
		
		//10.xpath by text()
		driver.findElement(By.xpath("//tagname[Text()='value']"));
		driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		//11.xpath by contains
		driver.findElement(By.xpath("//tagname[contains(@attribute,'value')]"));
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]"));
		
		//12.xpath by starts-with
		driver.findElement(By.xpath("//tagname[starts-with(@attribute,'value')"));
		driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]"));   //first name
		
		//13.xpath by Logical operator==>and
		driver.findElement(By.xpath("//tagname[@attribute1='value1' and @attribute2='value2']"));
		driver.findElement(By.xpath("//input[@type='text' and @name='firstname']"));
		
		//14.xpath by logical operator==>or
		driver.findElement(By.xpath("//tagname[@attribute1='value1'or @attributr2='value2']"));
		driver.findElement(By.xpath("//input[@id='u_0_b_Af' or @name='firstname']"));
		
		//Locators by css selectors
		
		//15.css==>tag and id ==>tag#id
		driver.findElement(By.cssSelector("tag#id"));
		driver.findElement(By.xpath("input#email"));
		
		//16.css==>tag and class==>tag.class
		driver.findElement(By.cssSelector("tag.class"));
		driver.findElement(By.cssSelector("input.inputtext"));
		
		//17.css==>tag and attribute ==>tagname[attribute=value]
		driver.findElement(By.cssSelector("tagname[attribute=value]"));
		driver.findElement(By.cssSelector("input[name=email]"));
		
		//18.css==>tag,class and attribute ==>tagname.classname[attribute=value]
		driver.findElement(By.cssSelector("tagname,classname[attribute=value]"));
		driver.findElement(By.cssSelector("input.inputtext[name=email]"));
		
	}
}
