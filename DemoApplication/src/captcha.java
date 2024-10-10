import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class captcha {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		ChromeDriver driver  =new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]")).click();
		//driver.findElement(By.xpath(#\33 80553)).sendKeys("W1542539");
		//driver.findElement(By.id("423077")).sendKeys("1542539");
		

	}

}
