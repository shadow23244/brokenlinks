package a123;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//List<WebElement> all = driver.findElements(By.xpath("//div[@class='_37M3Pb']"));
		
		//for(WebElement a : all)
		//{
		//	System.out.println(a.getText());
		//}
		
		for(int i=1; i<=10; i++)
		{
			WebElement a = driver.findElement(By.xpath("(//div[@class='eFQ30H'])["+i+"]"));
			System.out.println(a.getText());
			
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
