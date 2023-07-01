package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VacancyForm{
	
	public VacancyForm(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	protected WebDriver driver;
	
	public void fillform() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")).sendKeys("eginneer");
		
		WebElement arrow = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]"));
		arrow.click();
		Thread.sleep(3000);
		arrow.sendKeys(Keys.DOWN,Keys.RETURN);
		Thread.sleep(1000);
		String descr = "good communication skills";
		driver.findElement(By.className("oxd-textarea--active")).sendKeys(descr);
		
		//hiring manager
		WebElement hint = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div/input"));
		hint.sendKeys("a");
		Thread.sleep(2000);
		hint.sendKeys(Keys.DOWN,Keys.DOWN,Keys.RETURN);
		Thread.sleep(1000);
		//number
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input")).sendKeys("1");
		
	}
	
	public void savebtn() {
		driver.findElement(By.className("orangehrm-left-space")).click();
	}
		
	
	
	public void Success() {
		driver.findElement(By.className(null));
		
	}
}
