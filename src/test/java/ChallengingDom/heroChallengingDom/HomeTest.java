package ChallengingDom.heroChallengingDom;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ChallengingDom.heroChallengingDom.pages.ChallengeHome;

import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseClass {

	
	@Test(description = "Check the heading diplays correctly")
	public void checkPageHeading() {
		ChallengeHome home=new ChallengeHome(driver);
		AssertJUnit.assertEquals("Challenging DOM", home.returnHeading());
	}

	@Test(description = "Check the heading description diplays correctly")
	public void displayHeadingDiscription() {
		ChallengeHome home=new ChallengeHome(driver);
		AssertJUnit.assertEquals(home.returnHeadingDescription(), "The hardest part in automated web testing is finding the best locators (e.g., ones that well named, unique, and unlikely to change). It's more often than not that the application you're testing was not built with this concept in mind. This example demonstrates that with unique IDs, a table with no helpful locators, and a canvas element.");
	}

	@Test(description = "Check weather text on alert button changes after click ")
	public void checkAlertButtonTextAfterClick() {
		ChallengeHome home=new ChallengeHome(driver);
		String textBeforeClick = home.returnAlertButtonText();
		home.clickOnAlertButtonText();
		Assert.assertNotEquals(textBeforeClick, home.returnAlertButtonText());
	}

	@Test(description = "check normal,alert buttons text changes when clicking success button")
	public void checkButtonTextAfterClick() {
		ChallengeHome home=new ChallengeHome(driver);
		home.clickOnSuccessButtonText();
		Assert.assertTrue(true, home.returnAlertButtonText());
		Assert.assertTrue(true, home.returnButtonText());
	}

	@Test(description="compare answer after clicking on the success button")
	public void checkAnswerClickSuccess()
	{
		ChallengeHome home=new ChallengeHome(driver);
		String answerBeforeClick=home.returnAnswer();
		home.clickOnSuccessButtonText();
		Assert.assertNotEquals(answerBeforeClick, home.returnAnswer());
	}
	
	@Test(description = "Printing table headings")
	public void printTableHeadings()
	{
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//thead//th[1]")).getText(), "Lorem");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//thead//th[2]")).getText(), "Ipsum");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//thead//th[3]")).getText(), "Dolor");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//thead//th[4]")).getText(), "Sit");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//thead//th[5]")).getText(), "Amet");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//thead//th[6]")).getText(), "Diceret");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//thead//th[7]")).getText(), "Action");
	
	}
	
	@Test(description = "Printing values of first row")
	public void printFirstRow()
	{
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//tbody//tr[1]/td[1]")).getText(), "Iuvaret0");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//tbody//tr[1]/td[2]")).getText(), "Apeirian0");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//tbody//tr[1]/td[3]")).getText(), "Adipisci0");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//tbody//tr[1]/td[4]")).getText(), "Definiebas0");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//tbody//tr[1]/td[5]")).getText(), "Consequuntur0");
	AssertJUnit.assertEquals(driver.findElement(By.xpath("//table//tbody//tr[1]/td[6]")).getText(), "Phaedrum0");
	
	}
	
	@Test(description = "Click on edit link of first row inside table")
	public void editTableFirstRow()
	{
		ChallengeHome home=new ChallengeHome(driver);
		home.editFirstRow();
		AssertJUnit.assertEquals("https://the-internet.herokuapp.com/challenging_dom#edit", driver.getCurrentUrl());
	}
	
	@Test(description = "Click on delete link of first row inside table")
	public void deleteTableFirstRow()
	{
		ChallengeHome home=new ChallengeHome(driver);
		home.deleteFirstRow();
		AssertJUnit.assertEquals("https://the-internet.herokuapp.com/challenging_dom#delete", driver.getCurrentUrl());
	}
	
	@Test(description = "validate footer")
	public void validateFooter()
	{
		ChallengeHome home=new ChallengeHome(driver);
		AssertJUnit.assertEquals(home.returnFooter(), "Powered by Elemental Selenium");
		
	}
	
	

}

