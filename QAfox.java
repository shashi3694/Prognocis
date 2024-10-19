import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAfox {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		//driver.findElement(By.xpath("//input[@name='search']")).click();
		WebElement textshashi = driver.findElement(By.xpath("//input[@class='form-control input-lg']"));
		//textshashi.click();
		textshashi.sendKeys("mac");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='button' and @class='btn btn-default btn-lg']")).click();
		
		



}

}
