package AutomationPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//1.senkeys()==>text field=>data pass
		
//		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));  //1st way prefared
//		username.sendKeys("30AprilFacebookAccount");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Sumit@123");   //2nd way
		
		//2.click()-clicking==>button/radiobutton/checkbox/link
//		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		loginBtn.click();
		
		//3.isEnable()-state of the element
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println(username.isEnabled());
		
		if(username.isEnabled()==true) {
			System.out.println("username field is enable");
		}
		else {
			System.out.println("username field is disable");
		}
		
		//4.isDisplay()
		WebElement FBLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		if(FBLogo.isDisplayed()==true) {
			System.out.println("FB logo is displayed");
		}
		else {
			System.out.println("FB logo is not displayed");
		}
		
		//5.isSelected()-chechbox and radiobutton
//	    WebElement signup = driver.findElement(By.xpath("//a[text()='Sign Up']"));
//		signup.click();
		
//		WebElement womanradioBtn = driver.findElement(By.xpath("//input[@value='1']"));
//		womanradioBtn.click();
		
//		if(womanradioBtn.isSelected()==true ) {
//			System.out.println("woman radio button is selected");
//		}
//		else {
//			System.out.println("woman radio button is not selected");
//		}
		
		//6.getText()
		WebElement tagline = driver.findElement(By.xpath("//h2[starts-with(text(),'Facebook help')]"));
		String ActualString=tagline.getText();
		
		String expectedstring="Facebook helps you connect and share with the people in your life.";
		
		if(ActualString.equals(expectedstring)) {
			System.out.println("testcase is passed");
		}
		else {
			System.out.println("testcase is failed");
		}
		
		//7.get attribute-method is used to get the attribute value of any element
		WebElement username1 = driver.findElement(By.xpath("//input[@id='email']"));
		
		System.out.println(username1.getAttribute("data-testid"));
		
		
		
		
	}
}
