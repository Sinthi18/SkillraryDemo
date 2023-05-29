package testscripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;
import pomClasses.SkillraryDemoAppPage;

public class SendContactDetailsTest extends BaseClass {
	@Test 
	public void sendContactDetailsTest() {
		SoftAssert soft=new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.switchToChildBrowser();
		
		soft.assertTrue(SkillraryDemoAppPage.getPageHeader().contains("Ecommerce"));
		
		web.scrollTillElement(SkillraryDemoAppPage.getContactUsLink());
		SkillraryDemoAppPage.clickContactus();
		
		Map<String,String> map = excel.getDataFromExcel("Sheet1");
		contact.sendDetails(map.get("FullName"), map.get("Email"), map.get("Subject"), map.get("Message"));
		
		soft.assertAll();
		
	}
	

}
