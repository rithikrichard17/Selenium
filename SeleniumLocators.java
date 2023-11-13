package seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
		
		//Username box
		boolean enabled = driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println(enabled);
		
		driver.findElement(By.id("wpName2")).sendKeys("demouser");
		//Password box
		boolean displayed = driver.findElement(By.id("wpPassword2")).isDisplayed();
		System.out.println(displayed);
		
		driver.findElement(By.id("wpPassword2")).sendKeys("Welcome@123");
		
		// confirm password
		
		boolean displayed1 = driver.findElement(By.id("wpPassword2")).isDisplayed();
		System.out.println(displayed1);
		

	}

}
