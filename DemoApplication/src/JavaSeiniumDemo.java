import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSeiniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	/*	driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]")).sendKeys("sriharibabu.kolla@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_change_login_claim\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]")).sendKeys("9030245858");
		driver.findElement(By.xpath("//*[@id=\"continue\"]/span/input")).click(); */
		
		driver.get("https://medium.com/@bilalmohd3160/mastering-api-automation-testing-with-rest-assured-a-beginners-guide-6d95a469d513");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[4]/div/div/div/div[2]/div[2]/div[1]/span/button")).click();
		
		
		//driver.findElement(By.id("lastname")).sendKeys("kolla");

		}

}