package AutomationPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxPractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
			Thread.sleep(2000);
			
//			WebElement days = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//	
//			//create the object of select class
//			Select s=new Select(days);
		//	
//			//1.select by index(0=>n-1)
////			s.selectByIndex(13);   //14
		//	
//			//2.select by value
////			s.selectByValue("14");
		//	
//			//3.select by visible text
////			s.selectByVisibleText("14");
		//	
//			//if you want to check all the option inside the list
//			List<WebElement> listofdays = s.getOptions();
		//	
//			System.out.println("Total number of days available:-"+listofdays.size());
		//	
//			for(int i=0;i<listofdays.size();i++) {
//				String day = listofdays.get(i).getText();
//				System.out.println(day);
//			}
		//	
//			//if you want to check default selected value
		//	
//		    String firstopt = s.getFirstSelectedOption().getText();
//		    System.out.println(firstopt);
			
			//listbox of month
			WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
			
			Select s1 = new Select(month);
//			s1.selectByIndex(10);
			
//			s1.selectByValue("6");
			
			s1.selectByVisibleText("Jun");
			
			//if you want to check all the option inside the list
			List<WebElement> listofmonth1 = s1.getOptions();
			
			System.out.println("Total number of months available:-"+listofmonth1.size());
			
			for(int i=0;i<listofmonth1.size();i++) {
				String month1 = listofmonth1.get(i).getText();
				System.out.println(month1);
			}
			
			//if you want to check default selected value
			
		    String firstopt = s1.getFirstSelectedOption().getText();
		    System.out.println(firstopt);
			
			
			//List box Of year
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			
			Select s2 = new Select(year);

			s2.selectByValue("1998");
			
			//if you want to check all the option inside the list
			List<WebElement> listofyear=s2.getOptions();
			
			System.out.println("Total number of years available:-"+listofyear.size());
			
			for(int i=0;i<listofyear.size();i++) {
				String year1 = listofyear.get(i).getText();
				System.out.println(year1);
			}
			
		//if you want to check default selected value
			
		    String firstopt1 = s2.getFirstSelectedOption().getText();
		    System.out.println(firstopt1);
			
			
			
			
		}
}
