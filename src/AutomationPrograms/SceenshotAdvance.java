package AutomationPrograms;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SceenshotAdvance {

	public static WebDriver driver;
	
	   public static void getscreenshot() throws IOException {
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String Filename = d.toString().replace(" ","").replace(":","")+"jpg";
		File destination = new File("C:\\Users\\DELL\\Desktop\\Sceenshot\\Facebook"+Filename);
		FileUtils.copyFile(source, destination);
	   }
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();	
		
		    driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			getscreenshot();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
			getscreenshot();
		}
}
