import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testClass {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver","E:\\software testing\\geckodriver.exe" );

		driver= new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/");

		WebElement username=driver.findElement(By.xpath("// input[@ id='email']"));
		
		username.click(); //used for click on username
		
		username.sendKeys("sayali.nisal.5");// used for pass the value
		
		Thread.sleep(1000);

        
		WebElement password=driver.findElement(By.xpath("//  input[@ id='pass']"));
		
		password.click(); //used for open password field

		password.sendKeys("sayali139"); // used for pass the string value
		  
		
		
		WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
	
		login.click();
		
		WebElement stories=driver.findElement(By.xpath("//span[@class='_2ms2']"));
		
		String actualtext=stories.getText();
		
		System.out.println(actualtext);
		
		
		WebElement findfriends=driver.findElement(By.xpath("//a[@id='findFriendsNav']"));
		findfriends.click();
		
		
		WebElement label=driver.findElement(By.xpath("//div[@id='userNavigationLabel']"));
		label.click();
		
		Thread.sleep(5000);

		WebElement logout=driver.findElement(By.xpath("//span[contains(text(),'Log Out')]"));
		
		logout.click();
		
		
		
	


	}

}