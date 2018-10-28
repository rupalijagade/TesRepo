import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginBypassparameter {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","E:\\software testing\\geckodriver.exe" );

		driver= new FirefoxDriver();

		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		
		Loginapp("ABC","PASSWORD");
		Loginapp("XYZ","PASS");
		
			}

	private static void Loginapp(String string, String string2) throws InterruptedException {
		

		WebElement username1=driver.findElement(By.xpath("// input[@ id='email']"));
		username1.sendKeys("sayali.nisal.5");// used for pass the value

		Thread.sleep(1000);

		WebElement password2=driver.findElement(By.xpath("//  input[@ id='pass']"));
        password2.sendKeys("sayali139"); // used for pass the string value
        
        WebElement login=driver.findElement(By.xpath("//input[@type='submit']"));
    	login.click();
			
	}

}
