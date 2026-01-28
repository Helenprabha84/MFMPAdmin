package Base;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp() throws InterruptedException {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tsitfilemanager.in/saran/mfmp_development/");

        driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("9585916471");
        driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys("1234");
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Thread.sleep(2000);

      
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
        
    }
}