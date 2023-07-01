package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage {
	protected WebDriver driver;
    private By recruitmentTab = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a");
    private By vacanciesTab = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");

    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickRecruitmentTab() {
        driver.findElement(recruitmentTab).click();
    }

    public void clickVacanciesTab() {
        driver.findElement(vacanciesTab).click();
    }
    
    public void AddbtnVacancy()
    {
    	driver.findElement(By.className("oxd-button-icon")).click();
    }
    // Add more methods for vacancy creation, form filling, etc.
    // ...

}
