package Pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Punching {
		
	    	public Punching(WebDriver driver) {
	    		this.driver = driver;
	    		// TODO Auto-generated constructor stub
	    	}
	    	protected WebDriver driver;
	    	public String text;
	        public void visitdashboard() throws InterruptedException {
	        	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")).click();

//		        WebElement Dashboard = driver.findElement(By.className("oxd-text oxd-text--span oxd-main-menu-item--name"));
//		        Dashboard.click();
		        Thread.sleep(2000);
		        text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div[2]/p[1]")).getText();
	        	
	        }
	        
	        public void clickclock() throws InterruptedException {
	        	WebElement Punchedin = driver.findElement(By.className("bi-stopwatch"));
		        Punchedin .click();
		        Thread.sleep(2000);
	        }
	        
	        public void punchcheck() throws InterruptedException {
	        	
	        	
	        	if(text=="Punched Out")
	        		
	        	{
	        		String tntext="I have reached";
	        		driver.findElement(By.className("oxd-textarea")).sendKeys(tntext);
	        		WebElement In = driver.findElement(By.className("orangehrm-left-space"));
	    	        In.click();
	    	        Thread.sleep(2000);
	    	        String outtext="I have punchedout";
	        		driver.findElement(By.className("oxd-textarea")).sendKeys(outtext);
	        		 WebElement out= driver.findElement(By.className("orangehrm-left-space"));
	     	         out.click();
	        	}
	        	else {
	        		String outtext="I have punchedout";
	        		driver.findElement(By.className("oxd-textarea")).sendKeys(outtext);
	        		 WebElement out= driver.findElement(By.className("orangehrm-left-space"));
	     	         out.click();
	        	}
	        }
	        
//	        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/i")).click();
	        //...............?adding date and time
	        
	    }

