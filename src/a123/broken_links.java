package a123;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_links 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\chromedriver_win32\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		
		for(int i=0; i<=links.size()-1; i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link= new URL(url);
			
			HttpURLConnection httpcon =(HttpURLConnection) link.openConnection();
			
			Thread.sleep(3000);
			
			
			httpcon.connect();
			
			int rescode = httpcon.getResponseCode();
			
			if(rescode>400)
			{
				System.out.println("link is broken");
			}
			else
			{
				System.out.println("link is valid");
			}
		}
	}

}
