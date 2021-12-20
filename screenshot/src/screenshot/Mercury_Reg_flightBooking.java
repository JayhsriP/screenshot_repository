package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils; 
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mercury_Reg_flightBooking {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Java_class\\Testing\\chromedriver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		d.get("http://demo.guru99.com/test/newtours/");
		
		d.manage().window().maximize();
		d.findElement(By.linkText("REGISTER")).click();
		
		
		  File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src,new File("C:\\Users\\User\\Desktop\\Java_class\\Testing\\Screenshot_capture\\MercuryRegflightB\\beforereg.png" ));
		 
		///fill form
		d.findElement(By.cssSelector("input[name=\"firstName\"]")).sendKeys("Aradhana");
		d.findElement(By.cssSelector("input[name=\"lastName\"]")).sendKeys("Despande");
		d.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys("9090909090");
				
		d.findElement(By.cssSelector("input[id=\"userName\"]")).sendKeys("abc@gmail.com");
		d.findElement(By.name("address1")).sendKeys("sjfh");
		d.findElement(By.name("city")).sendKeys("Mumbai");
		d.findElement(By.name("state")).sendKeys("mah");
		d.findElement(By.name("postalCode")).sendKeys("234434");
		WebElement s=d.findElement(By.cssSelector("select[name=\"country\"]"));
		
		Select sel=new Select(s);
		sel.selectByVisibleText("INDIA");
		
		d.findElement(By.id("email")).sendKeys("abc");
		d.findElement(By.name("password")).sendKeys("123");
		d.findElement(By.name("confirmPassword")).sendKeys("123");
		
		File src2=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src2,new File("C:\\Users\\User\\Desktop\\Java_class\\Testing\\Screenshot_capture\\MercuryRegflightB\\registrationform.png" ));
		
		  d.findElement(By.cssSelector("input[name=\"submit\"]")).click();
		
		Thread.sleep(2000);
		File src1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("C:\\Users\\User\\Desktop\\Java_class\\Testing\\Screenshot_capture\\MercuryRegflightB\\afterreg.png" ));
		 
		
		//flight hypertext
		
		d.findElement(By.linkText("Flights")).click();
		
		WebElement fromport=d.findElement(By.cssSelector("select[name=\"fromPort\"]"));
		
		Select slfrom=new Select(fromport);
		
		slfrom.selectByIndex(5);
		
		
		
		WebElement toport=d.findElement(By.cssSelector("select[name=\"toPort\"]"));
		
		Select slto=new Select( toport);
		
		slto.selectByIndex(3);
		
		d.findElement(By.cssSelector("input[value=\"First\"]")).click();
		
		
		WebElement airline=d.findElement(By.cssSelector("select[name=\"airline\"]"));
		
		Select slairline=new Select(airline);
		
		slairline.selectByIndex(1);
		
		File src3=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3,new File("C:\\Users\\User\\Desktop\\Java_class\\Testing\\Screenshot_capture\\MercuryRegflightB\\flightdetails.png"));
		
		
		
		d.findElement(By.name("findFlights")).click();
		
		File src4=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src4, new File("C:\\Users\\User\\Desktop\\Java_class\\Testing\\Screenshot_capture\\MercuryRegflightB\\flightdetails.png\\complete.png"));

	}

}
