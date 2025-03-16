package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class scp1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//driver.manage().wait(20);
		String st1= driver.getTitle();
		System.out.println(st1);
		Thread.sleep(2000);
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(2000);
		String st2= driver.getTitle();
		System.out.println(st2);
		Thread.sleep(2000);
		
		
		File Dpath = new File("C:/Users/prudh/Downloads/new01.png");
		TakesScreenshot ss = ((TakesScreenshot)driver);
		File scrfile = ss.getScreenshotAs(OutputType.FILE);
		
		Thread.sleep(2000);
		String ss1 = "scrfile.png";
		String filepath = "C:/Users/prudh/Downloads";
		Thread.sleep(2000);
		//		File ddstfile = new File(ss1+filepath);
//		scrfile.renameTo(ddstfile);
		FileUtils.copyFile(scrfile, Dpath);
		Thread.sleep(2000);
		System.out.println("screenshot succe");
		Thread.sleep(2000);
		
		JavascriptExecutor jsq = (JavascriptExecutor) driver;
		jsq.executeScript("window.scrollBy(0,1000)");
		File Dpath1 = new File("C:/Users/prudh/Downloads/new02.png");
		TakesScreenshot s1 = ((TakesScreenshot)driver);
		File scrfile1 = s1.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		String ss2 = "scrfile.png";
		String filepath1 = "C:/Users/prudh/Downloads";
		Thread.sleep(2000);
		//		File ddstfile = new File(ss1+filepath);
//		scrfile.renameTo(ddstfile);
		FileUtils.copyFile(scrfile1, Dpath1);
		Thread.sleep(2000);
		driver.quit();
		
	}

}
