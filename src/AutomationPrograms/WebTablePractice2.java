package AutomationPrograms;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/trysql.asp?filename=trysql_select_where");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		int rows = driver.findElements(By.xpath("//table[@xclass='ws-table-all notranslate']/tbody/tr")).size();
		System.out.println(rows);
		
	    int cols=driver.findElements(By.xpath("//table[@xclass='ws-table-all notranslate']/tbody/tr[1]/td")).size();
	    System.out.println(cols);
		
		for(int r=1;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				 String value = driver.findElement(By.xpath("//table[@xclass='ws-table-all notranslate']/tbody/tr/td")).getText();
				 System.out.print(value+";");                //table[@class='NwNzde']/tbody/tr/td
			}
			System.out.println();
		}
}
}