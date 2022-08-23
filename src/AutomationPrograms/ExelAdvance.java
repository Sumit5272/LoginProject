package AutomationPrograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExelAdvance {

	public static void main(String[] args) throws IOException {
		
		//data in no.of rows and one column
//		for(int i=0;i<8;i++) {
//			FileInputStream File = new FileInputStream("C:\\Users\\DELL\\Desktop\\ExelData.xlsx");
//			String value = WorkbookFactory.create(File).getSheet("Sheet2").getRow(i).getCell(0).getStringCellValue();
//			
//			System.out.println(value);	
//		}
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		ArrayList<String> al=new ArrayList<String>();
		
		for(int i=0;i<8;i++) {
			FileInputStream File=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExelData.xlsx");
			String value = WorkbookFactory.create(File).getSheet("Sheet3").getRow(i).getCell(0).getStringCellValue();
		    al.add(value);
		}
		
		for(int j=0;j<al.size();j++) {
			driver.get(al.get(j));
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
		
		
	}
}
