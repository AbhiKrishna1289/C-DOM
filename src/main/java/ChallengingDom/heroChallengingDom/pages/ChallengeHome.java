package ChallengingDom.heroChallengingDom.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ChallengingDom.heroChallengingDom.Miscellaneous;
import ChallengingDom.heroChallengingDom.WebDriverWaits;

public class ChallengeHome {
	WebDriver driver;
	// WebElements
	@FindBy(tagName = "h3")
	private WebElement headingField;

	@FindBy(xpath = "//div[@class='example']//p")
	private WebElement headingDescription;

	@FindBy(xpath = "//a[@class='button']")
	private WebElement normalButton;

	@FindBy(xpath = "//a[@class='button alert']")
	private WebElement alertButton;

	@FindBy(xpath = "//a[@class='button success']")
	private WebElement successButton;

	@FindBy(xpath="//div[@id='content']//script")
	private WebElement answerCanvas;
	
	@FindBy(xpath="//table//tbody//tr[1]//td//a[text()='delete']")
	private WebElement firstRowDeleteLink;
	
	@FindBy(xpath="//table//tbody//tr[1]//td//a[text()='edit']")
	private WebElement firstRowEditLink;
	
	@FindBy(xpath="//div[@id='page-footer']")
	private WebElement footerText;

	
	public ChallengeHome(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	}

	// functions for WebElements
	public String returnHeading() {
		WebDriverWaits.waitUntilVisibility(driver, headingField);
		return headingField.getText();
	}

	public String returnHeadingDescription() {
		WebDriverWaits.waitUntilVisibility(driver, headingDescription);
		return headingDescription.getText();
	}

	public String returnButtonText() {
		WebDriverWaits.waitUntilVisibility(driver, normalButton);
		return normalButton.getText();
	}

	public void clickOnButtonText() {
		WebDriverWaits.waitUntilVisibility(driver, normalButton);
		normalButton.click();
	}

	public String returnAlertButtonText() {
		WebDriverWaits.waitUntilVisibility(driver, alertButton);
		return alertButton.getText();
	}

	public void clickOnAlertButtonText() {
		WebDriverWaits.waitUntilVisibility(driver, alertButton);
		Miscellaneous.highlightElement(driver, alertButton);
		alertButton.click();
	}

	public String returnSuccessButtonText() {
		WebDriverWaits.waitUntilVisibility(driver, successButton);
		return successButton.getText();
	}

	public void clickOnSuccessButtonText() {
		WebDriverWaits.waitUntilVisibility(driver, successButton);
		successButton.click();
	}

	public String returnAnswer() {
		String canvas=driver.findElement(By.xpath("//div[@id='content']//script")).getAttribute("innerHTML");
		canvas=canvas.substring(canvas.indexOf("Answer"), canvas.indexOf("',"));
		return canvas;
	}
	
	public void deleteFirstRow()
	{
		WebDriverWaits.waitUntilVisibility(driver, firstRowDeleteLink);
		firstRowDeleteLink.click();
	}

	public void editFirstRow() {
		WebDriverWaits.waitUntilVisibility(driver, firstRowEditLink);
		firstRowEditLink.click();
		
	}

	public String returnFooter() {
		WebDriverWaits.waitUntilVisibility(driver, footerText);
		return footerText.getText();
	}
	

}
