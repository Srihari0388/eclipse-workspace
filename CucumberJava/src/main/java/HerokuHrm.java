import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuHrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'header\']/nav/div/div/div[2]/div/div/div[2]/a[1]")).click();
		driver.findElement(By.id("email")).sendKeys("sriharibabu.kolla@gmail.com");
		driver.findElement(By.id("password")).sendKeys("W@w1542539");
		driver.findElement(By.id("login-button")).click();
	    //webDriver email= driver.findElement(By.id("email"));
		
		
	}

}
