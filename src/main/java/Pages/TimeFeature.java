package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeFeature {
	
	
	
	WebDriver driver;
	By Clock =By.xpath("");
	
	
	public TimeFeature() {
		
		driver=new ChromeDriver();
		
	}
	
	

	public void correctTime() {
		
		
		
		System.out.println("Time  is ="+ "10:00 Am");
	}
	

}


