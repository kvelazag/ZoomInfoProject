package com.zoominfo.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import filereadermanager.org.FileReaderManager;
import zoombase.Base;
import zoommanager.PageObjectManager;

public class ZoomInfoStepDefinition extends Base {
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^User Launch The chatbot Application$")
	public void user_Launch_The_chatbot_Application() throws Throwable {
		
		webSite(FileReaderManager.getInstanceFR().getInstanceCR().getUrl());
		Thread.sleep(3);
		clickOk(pom.getChatBotPage().getCookiesAccept());
		Thread.sleep(3);
	   
	}

	@When("^Once you launch the site and verify if the chat bot is displayed on the screen$")
	public void once_you_launch_the_site_and_verify_if_the_chat_bot_is_displayed_on_the_screen() throws Throwable {
	   
		waitTime(4);
		driver.switchTo().frame(pom.getChatBotPage().getIframe());
		Thread.sleep(3);
		if(pom.getChatBotPage().getChatIcon().isDisplayed()){
			System.out.println("chat bot Icon is visible");
		}else {
			System.out.println("no chat bot icon");
		}
	}

	@When("^Click on the bot and verify the welcome message and other text validation$")
	public void click_on_the_bot_and_verify_the_welcome_message_and_other_text_validation() throws Throwable {
	    String expected="Hello there";
		waitTime(4);
		clickOk(pom.getChatBotPage().getChatIcon());
		Thread.sleep(3);
	    textget(pom.getChatBotPage().getWelcomeText());
	    WebElement welcomeText = pom.getChatBotPage().getWelcomeText();
	    String actualText = welcomeText.getText();
	    assert actualText.contains(expected);
	    
	}

	@When("^Enter invalid data \"([^\"]*)\" and verify error message$")
	public void enter_invalid_data_and_verify_error_message(String arg1) throws Throwable {
	   
		waitTime(3);
		sendValues(pom.getChatBotPage().getEmailTextBox(), arg1);
		Thread.sleep(2);
		clickOk(pom.getChatBotPage().getEmailSendButton());
		
		textget(pom.getChatBotPage().getErrorMessage());
		Thread.sleep(2);
		pom.getChatBotPage().getEmailTextBox().sendKeys(Keys.CONTROL,Keys.chord("a"));
		pom.getChatBotPage().getEmailTextBox().sendKeys(Keys.BACK_SPACE);
	}

	@When("^then enter valid data \"([^\"]*)\" and continue the conversation$")
	public void then_enter_valid_data_and_continue_the_conversation(String arg2) throws Throwable {
		
	
		waitTime(5);
		sendValues(pom.getChatBotPage().getEmailTextBox(), arg2);
		clickOk(pom.getChatBotPage().getEmailSendButton());
		
		textget(pom.getChatBotPage().getSecondMessage());
		Thread.sleep(2);
		clickOk(pom.getChatBotPage().getLinkedInOption());
		
		textget(pom.getChatBotPage().getThanksMessage());
		
		}
	   

	@When("^Restart the conversation$")
	public void restart_the_conversation() throws Throwable {
		
		waitTime(3);
		clickOk(pom.getChatBotPage().getResetButton());
	  
	}

	@When("^Close and open the chat$")
	public void close_and_open_the_chat() throws Throwable {
		
		waitTime(3);
		clickOk(pom.getChatBotPage().getCloseButton());
		
		clickOk(pom.getChatBotPage().getChatIcon());
	   
	}

	@When("^Open a new tab with google stay there for (\\d+) seconds$")
	public void open_a_new_tab_with_google_stay_there_for_seconds(int arg1) throws Throwable {
			
        openNewTab();
		webSite(FileReaderManager.getInstanceFR().getInstanceCR().getNewUrl());
		Thread.sleep(arg1);
	  
	}

	@When("^come back to chat page and enter the data \"([^\"]*)\" in the bot$")
	public void come_back_to_chat_page_and_enter_the_data_in_the_bot(String arg1) throws Throwable {
	   
		driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
		waitTime(2);
		
//		sendValues(pom.getChatBotPage().getBaseInputTextBox(), arg1);
//		
//		clickOk(pom.getChatBotPage().getBaseSendButton());
//		
	}

//	@Then("^close the page$")
//	public void close_the_page() throws Throwable {
//		
//	   closeBrowser();
//	}

	}


