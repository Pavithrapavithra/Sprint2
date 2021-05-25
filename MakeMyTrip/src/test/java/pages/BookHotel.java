package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import utiltest.TestBase;

public class BookHotel extends TestBase{

	//@FindBy(id="detpg_hotel_location")
	//@FindBy(id="detpg_hotel_name")
	
	@FindBy(id="hsw_search_button")
	WebElement gethoteldetailPage;
	
	@FindBy(xpath="//span[@class='fcTooltip__outer ']//a[contains(text(),'BOOK THIS NOW')]")
	//@FindBy(id="detpg_headerright_book_now")
	WebElement booknow;
	
	
	@FindBy(xpath="//*[@class='rvHeader__heading']")
	WebElement assertreviewbookingpage;

	
	
	@FindBy(id="title")
	WebElement Selecttitle;


	

	//@FindBy(id="fName")
	@FindBy(xpath="//input[@id='fName']")
	WebElement firstname;
	
	@FindBy(id="lName")
	WebElement lastname;
	
	
	@FindBy(id="email")
	WebElement emailid;     
	
	
	
	@FindBy(id="mNo")
	WebElement contact;
	
	
	
	//@FindBy(className="btnContinuePayment primaryBtn capText")
	@FindBy(xpath="//a[@class='btnContinuePayment primaryBtn capText  ']  ")
	WebElement paynow;
	
	
	@FindBy(xpath="//*[@class='payment__options__tab']")
	//*[@class='payment__options__tab']
	//*[@id="root"]/div/div/main/div[1]/div[3]/div[1]
	WebElement paymentoptions;
	

	private WebDriver driver;
	
	//constructor to initiate review booking page object with a driver object

	public BookHotel(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);// 												   
	}

	
	//private WebElement getAssertPage;
	
	 public WebElement asserthoteldetailspage()
	    {
			return gethoteldetailPage;
		}
	 
	
	public WebElement clickbook_this()
    {
	  return booknow;
       }
	
	public WebElement bookingPage() {
		return assertreviewbookingpage;
		
	}
	

	public void selectTitle(String Title)
	{	
		Select title = new Select (Selecttitle);
		title.selectByVisibleText(Title);
	}
	
	
	public void enter_firstname(String fname) {
		     firstname.sendKeys(fname);                      //   public void Hotel_name(String Hotelname) {
				                                        //  HotelName.sendKeys(Hotelname);
		  // fullname.sendKeys("fname");
      	} 
	
	public void enter_lastname(String lname) {
	     lastname.sendKeys(lname);         
   	} 
	
	public void enter_emailid(String email) {
	     emailid.sendKeys(email);         
	} 
	
	
	public void enter_contact(String contactnum){
		    contact.sendKeys(contactnum);
	} 
	
	public WebElement click_paynow()
    {
	return paynow;
       }
	
	public  WebElement verifypaymentpage() {
		return paymentoptions;
	}

}
