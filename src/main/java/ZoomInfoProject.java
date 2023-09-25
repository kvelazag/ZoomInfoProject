

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ZoomInfoProject {
//		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\kvela\\Desktop\\Eclipse_workspace\\ZoomInfo_Project\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://recruitment.web-test.insent.ai/fe-assignment");
			driver.manage().window().maximize();
			WebElement cookie = driver.findElement(By.id("hs-eu-confirmation-button"));
			if(cookie.isDisplayed()) {
				cookie.click();
			}
			
			Thread.sleep(4000);
			
			//open and extract texts from bot
			WebElement botFrameId = driver.findElement(By.id("insent-iframe"));
			driver.switchTo().frame(botFrameId);
			
			//chatBot.isDisplayed();
//			Thread.sleep(7000);
//			WebElement subscribeClose = driver.findElement(By.className("leadinModal-close"));
//			if(subscribeClose.isDisplayed()) {
//			subscribeClose.click();
//			}
			
//			WebElement cookieAccept = driver.findElement(By.cssSelector("div#hs-eu-cookie-confirmation-button-group"));
//			cookieAccept.click();
			WebElement chatBot = driver.findElement(By.cssSelector("div#insent-launcher-icon-container"));
			chatBot.click();
			Thread.sleep(3000);
			WebElement welcomeText = driver.findElement(By.xpath("//div[text()='Hello there']"));
			String extractedWelcomeText = welcomeText.getText();
			System.out.println(extractedWelcomeText);
			
			Thread.sleep(3000);
			//verify email box with wrong value
			WebElement emailTextBox = driver.findElement(By.cssSelector("#insent-input-message-input-box-body-input-form > input"));
			emailTextBox.sendKeys("kaviyarasu@gmail.com");
			WebElement sendButton = driver.findElement(By.cssSelector("svg#insent-input-box-bode-input-submit-icon"));
			sendButton.click();
			Thread.sleep(2000);
			WebElement errorMessage = driver.findElement(By.cssSelector("form>div"));
			String errortext = errorMessage.getText();
			System.out.println(errortext);
			emailTextBox.sendKeys(Keys.CONTROL,Keys.chord("a"));
			emailTextBox.sendKeys(Keys.BACK_SPACE);
//			emailTextBox.clear();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.textToBePresentInElementValue(emailTextBox, ""));
//			driver.navigate().refresh();
//			Thread.sleep(3000);
//			emailTextBox.click();
//			WebElement afterclear = driver.findElement(By.xpath("//form[@class='sc-kpOJdX fgZJHt']//child::input[@class='sc-kGXeez btVPjK']"));
//
////			afterclear.click();
//			afterclear.sendKeys("kai@good.com");
//			
//			//verify email with correct mail
			emailTextBox.sendKeys("Mac@telekom.com");
////			WebElement afterErrormsg = driver.findElement(By.name("email"));
////			afterErrormsg.sendKeys("kavi@telekom.com");
//			Thread.sleep(2000);
			sendButton.click();
//			String text = emailTextBox.getText();
//			System.out.println(text);
//			
//			
			//correct email
			
			WebElement correctEmail = driver.findElement(By.xpath("//*[@id=\"insent-input-message-input-box-body-input\"]"));
			String correctemailtext = correctEmail.getAttribute("value");
			System.out.println(correctemailtext);
			
//			
		
	        WebElement divElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(), 'How do you know about Zoominfo?')]")));
//			WebElement secondmsg = driver.findElement(By.xpath("//div[contains(text(), 'How do you know about Zoominfo?')]"));
			String secmsg = divElement.getText();
			System.out.println(secmsg);
			
//			// select linkedIn for next question
			WebElement linkedInOption = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(), 'LinkedIn')]")));
			
			linkedInOption.click();
//			
			// last message
			WebElement thanksmsg = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(), 'Thanks for your time!')]")));
			String thanks = thanksmsg.getText();
			System.out.println(thanks);
//			
//			//reset the bot
			WebElement resetButton = driver.findElement(By.id("insent-message-input-bot-icon"));
			resetButton.click();
//			
//			//close bot
			WebElement closeIcon = driver.findElement(By.id("insent-card-close"));
			closeIcon.click();
//			
//			
//			//opening new tab 
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.open('','_blank');");
			for (String tab : driver.getWindowHandles()) {
	            driver.switchTo().window(tab);
	        }
			driver.get("https://www.google.com/");
			Thread.sleep(5000);
//			
//			//get back to first tab
			driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
			
			//open bot again
//			WebElement reopenbot = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#insent-launcher-icon-container")));
			driver.switchTo().frame(botFrameId);
			chatBot.click();
//			reopenbot.click();
//			
			//again adding data
			WebElement baseTextbox = driver.findElement(By.xpath("//form[@id='insent-message-input-message-input-wrapper']"));
//			baseTextbox.sendKeys("kavi");
			
			if(baseTextbox.isDisplayed()) {
				baseTextbox.sendKeys("kavi");
		}
			if(emailTextBox.isDisplayed()) {
				emailTextBox.sendKeys("Kavi@telekom.com");
				
			}else {
				System.out.println("nothing displayed");
			}
//			WebElement newmsg = wait.until(ExpectedConditions.visibilityOf(emailTextBox));
//			newmsg.sendKeys("new@daily.com");
			
//			//additional-- validating the back button in chatbot
//			WebElement backButtonInChatBot = driver.findElement(By.className("sc-kUaPvJ gbWvBL"));
//			backButtonInChatBot.click();
//			
//			//validating the text in main page of the bot
//			WebElement chatMainPageText = driver.findElement(By.className("sc-dREXXX frnCYw"));
//			String mainPageText = chatMainPageText.getText();
//			System.out.println(mainPageText);
//			
//			//tooltip text validation
//			WebElement toolTipText = driver.findElement(By.xpath("//div[text()='ZoomInfo']"));
//			String toolText = toolTipText.getText();
//			System.out.println(toolText);
//			
			
		}
	}



