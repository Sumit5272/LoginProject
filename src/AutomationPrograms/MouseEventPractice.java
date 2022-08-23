package AutomationPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventPractice {  //Action class

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// 1. hover to the element ==> move to the element
//				driver.get("https://www.next.co.uk/");
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		        driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']/button")).click();
//		        List<WebElement> links = driver.findElements(By.xpath("//ul[@id='snail-trail-container']/li/a"));
//		      
//		        //for(int i=0;i<links.size();i++) {
//		    	 for(int i=0;i<=10;i++) {
//		    	   WebElement link = links.get(i);
//		    	   Actions action=new Actions(driver);
//		    	   action.moveToElement(link).build().perform();
//		    	   //action.build().perform();
//		    	   System.out.println(link.getText());
//		    	   Thread.sleep(2000);
//		       }
		
		    	// 2. How to handle resizable items
//		         driver.get("https://jqueryui.com/resizable/");
//		         driver.manage().window().maximize();
//		         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		         WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));		        driver.switchTo().frame(frame);
//		         WebElement resizable = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
//		         Thread.sleep(5000);
//		         Actions action=new Actions(driver);
//		         action.dragAndDropBy(resizable, 20, 20).build().perform();
		         
	           //3. Drag and Drop
//		         driver.get("https://jqueryui.com/droppable/");
//		         driver.manage().window().maximize();
//		         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		         WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//		         driver.switchTo().frame(frame);
//		         WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		         WebElement dropable = driver.findElement(By.xpath("//div[@id='droppable']"));
//		         Thread.sleep(2000);
//		         Actions action =new Actions(driver);
//		         action.dragAndDrop(draggable, dropable).build().perform();
		
		       //4.Draggable
//		          driver.get("https://jqueryui.com/draggable/");
//	            driver.manage().window().maximize();
//	            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	            WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//	            driver.switchTo().frame(frame);
//	            WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//	            Thread.sleep(2000);
//		          Actions action =new Actions(driver);
//		          action.dragAndDropBy(draggable, 50, 50).build().perform();
		
		        //5.Right click
		         
//		          driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//		          driver.manage().window().maximize();
//	            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		          WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//		          Actions action =new Actions(driver);
//		          action.contextClick(image).build().perform();
		        
		        //6.left click:-click
		
//		         driver.get("http://deluxe-menu.com/popup-mode-sample.html");
//	           driver.manage().window().maximize();
//	           driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	           WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
//	           Actions action =new Actions(driver);
//	           action.click(image).build().perform();
		
		       //7.Sendkeys():-with the help of action class
		
		        driver.get("https://www.facebook.com/login/");
		        driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		        WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		        WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		        Actions action =new Actions(driver);
		        action.sendKeys(username, "Sumit").build().perform();
		        //action.keyDown(password, Keys.SHIFT).sendKeys("sumit").keyUp(Keys.SHIFT).build().perform();
		        action.sendKeys(password,"Sumit@1234").build().perform();
		        driver.close();
		    
		
		
		
		
		
		
		
		}
	
}
