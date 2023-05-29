package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SeleniumTrainingPage {
	@FindBy(xpath ="//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id ="quantity")
	private WebElement quality;
	
	@FindBy(id="add")
	private WebElement plusButton;
	
	@FindBy(xpath ="//button[.='add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//div[@class='callout callout-success']/span")
	private WebElement itemAddedMessage;
	
	//Initialization
	public SeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	
	/**
	 * This method return page header text
	 * @return
	 */
	public String getPageHeader() {
		return pageHeader.getText();
	}
	/**
	 * This method is used to fetch the quality of product
	 * @return
	 */
	public String getQuality() {
		return quality.getAttribute("value");
	}
	/**
	 * This method is used to double click on plus button
	 * @param web
	 */
	public void bobleClickPlusButton(WebDriverUtility web) {
		web.doubleClickOnElement(plusButton);
	}
	/**
	 * This method is used to click on add to cart button
	 */
	public void clickAddToCart() {
		addToCartButton.click();
	}
	public String getItemAddedMessage() {
		return itemAddedMessage.getText();
	}
}


