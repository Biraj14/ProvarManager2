package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="Coloum_assertionFromPalate"                                
     , summary=""
     , relativeUrl=""
     , connection="admin"
     )             
public class Coloum_assertionFromPalate {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='ProvarF4']")
	public WebElement OPPORTUNITY_NAME;

	@PageRow()
	public static class Optable {
	}

	@FacetFindBys(value = {
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]")
	@PageTable(firstRowContainsHeaders = false, row = Optable.class)
	public List<Optable> optable;
			
}
