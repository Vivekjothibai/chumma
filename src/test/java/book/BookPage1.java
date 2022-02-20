package book;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookPage1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd =new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		wd.get("https://www.expedia.co.in/");
		wd.findElement(By.xpath("//a[@aria-controls='wizard-flight-pwa']/child::*")).click();
		wd.findElement(By.xpath("//a[@aria-controls='wizard-flight-tab-oneway']/child::*")).click();
	    WebElement leaving= wd.findElement(By.xpath("//button[@aria-label='Leaving from']"));
	    leaving.click();
	    wd.findElement(By.xpath("//input[@id='location-field-leg1-origin']")).sendKeys("abu");
	    Thread.sleep(2000);
	    wd.findElement(By.xpath("//li[@data-index='2']")).click();
	    //html/body/div[1]/div/header/lot-experiencefragment/div/lot-header/div/div[2]/div[2]/div/aem-responsivegrid/div/lot-aem-tabs/lot-tabs/div[2]/div/aem-responsivegrid/div/lot-bookerflight/section/form/div/lot-airport-selection/div/lot-single-airport-select[1]/button/span[2]
	    //button[@_ngcontent-serverapp-c147 type='button']
	    //li[@data-index='2']
	}

}
