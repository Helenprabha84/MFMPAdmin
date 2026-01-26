package MFMP;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.BaseTest;

public class MFMPTimeSlot extends BaseTest{

	
	
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
        List<WebElement> options = driver.findElements(By.xpath("(//select[@class='form-select'])[1]/option"));
        
		driver.findElement(By.xpath("//option[text()='TamilNadu'][1]")).click();


        if (options.size() > 1) {
            System.out.println("TC3 - List displayed and value selected: PASS");
        } 
        else 
        {
            System.out.println("TC3 - List displayed and value selected: FAIL");
        }

	}
	
}