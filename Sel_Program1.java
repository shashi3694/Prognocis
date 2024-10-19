import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Program1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		/*
		driver.get("https://qalinuxj11.prognocis.com/prognocis/scrSupportLogin.jsp?clinic=patch_v3b4emr_j11");//Copy paste URL
		Thread.sleep(2000);
		
		WebElement userId = driver.findElement(By.id("username"));
		userId.sendKeys("shashikant.kamthekar@bizmaticsinc.com");
		
		driver.findElement(By.id("password")).sendKeys("Cell@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("selUserList")).sendKeys("Kamthekar Shashi");
		driver.findElement(By.id("loginfinal")).click();	
        */
	
		/*
		driver.get("https://tutorialsninja.com/demo/");//Copy paste URL
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,'form-control input-lg')]")).sendKeys("XYZ");
		
		Thread.sleep(2000);  */
		
		Thread.sleep(2000);
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		WebElement userId =  driver.findElement(By.id("input-email"));   // Locate Web element
		userId.sendKeys("testometer12@gmail.com");   // Find Web Element
		
		// WebElement userPass = driver.findElement(By.id("input-password"));  this is also Correct done by ID
		WebElement userPass = driver.findElement(By.name("password"));
		userPass.sendKeys("testometer12");
		
		driver.findElement(By.xpath	("//input[@value='Login']")).click();
		
		driver.findElement(By.xpath("//span[@class='caret']")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
