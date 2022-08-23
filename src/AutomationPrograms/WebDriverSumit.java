package AutomationPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSumit {

	public static void main(String[]args) {
		//browser launching
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//upcasting
		WebDriver driver=new ChromeDriver();
		
		//url launching
		driver.get("https.www.flickard.com");
		
		driver.close();
		
		driver.quit();
		
		driver.getCurrentUrl();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.getTitle();
		String title=driver.getTitle();
		System.out.println(title);
		
		//maximize
		driver.manage().window().maximize();
		
		//navigate
		driver.navigate().to("https.www.amazon.com");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//setsize
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
		
		//setposition
		Point p=new Point(200,300);
		driver.manage().window().setPosition(p);
		
		
		
		
		
	}
}
