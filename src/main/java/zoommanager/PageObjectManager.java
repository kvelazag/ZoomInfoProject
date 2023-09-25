package zoommanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import zoompom.ChatBotPage;



public class PageObjectManager {
	
WebDriver driver;
	
	
	private ChatBotPage chatBotPage;
	
	public ChatBotPage getChatBotPage() {
		chatBotPage= new ChatBotPage(driver);
		return chatBotPage;
	}
	
	public PageObjectManager(WebDriver finalpom) {
		driver = finalpom;
		PageFactory.initElements(driver, this);
	}


}
