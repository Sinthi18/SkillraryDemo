package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;
import pomClasses.SkillraryDemoAppPage;


public class AddToCartTest extends BaseClass{
	@Test
	public void  addToCartTest(){
		SoftAssert soft=new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoAppLink();
		web.switchToChildBrowser();
		
		soft.assertTrue(SkillraryDemoAppPage.getPageHeader().contains("Ecommerce"));
		
		demo.mouseHoverToCourse(web);
		demo.clickSeleniumTraining();
		soft.assertEquals(selenium.getPageHeader(),"Selenium Trining" );
		
		int initialQuantity=Integer.parseInt(selenium.getQuality());
		selenium.bobleClickPlusButton(web);
		int finalQuantity=Integer.parseInt(selenium.getQuality());
		
		soft.assertEquals(finalQuantity,finalQuantity);
		
		selenium.clickAddToCart();
		web.handleAlert("ok");
		soft.assertEquals(selenium.getItemAddedMessage(), "Item added to cart");
		soft.assertAll();
	}
}

