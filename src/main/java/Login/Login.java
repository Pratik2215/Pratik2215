package Login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.online.HttpClient;

public class Login {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
       
		
		WebDriverManager.chromedriver().setup();
		
	     WebDriver driver = new ChromeDriver();
	     //WebDriverManager.chromedriver().setup(;)
	     
	     
	  // Maximize the browser
	     driver.manage().window().maximize();

	     // Launch Website
	     driver.get("https://stage.everydayheroessrd.info");
	     
	     // For Inserting Server Credentials and Login to the Website 
	     StringSelection sel=new StringSelection("Organised_P");
	     Clipboard clip= Toolkit.getDefaultToolkit().getSystemClipboard();
	     clip.setContents(sel, null);
	     
	     
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(300);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		StringSelection sel1=new StringSelection("Khjdgf^fdgs$");
		 Clipboard clip1= Toolkit.getDefaultToolkit().getSystemClipboard();
	     clip.setContents(sel1, null);
	     
	     robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(300);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
			
			
			//(//*[@class='Sidebar_link__QeUgb'])[1]
			
			
			Thread.sleep(2800);
			
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/button[2]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@class='px-5 py-4 flex flex-col gap-y-3 w-full']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='radix-:r6:-trigger-account']")).click();
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/button[1]")).click();
			
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormUsername']")).click();
			
			driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormUsername']")).sendKeys("stage15@yopmail.com");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormPassword']")).click();
			
			driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//form[@name='cognitoSignInForm']//div//input[@id='signInFormPassword']")).sendKeys("Test@1234");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[@class='modal-content background-customizable modal-content-mobile visible-md visible-lg']//div[@class='modal-body']//div//div//div//div//input[@name='signInSubmitButton']")).click();
			
			
		    Thread.sleep(2000);
		    
		    driver.findElement(By.xpath("//span[@class='__className_15c4b3 text-white text-")).click();
		    
		    Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("//a[@class='text-primary-blue bmob:text-white']//*[name()='svg']")).click();
		    
		    driver.findElement(By.xpath("//input[@name='pronouns']")).clear();
		    
		    driver.findElement(By.xpath("//input[@name='pronouns']")).sendKeys("Him");
		    
		    driver.findElement(By.xpath("//button[normalize-space()='Update Profile']")).click();
		    
		    Thread.sleep(2000);
		    
		    
		   driver.findElement(By.xpath("//span[@class='__className_072d70 text-primary-red']")).click();
		   
		   driver.findElement(By.xpath("//input[@placeholder='Game Title']")).sendKeys("Test Purpose Game1");
		   
		   
		   
		
	}

}
