package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelnHotelBook {


	     public static void main(String[] args) throws Exception {
            // Write code here that turns the phrase above into concrete action
	    	 
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\Desktop\\selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            
           driver.get("https://www.makemytrip.com");
            driver.manage().window().maximize();
            //selecting hotel tab 
            driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a/span[1]")).click();
            
            //selecting city
            driver.findElement(By.id("city")).click();
            WebElement SB=driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']"));
            SB.click();
            SB.sendKeys("Hablis chennai");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div//li//p[contains(text(),'Hablis, Chennai, Tamil Nadu')]")).click();
             
            //selecting checkindate
            driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Month'][2]//div[text()='2']")).click();
            Thread.sleep(2000);
         
           //selecting checkout
            driver.findElement(By.xpath("//div[@class='DayPicker-Months']//div[@class='DayPicker-Month'][2]//div[text()='17']")).click();
            Thread.sleep(2000);
            
            
            //selecting rooms&guests
            driver.findElement(By.id("guest")).click(); 
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='primaryBtn btnApply']")).click();
            driver.findElement(By.id("hsw_search_button")).click();
           
            driver.findElement(By.id("htl_id_seo_201307041346304457")).click();
            Thread.sleep(2000);
            //BOOK now button
            driver.findElement(By.id("//*[@class='primaryBtn capText  ']")).click();
          //  driver.findElement(By.id("detpg_headerright_book_now")).click();
          
         // driver.findElement(By.xpath("//span[@class='fcTooltip__outer ']")).click();
            
            //guest details 
            
            Select drptitle=new Select( driver.findElement(By.id("title")));
            drptitle.selectByVisibleText("Ms");
            
            driver.findElement(By.id("fName")).sendKeys("Pavithra");
            driver.findElement(By.id("lName")).sendKeys("M");
            driver.findElement(By.id("email")).sendKeys("paviselvi1998@gmail.com");
            driver.findElement(By.id("mNo")).sendKeys("7871871227");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='btnContinuePayment primaryBtn capText  '] ")).click();
            
            
           // driver.findElement(By.xpath("")).click();
           
            
          /*  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div/input")).click();
            
            driver.findElement(By.name("dt12")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"owl-dt-picker-0\"]/div[2]/owl-date-time-calendar/div[2]/owl-date-time-month-view/table/tbody/tr[6]/td[1]")).click();
            
            driver.findElement(By.xpath("//*[@id='TravellerEconomydropdown']/div[1]/searchbox/input")).click();
            WebElement Ph=driver.findElement(By.xpath("//input[@placeholder='Enter hotel name or city name']"));
            Ph.clear();
            Ph.sendKeys("Iitm");
     Ph.sendKeys(Keys.ENTER);
     driver.findElement(By.xpath("//div[@style='max-height: 290px; display: block;']/ul/li/a")).click();
     driver.findElement(By.xpath("//*[@id='TravellerEconomydropdown']/div[5]/button")).click();
     driver.findElement(By.xpath("//button[@class='btn btn-primary-custom btn-primary m-0 btn-lg']")).click();
     
    */
     }
}
 