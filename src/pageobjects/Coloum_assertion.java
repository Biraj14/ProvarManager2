package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "Coloum_assertion", summary = "", relativeUrl = "", connection = "admin")
public class Coloum_assertion {

	WebDriver driver;

public Coloum_assertion(WebDriver driver){

this.driver=driver;

}

@PageRow()
public static class TableName {
@TextType()
@FindBy(xpath = ".//th")
public WebElement OpportunityName;
}

	@PageTable(row = TableName.class, firstRowContainsHeaders = false)
	@FindBy(xpath = "//tbody//tr")
	public List<TableName> TableNameList;
	@LinkType()
	@FindBy(xpath = "//span[@class='slds-truncate' and text()='Opportunities']")
	public WebElement opportunities;

}
