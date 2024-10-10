import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//WebElement username= driver.findElement(By.name("username"));
		//username.isEnabled();
		//username.sendKeys("Admin");
		WebElement password= driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		

	}

}
