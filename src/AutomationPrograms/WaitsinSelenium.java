package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsinSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
		
	 // implicit wait  ==> 95 percent
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		WebElement days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		// create the object of select class.
		Select s = new Select(days);
		s.selectByIndex(13);
		
		// explict wait ==> perticular elemet ==> higher time span ==> 5 percet
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		//1st approch
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='login']"))).click();
		
//		//2nd approch
//		WebElement LoginBtn = driver.findElement(By.xpath("//button[@name='login']"));
//		wait.until(ExpectedConditions.elementToBeClickable(LoginBtn)).click();
		
		
		
	}
}
