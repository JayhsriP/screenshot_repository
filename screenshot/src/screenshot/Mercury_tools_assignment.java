package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury_tools_assignment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Java_class\\Testing\\chromedriver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("http://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		

		d.findElement(By.cssSelector("input[name=\"userName\"]"));
		d.findElement(By.cssSelector("input[name=\"password\"]"));
		d.findElement(By.cssSelector("input[value=\"Submit\"]")).click();
		
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\User\\Desktop\\Java_class\\Testing\\Screenshot_capture\\.mercury_login.png"));
		
		System.out.println("project finished");
		
	}

}
