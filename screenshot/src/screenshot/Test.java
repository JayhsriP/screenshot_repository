package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Java_class\\Testing\\chromedriver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.facebook.com/");
		
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src,new File("C:\\Users\\User\\Desktop\\Java_class\\Testing\\Screenshot_capture\\facebooklogin.png"));
		
		m();
		                                                  
		
	}
	
	static public void m()
	{	System.out.println("OLA");
	}
	
	static public void m1()
	{
		System.out.println("This is m1 mthd");
		System.out.println("Hi there");
	}

}
