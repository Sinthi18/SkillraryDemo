package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * This class contains elements locators and respective business libraries of testing page
 * @author Admin
 *
 */

public class TestingPage {
	 //Declaration
		@FindBy(xpath="//h1[@class='page-header']")
		private WebElement pageHeader;
		
		@FindBy(id="python")
		private WebElement pythonImage;
		
		@FindBy(id="cartArea")
		private WebElement cartArea;
		
		@FindBy(xpath="//ul[@class='list-socialicons']/descendant::i[@class='fa fa-facebook']")
		private WebElement facebookIcon;
		
		//Initialization
		public TestingPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		
		//Utilization
		/**
		 * This method returns page header text
		 * @return
		 */
		public String getpageHeader() {
			return pageHeader.getText();
		}
		/**
		 * This method returns python Image
		 * @return
		 */
		public WebElement getPythonImage() {
			return pythonImage;
		}
		/**
		 * this method return facebook icon
		 * @return
		 */

		public WebElement getFacebookIcon() {
			return facebookIcon;
		}
		/**
		 * This method is used to click on facebook icon
		 */
		public void clickfacebookIcon() {
			facebookIcon.click();
		}

		public WebElement getCartArea() {
			return null;
		}
	}

