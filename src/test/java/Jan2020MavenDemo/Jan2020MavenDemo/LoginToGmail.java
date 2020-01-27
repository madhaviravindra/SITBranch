package Jan2020MavenDemo.Jan2020MavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginToGmail 
{
	public static WebDriver driver;

	public static void Setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\D-Drive\\Softwares\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().window().maximize();
		LoginToGmail();
		
		// here i have done some modification
	}

	public static void LoginToGmail() throws InterruptedException
	{
		driver.findElement(By.name("identifier")).sendKeys("kasaragadda.ravindrababu@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Ravindra123");
		driver.findElement(By.id("passwordNext")).click();	
		driver.close();
	}
	@Test
	public void testgmail() throws InterruptedException
	{
		Setup();
	}

}
