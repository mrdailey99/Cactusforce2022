package pageobjects;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="carConfigurator"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class carConfigurator {

	WebDriver _driver;
	public carConfigurator (WebDriver driver) {
		_driver = driver;
	}
	    /** 
     * Used to write to the test execution log.
     */
    @TestLogger
    public Logger testLogger;
    
	@LinkType()
	@FindBy(xpath = "//a[contains(normalize-space(.),'Medium Range')]")
	public WebElement mediumRange;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Next']")
	public WebElement nextButton;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@data-color='red']")
	public WebElement exteriorRed;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@data-color='black']")
	public WebElement interiorBlack;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Lead']/following-sibling::div//input")
	public WebElement lead;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='PDF']")
	public WebElement exportPDF;	
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='PDF created']")
	public WebElement PDFCreated;
			
	public void SelectPriceRange(String range) {
		testLogger.info("Selecting range: " + range);		
		WebElement rangeSelection = _driver.findElement(By.xpath("//a[contains(normalize-space(.),'" + range + " Range')]"));
		testLogger.info("Found webelement " + rangeSelection);
		rangeSelection.click();
	}
	
	public void SelectColor(String color) {
		WebElement colorSelection = _driver.findElement(By.xpath("//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@data-color='" + color.toLowerCase() + "']"));
		colorSelection.click();
	}
	
}
