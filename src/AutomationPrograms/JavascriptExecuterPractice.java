package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecuterPractice {

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1.Drawing the border around the element
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.switchTo().frame("iframeResult");
//		WebElement tryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].style.border='3px solid red'",tryitBtn);

		//2.Capture the title of the page
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		String title = js.executeScript("return document.title;").toString();	
//		System.out.println(title);
		
		//3. Click on perticular element. // Element.click();
		
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.switchTo().frame("iframeResult");
//		WebElement tryitBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();",tryitBtn);
		
		//4.Generate an alert.
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("alert('"+ "Login Launched Sucessfully"+"')");
		
		//5.Refreshing the page
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		Thread.sleep(3000);
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("history.go(0)");
		
		//6.Scrolling the Webpage
		  //scroll down
		
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,3500)");
		
		//scroll up
		
//		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("scroll(0,3500)");
//		Thread.sleep(3000);
//		js.executeScript("scroll(0,1000)");
		
		// scroll into view :- this will scroll upto the perticular webelement.
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement PP = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",PP );
	    PP.click();
		
		
	}
}
