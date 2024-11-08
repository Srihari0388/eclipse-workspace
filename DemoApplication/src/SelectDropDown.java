import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SelectDropDown {
//impllicitwait();
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://signon.service-now.com/");
		/*driver.get("https://demowebshop.tricentis.com/register");
		System.out.println("web page opened");
		driver.findElement(By.id("gender-male")).click();//sendKeys("Srihari");
		System.out.println("Radio button clicked");
		driver.findElement(By.name("FirstName")).sendKeys("Srihari");
		System.out.println("first  name entered");
		driver.findElement(By.name("Email")).sendKeys("sriruKla@gmail.com");
		System.out.println("email entered");
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.name("LastName")).sendKeys("Kolla");
		driver.findElement(By.name("Password")).sendKeys("123456");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
		*/
		//driver.quit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert2 = driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		alert.accept();
		
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Srihari");
		String text3 = alert3.getText();
		System.out.println(text3);
		alert.accept();
}
}