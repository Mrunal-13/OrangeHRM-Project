package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIMPage {
	
	private WebDriver driver;

    // Define locators for PIM page elements
    
    public PIMPage(WebDriver driver) {
        this.driver = driver;
        // Initialize locators for PIM page elements
    }
    
    // Define methods to interact with PIM page elements
    
    public void addbtn() throws InterruptedException {
    	
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
    	System.out.println("pim");
    	Thread.sleep(3000);
    	List<WebElement> Listadd = driver.findElements(By.className("oxd-topbar-body-nav-tab"));
    	System.out.println("the lst add is"+Listadd);
    	Listadd.get(2).click();
    	
    }
    
    public void addEmployee(String firstName, String MiddleName, String lastName,String empId) throws InterruptedException {
        // Implementation to add an employee using the provided details
    	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")).sendKeys(firstName);
    	driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(MiddleName);
    	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	Thread.sleep(3000);
    }

}
