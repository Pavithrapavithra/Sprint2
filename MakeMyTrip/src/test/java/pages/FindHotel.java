package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utiltest.TestBase;

public class FindHotel extends TestBase {
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(xpath="//input[@placeholder='Enter city/ Hotel/ Area/ Building']")
	WebElement HotelName;
	
	
	@FindBy(xpath="//div//li//p[contains(text(),'Hablis, Chennai, Tamil Nadu')]")
	WebElement Hotelselect;
	
	@FindBy(xpath="//div[@class='DayPicker-Months']//div[@class='DayPicker-Month'][2]//div[text()='2']")
	WebElement checkindate;

	@FindBy(xpath="//div[@class='DayPicker-Months']//div[@class='DayPicker-Month'][2]//div[text()='17']")     
	WebElement checkoutdate;
	
	@FindBy(id="guest")
	WebElement guestroom;
	
	@FindBy(xpath="//*[@class='primaryBtn btnApply']")
	WebElement apply;
	
 
	@FindBy(id="hsw_search_button")
	WebElement search;

	//@FindBy(id="hlistpg_hotel_name")
	@FindBy(id="htl_id_seo_201307041346304457")
	WebElement clickhotel;
	
	public FindHotel(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);// 												   
	}

	
	
	public WebElement click_city() {
	   return city;
	}
	
	public void Hotel_name(String Hotelname) {
		   HotelName.sendKeys(Hotelname);
		}
	
	
	public WebElement Hotel_select() {
		   return Hotelselect;
		}
	  
	   
	public WebElement selectcheckindate() {
		return checkindate;
	}
	
	
	public WebElement selectcheckoutdate() {
		return checkoutdate;
	
	}
	
	
	public WebElement click_GuestsRooms()
	{
		return guestroom;
	}
	
     
	
	public WebElement click_applybutton()
	      {
		 return apply;
	         }
	
	public WebElement click_searchbutton() {
		   return search;
		}
	
	
	public WebElement hotelclick()
    {
	return clickhotel;
       }
	
}
		

/*	public void selectcheckindatebyjs(WebDriver driver,WebElement element, String Checkindate) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].setAttribute('value','"+Checkindate+"');",element);
	}
	
	
	public void selectcheckoutdatebyjs(WebDriver driver,WebElement element, String Checkoutdate) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("argument[0].setAttribute('value','"+Checkoutdate+"');",element);
*/