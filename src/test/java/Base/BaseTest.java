package Base;



	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseTest {

	    protected WebDriver driver;

	    @BeforeMethod
	    public void setUp() throws InterruptedException {WebDriverManager.chromedriver().setup();

	        ChromeOptions options = new ChromeOptions();
	        //options.addArguments("--headless");
	        options.addArguments("--no-sandbox");
	        options.addArguments("--disable-dev-shm-usage");

	        driver = new ChromeDriver(options);
	        
	       
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://tsitfilemanager.in/saran/mfmp_development/");
	        
	        driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("9585916471");
	        driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys("1234");
	        driver.findElement(By.xpath("//button[text()='Login']")).click();
	        Thread.sleep(2000);
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}




        