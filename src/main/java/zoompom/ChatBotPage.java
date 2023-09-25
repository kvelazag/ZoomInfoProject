package zoompom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatBotPage {
	
public WebDriver pdriver;
	
	@FindBy(id="insent-iframe")
	private WebElement iframe;

	@FindBy(xpath="//*[@id=\\\"insent-input-message-input-box-body-input\\\"]")
	private WebElement correctMailId;
	
	@FindBy(xpath="//div[contains(text(), 'How do you know about Zoominfo?')]")
	private WebElement secondMessage;
	
	@FindBy(xpath="//div[contains(text(), 'Thanks for your time!')]")
	private WebElement thanksMessage;
	
	@FindBy(css ="div#insent-launcher-icon-container")
	private WebElement chatIcon;	
	
	@FindBy(xpath="//div[text()='Hello there']")
	private WebElement welcomeText;
	
	@FindBy(css="#insent-input-message-input-box-body-input-form > input")
	private WebElement emailTextBox;
	
	@FindBy(css="svg#insent-input-box-bode-input-submit-icon")
	private WebElement emailSendButton;
	
	@FindBy(id="insent-message-input-bot-icon")
	private WebElement resetButton;
	
	@FindBy(xpath="//div[contains(text(), 'LinkedIn')]")
	private WebElement linkedInOption;
	
	@FindBy(id="insent-card-close")
	private WebElement closeButton;
	
	@FindBy(xpath="//*[@id='textInputArea']")
	private WebElement baseInputTextBox;
	
	@FindBy(css="form>div")
	private WebElement errorMessage; 
	
	@FindBy(xpath="//input[@class='sc-kGXeez btVPjK']//following::div[text()='How do you know about Zoominfo?']")
	private WebElement secondQuestion;
	
	@FindBy(id="hs-eu-confirmation-button")
	private WebElement cookiesAccept;
	
	@FindBy(css="#insent-message-input-input-actions > button > svg")
	private WebElement baseSendButton;
	
	public WebElement getBaseSendButton() {
		return baseSendButton;
	}

	public WebElement getCookiesAccept() {
		return cookiesAccept;
	}

	public WebElement getSecondQuestion() {
		return secondQuestion;
	}

	public WebDriver getPdriver() {
		return pdriver;
	}

	public WebElement getChatIcon() {
		return chatIcon;
	}

	public WebElement getWelcomeText() {
		return welcomeText;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getEmailSendButton() {
		return emailSendButton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}

	public WebElement getLinkedInOption() {
		return linkedInOption;
	}
	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getErrorMessage() {
		return errorMessage;
	}
	
	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getCorrectMailId() {
		return correctMailId;
	}

	public WebElement getSecondMessage() {
		return secondMessage;
	}

	public WebElement getThanksMessage() {
		return thanksMessage;
	}
	
	public WebElement getBaseInputTextBox() {
		return baseInputTextBox;
	}

	public ChatBotPage(WebDriver driver) {
		pdriver=driver;
		PageFactory.initElements(pdriver, this);
	}


}
