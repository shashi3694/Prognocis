import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://practice.expandtesting.com/checkboxes");
        WebElement cb = driver.findElement(By.id("checkbox1"));
        cb.click();
        
        
        WebElement formobj = driver.findElement(By.xpath("//div[@class='form-check'][2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", formobj);
        
        Thread.sleep(1000);
        WebElement cb2 = driver.findElement(By.id("checkbox2"));
		cb2.click();
        If(cb.isEnabled()==true && cb2.isEnabled()==true);
        {
        	System.out.println("Both checkboxes are enabled");
        }
	}

}
