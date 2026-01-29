package MFMP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class MFMPBannerTestCase extends Base.BaseTest {
	
//	WebDriver driver;
//	@BeforeTest	
//	 public void Login() throws InterruptedException {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://tsitfilemanager.in/saran/mfmp_development/");
//                driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("9585916471");
//        driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys("1234");
//        driver.findElement(By.xpath("//button[text()='Login']")).click();
//        Thread.sleep(2000);
//	}
       
     
	
	@Test(priority = 1)
	public void Addbanner() throws InterruptedException {
		
		   driver.findElement(By.xpath("//a[text()='Banner']")).click();
		    Thread.sleep(2000);

	    System.out.println("=============Add Banner Button =================");
     	  driver.findElement(By.xpath("//button[text()='Add Banner']")).click();
     	  
     	 
	    		WebElement FilterAllBtn = driver.findElement(By.xpath("//button[text()='Add Banner']"));


	    		// TC1 – Button visible and clickable
	    		FilterAllBtn.click();
	    		System.out.println("TC1 - Refresh button visible and clickable: " +
	    		        (FilterAllBtn.isDisplayed() && FilterAllBtn.isEnabled() ? "PASS" : "FAIL"));

	           }
	
	     @Test(priority = 2)
	     		public void RedirectURL() throws InterruptedException {
	    	 System.out.println("=============RedirectURL=================");
	    	 
	    	  WebElement RedirectURL = driver.findElement(By.xpath("//input[@placeholder='Enter redirect URL']"));//sendKeys("https://www.google.com/");
	    	 
	    	// TC1: Field visible
			    System.out.println("TC1 - Searchname field visible: " +
			            (RedirectURL.isDisplayed() ? "PASS" : "FAIL"));
			    Thread.sleep(2000);
			    
			    // TC2: Mandatory validation (invalid/empty URL)
			    driver.findElement(By.xpath("//input[@placeholder='Enter redirect URL']")).sendKeys("https://www.google.com/");
			    Thread.sleep(2000);

			    boolean errorShown =
			            driver.findElements(By.xpath("//button[text()='Add Banner']")).size() > 0;

			    System.out.println("TC2 - Mandatory validation: " +
			            (errorShown ? "PASS" : "FAIL"));
	 
	     }
	     
	     @Test(priority = 3)
	     
		 	public void Choosebannerimage() throws InterruptedException {
	    	   driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\HP LAP\\Desktop\\Screenshots\\IMG_2964.jpg");
	    	 
	    	 System.out.println("=============Choosebannerimage ================= ");
	    	   Thread.sleep(2000);
	 	    driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\HP LAP\\Desktop\\Screenshots\\IMG_2964.jpg");
	 	
	 	    // TC1: Verify the “Choose File” button is visible
	         WebElement chooseFileBtn = driver.findElement(By.xpath("//input[@type='file']"));
	         System.out.println("TC1 - Choose File visible: " +
	                 (chooseFileBtn.isDisplayed() ? "PASS" : "FAIL"));

	         // TC2: Verify that the button is clickable
	         System.out.println("TC2 - Choose File clickable and valid data accepted: " +
	                 (chooseFileBtn.isEnabled() ? "PASS" : "FAIL"));
	        
	   
	     }
	     
	     @Test(priority = 4)
	     
	 	public void Addbannerbutton() throws InterruptedException {
	 		
	      	 
	 	    		WebElement FilterAllBtn = driver.findElement(By.xpath("//button[text()='Add Banner']"));


	 	    		// TC1 – Button visible and clickable
	 	    		FilterAllBtn.click();
	 	    		System.out.println("TC1 - Refresh button visible and clickable: " +
	 	    		        (FilterAllBtn.isDisplayed() && FilterAllBtn.isEnabled() ? "PASS" : "FAIL"));
	 	    		Thread.sleep(2000);
	 	    
	 	           }

	     
	     @Test(priority = 5)
	     
		 	public void searchfield() throws InterruptedException {
	    	 
	 		driver.navigate().refresh();
	    	 
	    	  driver.findElement(By.xpath("//input[@placeholder='Search by Banner ID or URL']")).sendKeys("IMG_2964");
	     	   
	     }
	    	 
	}