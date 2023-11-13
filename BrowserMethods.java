package seleniumscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		
		// Open the web driver
		
		WebDriver driver = new ChromeDriver();
		
		//open a website
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//to maximise
		
		driver.manage().window().maximize();
		
		// to get current url
		
		String Currenturl = driver.getCurrentUrl();
		System.out.println("the current url is :"+Currenturl);
		
		// to get page title
		
		String title = driver.getTitle();
		System.out.println("the Title is :"+title);
		
		//to find element
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a"));
		element.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		
		driver.close();
	}

}
