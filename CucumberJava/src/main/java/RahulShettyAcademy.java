import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class RahulShettyAcademy {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\BrowserDrivers\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/div[2]/a")).click();
		driver.findElement(By.id("email")).sendKeys("sriharibabu.kolla@gmail.com");
		driver.findElement(By.id("password")).sendKeys("W@w1542539");
		driver.findElement(By.xpath("/html/body/main/div/form/div[4]/input")).click();

		
		
	}

}
