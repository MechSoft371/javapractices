package tpage;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test(priority=1,dataProvider="dp")
	void testlogin(String username, String password) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//String pagetitle="My Account";
		
		
	}
	@Test(priority=2,dataProvider="dp")
	void verfiytitle(String password) {
		
		String pagetitle="My Account";
		String currenttitle = driver.getTitle();
		
		SoftAssert st=new SoftAssert();	
		st.assertEquals(currenttitle, pagetitle, currenttitle);
		System.out.println(password);
	}
	@Test(priority=3)
	void verfiyurl() {
		
		String currenturl = driver.getCurrentUrl();
		
		System.out.println("test the url");
	}
	
	
	
	@AfterClass
	void teardown() {
		driver.quit();
		
	}
	
	
	
	@DataProvider(name="dp")
	Object testdata() 
	{
		Object data[][]= {
				{"testtestyop.com","hllo123"},
				{"testtestyop","ello@33"},
				{"testtestyopmeil@yopmail.com","Hello123"},
				{"testtestyopmeil@yopmail.com","ewrwe"},
				{"testtestyopmeil@yopmail.com", "Hello123"},
				};
		return data;
		
	}

}
