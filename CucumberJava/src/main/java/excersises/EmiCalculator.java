package excersises;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EmiCalculator {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement loansliderCircle = driver.findElement(By.cssSelector("#loanamountslider >span"));
		WebElement interestsliderCircle = driver.findElement(By.cssSelector("#loaninterestslider >span"));
		WebElement tenuresliderCircle = driver.findElement(By.cssSelector("#loantermslider >span"));
		actions.dragAndDropBy(loansliderCircle, 80, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(tenuresliderCircle, -107, 0).build().perform();
		Thread.sleep(2000);
		actions.dragAndDropBy(interestsliderCircle, 150, 0).build().perform();
		Thread.sleep(2000);	
	}

}
