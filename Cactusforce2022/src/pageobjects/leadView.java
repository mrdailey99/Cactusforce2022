package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="leadView"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class leadView {

	@ButtonType(file=true)
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//li[1]//div[2]/span[normalize-space(.)='Your Car Order.pdf']")
	public WebElement notesAndAttachmentsTitle;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Download']")
	public WebElement download;
			
}
