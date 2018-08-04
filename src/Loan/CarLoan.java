package Loan;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.reports.ListenersTestNG;

@Listeners(ListenersTestNG.class)
public class CarLoan {

	WebDriver driver;

	@Parameters({ "URL" })
	@BeforeTest
	public void setUpTest(String urlname)

	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohsin\\Dheeru\\Work\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(urlname);

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}

	@Parameters({ "username", "password" })
	@Test
	public void cartitle(String username, String password) {
		
		Assert.assertEquals(false, true);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println("carCheckTitle");
		System.out.println("carCheckTitle: " + driver.getTitle());
	}

	@Test
	public void CarLogInTest() {

				
		System.out.println("CarLogInTest");
		System.out.println("CarLogInTest: " + driver.getTitle());
	}

	@Test
	public void carWheel() {
		
		System.out.println("4 Wheel");

	}

	@Test
	public void carEngine() {

		System.out.println("4 Strock engine");

	}

	@AfterTest
	public void tearown() {
		driver.close();
	}
}
