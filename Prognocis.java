import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prognocis {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://qalinuxj11.prognocis.com/prognocis/scrSupportLogin.jsp?clinic=patch_v3b4emr_j11");
		Thread.sleep(2000);
		
		WebElement userId = driver.findElement(By.id("username"));
		userId.sendKeys("shashikant.kamthekar@bizmaticsinc.com");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Cell@123");
		driver.findElement(By.id("login")).click();

		
	


	}
}
