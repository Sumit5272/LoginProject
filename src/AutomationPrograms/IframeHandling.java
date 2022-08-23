package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
//			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
//			driver.manage().window().maximize();
//			//implicit wait
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//	
//			driver.switchTo().frame("iframeResult");
//			  //or
////			WebElement ifa = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
////			driver.switchTo().frame(ifa);
		//	
//			WebElement clickmeBtn = driver.findElement(By.xpath("//button[text()='Click Me!']"));
//			clickmeBtn.click();
		//	
//			driver.switchTo().parentFrame();
//			   //or
////			driver.switchTo().defaultContent();
		//	
//			WebElement themeBtn = driver.findElement(By.xpath("//a[@title='Change Theme']"));
//			themeBtn.click();
		//	
		//	
			
			driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_where");
			driver.findElement(By.xpath("//button[@id='restoreDBBtn']")).click();
			driver.findElement(By.xpath("//td[text()='Customers']")).click();
			
			
		}
}
