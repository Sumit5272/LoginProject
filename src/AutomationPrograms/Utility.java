package AutomationPrograms;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

	//1.Drawing the border around the element
		public static void borderbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.border='3px solid red'",element);
		}
		
		//2.Capture the title of webpage
		public static String titlebyJS(WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			String title = js.executeScript("return document.title;").toString();
			return title;
		}
		
		//3.click on perticular element
		public static  void  clickbyJS(WebDriver driver,WebElement element) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].click();",element);
		}
		
		//4.generate an alert
		public static void alertbyJS(WebDriver driver,String message) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("alert('"+ message+"')");
		}
		
		//5.refreshing the page
		public static void refreshbyJS(WebDriver driver) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("history.go(0)");
		}
		
		//6.scroll down
		public static void scrolldownbyJS(WebDriver driver,int x,int y) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("scroll("+x+","+y+")");
		}
		
		//scroll up
		public static void scrollupbyJS(WebDriver driver,int x,int y) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("scroll("+x+","+y+")");
		}
		
		//scroll into view
		public static void scrollIntoView(WebDriver driver,WebElement element) {
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("arguments[0].scrollIntoView(true);",element );
		}
}
