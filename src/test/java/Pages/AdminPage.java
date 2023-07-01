package Pages;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import base.BaseTest;

public class AdminPage extends BaseTest {
	
	public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAdminTab() throws InterruptedException {
        driver.findElement(By.xpath(loc.getProperty("AdminClick"))).click();
        System.out.println("adminclicked");
        Thread.sleep(3000);
    }

    public void clickUserManagement() {
    	List<WebElement> List1 = driver.findElements(By.className(loc.getProperty("UserMangementTab")));
    	System.out.println("lis one is"+List1);
    	List1.get(0).click();
    }

    public void clickUser() throws InterruptedException {
    	driver.findElement(By.xpath(loc.getProperty("UsersSelect"))).click();
    	Thread.sleep(3000);
    }
    
    public void clickAddBtn() throws InterruptedException {
    	driver.findElement(By.className(loc.getProperty("AddbtnClass"))).click();
    	Thread.sleep(3000);
    }

    
    public void enterUserDetails() throws InterruptedException {
    	List<WebElement> List2 = driver.findElements(By.className("oxd-select-text--arrow"));
        List2.get(0).click();
        Thread.sleep(2000);
          driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div[2]/span")).click();
//        List<WebElement> List4 = driver.findElements(By.className("oxd-select-dropdown"));
//        System.out.println("list4"+List4);
//        List4.get(1).click();
        
        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Prit dilip Nimbalk");
        Thread.sleep(2000);
        WebElement e =driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
        e.sendKeys(Keys.DOWN,Keys.RETURN);
        
        
        
        
        List2.get(1).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[2]/span")).click();
        
        List<WebElement> List3 = driver.findElements(By.className("oxd-input--active"));
        List3.get(1).sendKeys("Pritu");
        List3.get(2).sendKeys("Pritu123");
        List3.get(3).sendKeys("Pritu123");
        Thread.sleep(2000);
    }

    public void clickSaveButton() throws InterruptedException {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(2000);
    }


    public void clickLogout() {
        driver.findElement(By.className("oxd-userdropdown-name")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
    }
	
}
