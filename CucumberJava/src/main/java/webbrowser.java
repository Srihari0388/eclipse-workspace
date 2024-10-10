import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().window().maximize();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.id("first-name")).sendKeys("Srihari");
		driver.findElement(By.id("last-name")).sendKeys("Kolla");
		driver.findElement(By.id("postal-code")).sendKeys("523182");

		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		driver.findElement(By.id("back-to-products")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		//driver.findElement(By.className("//*[@id=\'logout_sidebar_link\']")).click();




		//WebDriver driver=new WebDriver();
		

	}

}
