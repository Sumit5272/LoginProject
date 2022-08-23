package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignuppageAutomateAssignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//click on signup
		WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
		signup.click();
		
		//sendkey==>text field
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Sumit");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Khairnar");
		
		WebElement monooremail = driver.findElement(By.xpath("//input[@name='reg_email__' or @id='u_0_g_XK']"));
		monooremail.sendKeys("8975271924");
		
		WebElement newpassword = driver.findElement(By.xpath("//input[@type='password']"));
		newpassword.sendKeys("Sumit@123");
		
		//is selected
		WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
		male.click();
		
		System.out.println(male.isSelected());
		if(male.isSelected()==true) {
			System.out.println("male radio button is selected");
		}
		else {
			System.out.println("male radio button is not selected");
		}
		
		
	}
}
