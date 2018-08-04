package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.reports.ListenersTestNG;

@Listeners(ListenersTestNG.class)
public class FacebookLogin {
	
	WebDriver driver;
	
	@BeforeTest
	@Parameters({ "browser" })
	public void setUp(String browsername) {
		if(browsername.equals("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Mohsin\\Dheeru\\Work\\geckodriver-v0.20.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Dheeru\\Work\\chromedriver_win32\\chromedriver.exe");

			/*ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);*/
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Parameters({ "URL" })
	@Test
	public void getUrl(String urlname)

	{
		
		driver.get(urlname);

		System.out.println("Facebook Home title");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up","Title Does not match");


	}

	@Parameters({"username","password"})
	@Test
	public void logInTest(String username, String password) throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	@Test(dependsOnMethods="logInTest")
	public void logOutTest() {
				
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//div[@id='userNavigationLabel']"))).click().build().perform();
		
		
	}
		
	@AfterTest
	public void tearown() {
		driver.close();
	}

}
