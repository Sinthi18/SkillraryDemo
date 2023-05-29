package testscripts;

import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;
import pomClasses.SkillraryDemoAppPage;

public class AddPythonToMyCartTest extends BaseClass {
	public void addPythonToCartTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.switchToChildBrowser();
		
		soft.assertTrue(SkillraryDemoAppPage.getPageHeader().contains("ECommerce"));
		SkillraryDemoAppPage.selectCategory(web, 1);
		soft.assertEquals(testing.getpageHeader(), "Testing");
		 
		web.scrollTillElement(testing.getPythonImage());
		web.dragAndDropElement(testing.getPythonImage(), testing.getCartArea());
		
		web.scrollTillElement(testing.getFacebookIcon());
		testing.clickfacebookIcon();
		soft.assertAll();
	}
}
	



