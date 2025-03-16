package com.pracjava.jone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class blazedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com");
		Thread.sleep(3000);
		List<WebElement> fromlist = driver.findElements(By.xpath("//select[@name=\"fromPort\"]//option"));
		WebElement dp1 = driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
		List<WebElement> tolist = driver.findElements(By.xpath("//select[@name='toPort']//option"));
		WebElement dp2 = driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
		int ids;
		for(WebElement e:fromlist) {
			System.out.println(e.getText());	
			}
		for(WebElement e:tolist) {
			System.out.println(e.getText());	
			}
		Select d1=new Select(dp1);
		d1.selectByValue("Boston");
		System.out.println("clicked");
		
		Select d2=new Select(dp2);
		d2.selectByValue("Berlin");
		System.out.println("clicked");
		
		WebElement btn = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		btn.click();
		
		String expected_title="Flights from Boston to Berlin:";
		String actual_title = driver.findElement(By.xpath("//h3")).getText();
		WebElement heading = driver.findElement(By.xpath("//h3"));
		SoftAssert as=new SoftAssert();
		as.assertEquals(actual_title, expected_title, "Values do not match!");
		Assert.assertTrue(heading.isDisplayed(), "Heading is not displayed!");
		Assert.assertEquals(actual_title, expected_title);
		
		List<WebElement> t = driver.findElements(By.xpath("//table[@class='table']"));
		int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size();
		
		Array p[];
		System.out.println(rows);
		String e1 = driver.findElement(By.xpath("//table[@class='table']//tr[2]//td[6]")).getText();
		System.out.println(e1);
		 
			 
		 }

//		for (WebElement price : priceElements) {
//		    System.out.println(price.getText());  // Extract text properly
//		}
//		
//		Comparator<? super WebElement> priceElement = null;
//		priceElements.sort(priceElement);

		//System.out.println(price);		}
		
		
	}


