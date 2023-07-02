package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Buzz {
	public Buzz(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	protected WebDriver driver;
	String post = "Trying to add the new post";
	
	public void buzzsidebar() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a")).click();
		Thread.sleep(2000);
		
		
	}
	public void addpost() {
		
		driver.findElement(By.className("oxd-buzz-post-input")).sendKeys(post);
		
	}
	
	public void postbtn() throws InterruptedException {
		driver.findElement(By.className("oxd-button--main")).click();
		Thread.sleep(2000);
	}
	
	public boolean checkUpload() {
		List<WebElement> body = driver.findElements(By.className("orangehrm-buzz-post-body-text"));
		String posted = body.get(0).getText();
		System.out.println(posted);
		System.out.println(post+"***");
		if(posted.equals(post))
		{
			System.out.println("post same");
			return true;
		}
		else {
			return false;
		}
	}
	
}
