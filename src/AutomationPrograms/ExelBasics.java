package AutomationPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelBasics {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
		FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExelData.xlsx");
		String username1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(username1);
		username.sendKeys(username1);
		System.out.println(username1);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		
		FileInputStream file1=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExelData.xlsx");
		String password1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		password.sendKeys(password1);
		System.out.println(password1);
		
		
		
		
		
		
	}
}
