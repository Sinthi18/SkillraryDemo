package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;
/**
 * This class contains elements and respective busiess libraries of skillrary demo app page
 * @author Admin
 *
 */

public class SkillraryDemoAppPage {
	//Declaration
	@FindBy(xpath="//div[@class='navbar-header']") //inspect skillrary demo app,search category
	private static WebElement pageHeader;
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//span/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	
	@FindBy(name="addresstype")
	private static WebElement categoryDD;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private static WebElement contactUsLink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	/**
	 * This method returns page header text
	 * @return
	 */
	public static String getPageHeader() {
		return pageHeader.getText();
	}
	/**
	 * This method is used to mouse hover to course tab
	 * @param web
	 */
	public void mouseHoverToCourse(WebDriverUtility web) {
		web.mouseHover(courseTab);
	}
	/**
	 * This method is used to click on selenium training
	 */
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}
	/**
	 * This method is used to select category
	 * @param web
	 * @param index
	 */
	public static void selectCategory(WebDriverUtility web,int index) {
		web.dropdown(categoryDD,index);
	}
	/**
	 * This method returns contact us link
	 * @return
	 */
	public static WebElement getContactUsLink() {
		return contactUsLink;
	}
	/**
	 * This method is used to click on contact us link
	 */
	public static void clickContactus() {
		contactUsLink.click();
	}
	public static boolean contains(String string) {
		return false;
	}	

}
