package MFMP;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class MFMPTimeslotTestCase {

WebDriver driver;
@BeforeTest

public void Login() throws InterruptedException {
   driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://tsitfilemanager.in/saran/mfmp_development/");
   
   driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("9585916471");
   driver.findElement(By.xpath("//input[@placeholder='Enter OTP']")).sendKeys("1234");
   driver.findElement(By.xpath("//button[text()='Login']")).click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//a[@class='nav-link']/../..//a[text()='Time Slot']")).click();
   Thread.sleep(2000);
 }

@Test(priority = 1)

public void StatedropDown () throws InterruptedException {
	
	System.out.println("=================== StatedropDown=======================");
	
	// TC1: Check that the statedropdown field  is displayed
   
	WebElement dropdown = driver.findElement(By.xpath("(//select[@class='form-select'])[1]"));

	System.out.println("TC1 - TodayOrder dropdown displayed: " +
	        (dropdown.isDisplayed() ? "PASS" : "FAIL"));

	
  // TC2: Verify clickability
	driver.findElement(By.xpath("(//select[@class='form-select'])[1]")).click();
   System.out.println("TC2 - Clickable: " + (dropdown.isEnabled() ? "PASS" : "FAIL"));
   Thread.sleep(2000);
   
   // TC3: Verify dropdown opens and options are displayed
   WebElement dropdownElem = driver.findElement(By.xpath("(//select[@class='form-select'])[1]"));
   dropdownElem.click(); 
   Thread.sleep(2000);
   
			driver.findElement(By.xpath("//option[text()='TamilNadu'][1]")).click();
	Thread.sleep(2000);

   List<WebElement> options = driver.findElements(By.xpath("(//select[@class='form-select'])[1]/option"));
   
	driver.findElement(By.xpath("//option[text()='TamilNadu'][1]")).click();


   if (options.size() > 1) {
       System.out.println("TC3 - List displayed and value selected: PASS");
   } else {
       System.out.println("TC3 - List displayed and value selected: FAIL");
   }

}

@Test(priority = 2) 

public void districtdropDown () throws InterruptedException {
  
  System.out.println("=============districtdropDown=============");
	
	// TC1: Check that the districtdropdown field  is displayed
   
	WebElement dropdown = driver.findElement(By.xpath("(//select[@class='form-select'])[2]"));

	System.out.println("TC1 - district dropdown displayed: " +
	        (dropdown.isDisplayed() ? "PASS" : "FAIL"));

	
   // TC2: Verify clickability
	driver.findElement(By.xpath("(//select[@class='form-select'])[2]")).click();
   System.out.println("TC2 - Clickable: " + (dropdown.isEnabled() ? "PASS" : "FAIL"));
   Thread.sleep(2000);
   
   // TC3: Verify dropdown opens and options are displayed
   WebElement dropdownElem = driver.findElement(By.xpath("(//select[@class='form-select'])[2]"));
   dropdownElem.click(); 
   Thread.sleep(2000);
   
			driver.findElement(By.xpath("//option[text()='Chennai']")).click();
	Thread.sleep(2000);

   List<WebElement> options = driver.findElements(By.xpath("(//select[@class='form-select'])[2]/option"));
   
	driver.findElement(By.xpath("//option[text()='Chennai']")).click();


   if (options.size() > 1) {
       System.out.println("TC3 - List displayed and value selected: PASS");
   } else {
       System.out.println("TC3 - List displayed and value selected: FAIL");
   }
   Thread.sleep(2000);

}

@Test (priority = 3)

public void RestaurentdropDown () throws InterruptedException {
  
  System.out.println("=============RestaurentdropDown=============");
	
	// TC1: Check that the RestaurentdropDown field  is displayed
   
	WebElement dropdown = driver.findElement(By.xpath("(//select[@class='form-select'])[3]"));

	System.out.println("TC1 - Restaurent dropdown displayed: " +
	        (dropdown.isDisplayed() ? "PASS" : "FAIL"));

	
   // TC2: Verify clickability
	driver.findElement(By.xpath("(//select[@class='form-select'])[3]")).click();
   System.out.println("TC2 - Clickable: " + (dropdown.isEnabled() ? "PASS" : "FAIL"));
   Thread.sleep(2000);
   
   // TC3: Verify dropdown opens and options are displayed
   WebElement dropdownElem = driver.findElement(By.xpath("(//select[@class='form-select'])[3]"));
   dropdownElem.click(); 
   Thread.sleep(2000);
   
			driver.findElement(By.xpath("//option[text()='Chennai food']")).click();
	Thread.sleep(2000);

   List<WebElement> options = driver.findElements(By.xpath("(//select[@class='form-select'])[3]/option"));
   
	driver.findElement(By.xpath("//option[text()='Chennai food']")).click();


   if (options.size() > 1) {
       System.out.println("TC3 - List displayed and value selected: PASS");
   } else {
       System.out.println("TC3 -List displayed and value selected: FAIL");
   }

}

@Test(priority = 4)
public void Timeslotbutton () throws InterruptedException {
  
  System.out.println("=============Timeslotbutton=============");
	

	WebElement addMenuBtn = driver.findElement(By.xpath("//button[text()='Add Slot']"));

	//TC1
	System.out.println("TC1 - Addmenu button is visible: " +
	        (addMenuBtn.isDisplayed() ? "PASS" : "FAIL"));
	
	
	// TC2: Employee button is enabled/clickable
	
  System.out.println("TC2 - Create Employee enabled/clickable: " +
          (addMenuBtn.isEnabled() ? "PASS" : "FAIL"));

  driver.findElement(By.xpath("//button[text()='Add Slot']")).click();

}
@Test(priority = 5)

public void StatedropDown1 () throws InterruptedException {
  
  System.out.println("================statedropDown=================");
	
	// TC1: Check that the statedropdown field  is displayed
  
	WebElement dropdown = driver.findElement(By.xpath("(//select[@class='form-select'])[1]"));

	System.out.println("TC1 - TodayOrder dropdown displayed: " +
	        (dropdown.isDisplayed() ? "PASS" : "FAIL"));

	
  // TC2: Verify clickability
	driver.findElement(By.xpath("(//select[@class='form-select'])[1]")).click();
  System.out.println("TC2 - Clickable: " + (dropdown.isEnabled() ? "PASS" : "FAIL"));
  
  // TC3: Verify dropdown opens and options are displayed
  WebElement dropdownElem = driver.findElement(By.xpath("(//select[@class='form-select'])[1]"));
  dropdownElem.click(); 
  Thread.sleep(2000);
  
			driver.findElement(By.xpath("//option[text()='TamilNadu'][1]")).click();
	Thread.sleep(2000);

  List<WebElement> options = driver.findElements(By.xpath("(//select[@class='form-select'])[1]/option"));
  
	driver.findElement(By.xpath("//option[text()='TamilNadu'][1]")).click();


  if (options.size() > 1) {
      System.out.println("TC3 - List displayed and value selected: PASS");
  } else {
      System.out.println("TC3 - List displayed and value selected: FAIL");
  }

}

@Test(priority = 6) 

public void districtdropDown1 () throws InterruptedException {
 
 System.out.println("================districtdropDown=================");
	
	// TC1: Check that the districtdropdown field  is displayed
  
	WebElement dropdown = driver.findElement(By.xpath("(//select[@class='form-select'])[2]"));

	System.out.println("TC1 - district dropdown displayed: " +
	        (dropdown.isDisplayed() ? "PASS" : "FAIL"));

	
   // TC2: Verify clickability
	driver.findElement(By.xpath("(//select[@class='form-select'])[2]")).click();
  System.out.println("TC2 - Clickable: " + (dropdown.isEnabled() ? "PASS" : "FAIL"));
  
  // TC3: Verify dropdown opens and options are displayed
  WebElement dropdownElem = driver.findElement(By.xpath("(//select[@class='form-select'])[2]"));
  dropdownElem.click(); 
  Thread.sleep(2000);
  
			driver.findElement(By.xpath("//option[text()='Chennai']")).click();
	Thread.sleep(2000);

  List<WebElement> options = driver.findElements(By.xpath("(//select[@class='form-select'])[2]/option"));
  
	driver.findElement(By.xpath("//option[text()='Chennai']")).click();


  if (options.size() > 1) {
      System.out.println("TC3 - List displayed and value selected: PASS");
  } else {
      System.out.println("TC3 - List displayed and value selected: FAIL");
  }
  Thread.sleep(2000);

}

@Test (priority = 7)

public void RestaurentdropDown1 () throws InterruptedException {
 
 System.out.println("================RestaurentdropDown=================");
	
	// TC1: Check that the RestaurentdropDown field  is displayed
  
	WebElement dropdown = driver.findElement(By.xpath("(//select[@class='form-select'])[3]"));

	System.out.println("TC1 - Restaurent dropdown displayed: " +
	        (dropdown.isDisplayed() ? "PASS" : "FAIL"));

	
   // TC2: Verify clickability
	driver.findElement(By.xpath("(//select[@class='form-select'])[3]")).click();
  System.out.println("TC2 - Clickable: " + (dropdown.isEnabled() ? "PASS" : "FAIL"));
  
  // TC3: Verify dropdown opens and options are displayed
  WebElement dropdownElem = driver.findElement(By.xpath("(//select[@class='form-select'])[3]"));
  dropdownElem.click(); 
  Thread.sleep(2000);
  
			driver.findElement(By.xpath("//option[text()='Chennai food']")).click();
	Thread.sleep(2000);

  List<WebElement> options = driver.findElements(By.xpath("(//select[@class='form-select'])[3]/option"));
  
	driver.findElement(By.xpath("//option[text()='Chennai food']")).click();


  if (options.size() > 1) {
      System.out.println("TC3 - List displayed and value selected: PASS");
  } else {
      System.out.println("TC3 -List displayed and value selected: FAIL");
  }

}

@Test(priority = 8)
public void serror() throws InterruptedException {
 driver.findElement(By.xpath("//button[text()='Submit']")).click();

}


 @Test(priority = 9)
 public void starttime() throws InterruptedException {

     System.out.println("============= Starting Time Field =================");

     WebElement startingTimeField =
             driver.findElement(By.xpath("//input[@placeholder='Select starting time']"));

     // TC1: Verify time picker opens on click
     startingTimeField.click();
     Thread.sleep(1000);

     boolean timePickerOpened =
             driver.findElements(By.xpath("//li[text()='12:00 PM']")).size() > 0;

     System.out.println("TC1 - Time picker opens on click: " +
             (timePickerOpened ? "PASS" : "FAIL"));
     
     // TC2: Select a valid time
     startingTimeField.click();
    

     driver.findElement(By.xpath("//li[text()='12:00 PM']")).click();
     Thread.sleep(500);

     String selectedTime = startingTimeField.getAttribute("value");

     System.out.println("TC2 - Selected time displayed in field: " +
             (!selectedTime.isEmpty() ? "PASS" : "FAIL"));
 }
 
 @Test(priority = 10)
 public void serror1() throws InterruptedException {
	  driver.findElement(By.xpath("//button[text()='Submit']")).click();
 
 }


@Test(priority = 11)

public void endtime () throws InterruptedException {
 
 System.out.println("============= End Time Field =================");

 WebElement EndTimeField =
	        driver.findElement(By.xpath("//input[@placeholder='Select ending time']"));
 
  

// TC1: Verify time picker opens on click
 EndTimeField.click();
Thread.sleep(1000);

boolean timePickerOpened =
       driver.findElements(By.xpath("//li")).size() > 0;

System.out.println("TC1 - Time picker opens on click: " +
       (timePickerOpened ? "PASS" : "FAIL"));


// TC2: Select a valid time (10:30 AM / 12:00 PM)
driver.findElement(By.xpath("//input[@placeholder='Select ending time']")).click();
Thread.sleep(500);

driver.findElement(By.xpath("//li[text()='6:00 PM']")).click();
Thread.sleep(500);

String selectedTime = EndTimeField.getAttribute("value");

System.out.println("TC2 - Selected time displayed in field: " +
       (!selectedTime.isEmpty() ? "PASS" : "FAIL"));


}

@Test(priority = 12)

public void submit () throws InterruptedException {
 
	System.out.println("============= Submit Button =================");

	WebElement submitBtn =
	        driver.findElement(By.xpath("//button[text()='Submit']"));


	// TC1: Verify Submit button is visible and labeled
	System.out.println("TC1 - Submit button visible & labeled: " +
	        (submitBtn.isDisplayed() && submitBtn.getText().equals("Submit")
	                ? "PASS" : "FAIL"));
	
	// TC2: Verify successful form submission with valid data
	submitBtn.click();
	Thread.sleep(2000);

	boolean confirmationShown =
	        driver.findElements(By.xpath("//*[contains(text(),'success')]")).size() > 0;

	System.out.println("TC2 - Form submitted successfully: " +
	        (confirmationShown ? "PASS" : "FAIL"));
	 driver.findElement(By.xpath("//button[text()='OK']")).click();
}
}

