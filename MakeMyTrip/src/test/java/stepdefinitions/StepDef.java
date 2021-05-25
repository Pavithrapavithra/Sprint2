package stepdefinitions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
import pages.BookHotel;
import pages.FindHotel;
import utiltest.TestBase;


public class StepDef extends TestBase {
	//WebDriver driver;
	//FindHotel find;
	//BookHotel book;

	
	@Given("^User in on landing page$")
	public void user_in_on_landing_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		//initialization();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lakshmi\\Desktop\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.makemytrip.com");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		Actions act = new Actions(driver);
		WebElement sam = driver.findElement(By.xpath("//p[@class='appendBottom3 whiteText']"));
		act.moveToElement(sam).click().build().perform();
		Thread.sleep(2000);
	}
	

	@Given("^User enters hotel name and selects the hotel name$")
	public void user_enters_hotel_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FindHotel find = new FindHotel(driver);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a/span[1]")).click();
		find.click_city().click();
		find.Hotel_name(prop.getProperty("Hotelname"));
		find.Hotel_select().click();
		Thread.sleep(2000);
	   
	}

	@Given("^User enters check-in and checkout date$")
	public void user_enters_check_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FindHotel find = new FindHotel(driver);
		find.selectcheckindate().click();
		Thread.sleep(2000);
		find.selectcheckoutdate().click();
	   
	}

	@Given("^User clicks rooms&guests , apply button and search button\\.$")
	public void user_clicks_rooms_guests() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FindHotel find = new FindHotel(driver);
	   find.click_GuestsRooms().click();
	   find.click_applybutton().click();
	   find.click_searchbutton().click();
	   Thread.sleep(2000);
	}
	
	
	@Then("^User gets List of hotels and clicks on specified Hotel$")
	public void user_gets_List_of_hotels() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FindHotel obj = new FindHotel(driver); 
		String temp= obj.driver.findElement(By.xpath("//*[@id=\"_Hlisting_area\"]/div[3]/div[1]/div/p/span")).getText();
		Assert.assertEquals(temp, "Select Filters");
		System.out.println("successful display");
		obj.hotelclick().click();
		Thread.sleep(2000);
	   
	}

	

	@Then("^User gets selected hotel details$")
	public void user_gets_selected_hotel_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*BookHotel obj = new BookHotel(driver); 
		String temp= obj.asserthoteldetailspage().getText();
		Assert.assertEquals(temp, "Rooms");
		System.out.println("successful details"); */
		
		//*[@id="detpg_hotel_facilities"]
		
		
Set<String> openedBrowserHandlesnew = driver.getWindowHandles();
		
		//print page title name of all open browsers
		// switch to window with title Amazon.in Help: Conditions of Use
		
		
		
		for(String browserHandle:openedBrowserHandlesnew)
		{
			
			
			String browserTitle = driver.switchTo().window(browserHandle).getTitle();
			if(browserTitle.equals("Hablis | Hotel Details Page | MakeMyTrip.com"))
			{
				driver = driver.switchTo().window(browserHandle);
				break;
			}
		}
		
	
		BookHotel obj = new BookHotel(driver); 
		String temp= obj.asserthoteldetailspage().getText();
		//temp.toLowerCase();
		Assert.assertEquals(temp.toLowerCase(), "search");
		System.out.println("successful details"); 
		Thread.sleep(2000);
	    
	}

	@Then("^User clicks on 'Book this combo'$")
	public void user_clicks_on_Book_this_combo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//BookHotel obj = new BookHotel(driver); 
		BookHotel book = new BookHotel(driver);
		Thread.sleep(3000);
		book.clickbook_this().click();
		Thread.sleep(2000);
		
	   
	}

	@Then("^User in on Review Booking page$")
	public void user_in_on_Review_Booking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Assert.assertEquals(book.AssertPaxdetailspage().getText(), "Personal Details");
		BookHotel obj = new BookHotel(driver); 
		String temp= obj.bookingPage().getText();
		Assert.assertEquals(temp, "Review your Booking");
		System.out.println("successful booking");
		Thread.sleep(2000);
		 
	   
	}
	
	@Then("^User selects title$")
	public void user_selects_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BookHotel book = new BookHotel(driver);
		book.selectTitle(prop.getProperty("Title"));
		Thread.sleep(2000);
	}

	@Then("^User enters fullname and lastname$")
	public void user_enters_fullname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BookHotel book = new BookHotel(driver);
		book.enter_firstname(prop.getProperty("fname"));
		Thread.sleep(2000);
	    book.enter_lastname(prop.getProperty("lname"));
	    Thread.sleep(2000);
	    
	}


	@Then("^User enters email address and mobilenumber$")
	public void user_enters_mobilenumber() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BookHotel book = new BookHotel(driver);
		book.enter_emailid(prop.getProperty("email"));
		Thread.sleep(2000);
		book.enter_contact(prop.getProperty("contactnum"));
		Thread.sleep(2000);
		
	   
	}

	@Then("^User clicks on 'PAYNOW' button$")
	public void user_clicks_on_PAYNOW_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BookHotel book = new BookHotel(driver);
		book.click_paynow().click();
	}

	@Then("^User gets Payment page with Payment options\\.$")
	public void user_gets_Payment_page_with_Payment_options() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BookHotel obj = new BookHotel(driver); 
		Boolean temp= obj.verifypaymentpage().isDisplayed();
		Assert.assertTrue(temp);
		System.out.println("successful payment page");
	   
	}
}


	