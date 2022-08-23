package AutomationPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelMoreAdvance {

	public static void main(String[] args) throws IOException {
		FileInputStream File;
			File=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExelData.xlsx");
		int rowno = WorkbookFactory.create(File).getSheet("Sheet4").getLastRowNum();
		
		System.out.println("Total no of rows:-"+rowno);
		
			File=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExelData.xlsx");
		int cols = WorkbookFactory.create(File).getSheet("Sheet4").getRow(0).getLastCellNum();
		
		System.out.println("Total no of cols:-"+cols);
		
		for(int i=0;i<=rowno;i++) {
			for(int j=0;j<cols;j++) {
				
			 File=new FileInputStream("C:\\Users\\DELL\\Desktop\\ExelData.xlsx");
				String data = WorkbookFactory.create(File).getSheet("Sheet4").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+" ");
			}
			System.out.println();
		}
}}
