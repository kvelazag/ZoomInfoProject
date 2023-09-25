package zoombase;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
public static WebDriver driver;
	
	//Browser Launch
	public static WebDriver launchBrowser(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kvela\\Downloads\\ZoomInfo\\ZoomInfo\\zoominfoproject\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		else {
			System.out.println("invalid browser");
		}
		driver.manage().window().maximize();
		return driver;
	}
	//navigateTo
	public static void naviTo(String url) {
		driver.navigate().to(url);
	}
	//NavigateBack
	public static void naviBack() {
		driver.navigate().back();
	}
	//NavigateForward
	public static void naviForward() {
		driver.navigate().forward();
	}
	//NavigateRefresh	
	public static void naviRefresh() {
		driver.navigate().refresh();
	}
	//Website launch	
	public static void webSite(String url) {
		driver.get(url);
	}
	//Alert working
	public static void alertBtn(WebElement element, String text) {
		element.click();
		if(text.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		}
		else if(text.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}
		else {
			System.out.println("invalid Alert");
		}
	}
	//alertSendKeys
	public static void alertMsg(WebElement element, String text, String end) {
		element.click();
		driver.switchTo().alert().sendKeys(text);
		if(end.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		}
		else if(end.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}
		
	}
	//frames working
	public static void frame(String value, String frameType) {
		
		if(frameType.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			driver.switchTo().frame(index);
		}
		else if(frameType.equalsIgnoreCase("id")) {
			driver.switchTo().frame(value);
		}
		else if(frameType.equalsIgnoreCase("WebElement")) {
			WebDriver frame = driver.switchTo().frame(value);
			((WebElement) frame).click();
		}
		else {
			System.out.println("invalid frame");
		}
	}
	//Actions
	public static void actionMethods(WebElement element,String strtype) {
		Actions ac = new Actions(driver);
		if(strtype.equalsIgnoreCase("click")) {
			ac.click(element).build().perform();
		}
		else if(strtype.equalsIgnoreCase("Right click")) {
			ac.contextClick(element).build().perform();
		}
		else if(strtype.equalsIgnoreCase("Double click")) {
			ac.doubleClick(element).build().perform();
		}
		else if(strtype.equalsIgnoreCase("Moveto")) {
			ac.moveToElement(element).build().perform();
		}
		else {
			System.out.println("invalid str type");
		}
	}	
	//draganddrop
	public static void dragDrop(WebElement src_element, WebElement tgt_element) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src_element, tgt_element).build().perform();
	}
	// getTitle
	public static void getsiteName() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	// URL
	public static void currentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	//close
	public static void closeWindow() {
		driver.close();
	}
	//quit Browser	
	public static void closeBrowser() {
		driver.quit();
	}
	//screenshot
	public static void screenShot(String fname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\kvela\\Desktop\\Eclipse_workspace\\Maven_Project_01\\Screenshots\\"+fname+".png");
		FileUtils.copyFile(source, target);
	}
	//sendkeys
	public static void sendValues(WebElement element, String value) {
		element.sendKeys(value);
	}
	//click
	public static void clickOk(WebElement element) {
		element.click();
	}
	//getText	
	public static void textget(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	//Attribute
	public static void attributeget(WebElement element,String R_attribute) {
		String attribute = element.getAttribute(R_attribute);
		System.out.println(attribute);
	}
	//selected
	public static void select(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	//display
	public static void display(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	//selected
	public static void enable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	//multiple	
	public static void is_Multiple(WebElement dropdownElement) {
		Select s = new Select(dropdownElement);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	//get
	public static void getThings(String things) {
		driver.get(things);
	}
	//windowhandle	
	public static void windowId(String type) {
		if(type.equalsIgnoreCase("current")) {
			String wh = driver.getWindowHandle();
			System.out.println(wh);
		}
		else if(type.equalsIgnoreCase("All")) {
			Set<String> whs = driver.getWindowHandles();
			System.out.println(whs);
		}
		else {
			System.out.println("no windows");
		}
	}
	//single drop down
	public static void singleDropdown(WebElement dropdown, String value, String type) {
		Select s = new Select(dropdown);
		if(type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("visible")) {
			s.selectByVisibleText(value);
		}
		else if(type.equalsIgnoreCase("id")) {
			int id = Integer.parseInt(value);
			s.selectByIndex(id);
		}
	}
	//check box
	public static void checkBox(WebElement element) {
		element.click();
	}
	//get options
	public static void get_Options(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for(WebElement all : options) {
			String text = all.getText();
			System.out.println(text);
		}
	}
	//first selected option	
	public static void firstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}
	//get all selected options
	public static void allOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement all_selected:allSelectedOptions) {
			String text = all_selected.getText();
			System.out.println(text);
		}
	}
	//scroll page
	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	//wait
	public static void waitTime(int waitsec) {
		driver.manage().timeouts().implicitlyWait(waitsec, TimeUnit.SECONDS);
	}
	//verify text
	public static void verifyText(Object actual, String expected) {
		if(actual==expected) {
			System.out.println("text in the web page matching expected");
		}else {
			System.out.println("text in the web page does not matching expected");
		}
	}
	//new tab open
	public static void openNewTab() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open('','_blank');");
		for (String tab : driver.getWindowHandles()) {
            driver.switchTo().window(tab);
	}

}
}
