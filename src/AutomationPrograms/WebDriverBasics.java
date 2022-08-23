package AutomationPrograms;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//1.To launch the Browser
		
		WebDriver driver=new ChromeDriver();
		
		//2.launch the url==>get
		driver.get("https://www.facebook.com/");
		
		//3.close the browser==>close the current tab
		//driver.close();
		
		//4.quit()==>close the browser=>all the tab are closed
		//driver.quit();
		
		
		//5.getcurrenturl():-browser currently which url hit	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//6.getTitle();
		String title = driver.getTitle();
		System.out.println(title);
		
		//7.Maximize==>this method will be use to maximize browser
		driver.manage().window().maximize();
		
		//8.Navigate:-get==>url hit
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//9.setsize==>setsize();
		Dimension d=new Dimension(50,100);
		driver.manage().window().setSize(d);
		
		//10.setposition
		Point p=new Point(5,5);
		driver.manage().window().setPosition(p);
		
		
	}
}
