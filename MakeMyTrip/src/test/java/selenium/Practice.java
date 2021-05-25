package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	
	 public static void main(String[] args) throws Exception {
	 
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Lakshmi\\Desktop\\selenium\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          
       /*  driver.get("https://www.makemytrip.com");
          driver.manage().window().maximize();
          //selecting hotel 
          driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a/span[1]")).click();
          
          //selecting city
          String OptionToSelect="The Vijay Park(Madhavaram),Chennai,Tamilnadu";
          int count=0;
          driver.findElement(By.id("city")).click();
          WebElement Ph=driver.findElement(By.xpath("//input[@placeholder='Enter city/ Hotel/ Area/ Building']"));
          Ph.clear();
          Ph.sendKeys("The Vijay");
          //sendKeys("The Vijay")
          Thread.sleep(3000);
          List<WebElement> optionsList=driver.findElements(By.xpath("//*[@class='react-autosuggest__suggestions-container react-autosuggest__suggestions-container--open']"));
	 
           for(WebElement ele:optionsList) {
        	   String currentoption=ele.getText();
        	   if(currentoption.contains(OptionToSelect)) {
        		   
        		   ele.click();
        		   count++;
        		   break;
        		   
        	   }
           }
	 if(count!=0) {
		 System.out.println("correct city is selected");
	 }
	 else {
		 System.out.println("No city is available");
		 
	 }
	 
	 */
	 
	 
          driver.get("https://www.makemytrip.com/hotels/hotel-details/?hotelId=201307041346304457&mtkeys=defaultMtkey&_uCurrency=INR&checkin=06022021&checkout=06172021&city=CTMAA&country=IN&lat=13.00764&lng=80.20815&locusId=CTMAA&locusType=city&rank=1&roomStayQualifier=2e0e&searchText=Hablis%2C%20Chennai%2C%20Tamil%20Nadu&topHtlId=201307041346304457&visitorId=3245697f-212f-47cb-a1b9-43e6d3716548");
          driver.manage().window().maximize();
          //driver.findElement(By.id("detpg_headerright_book_now")).click();
         driver.findElement(By.xpath("//span[@class='fcTooltip__outer ']")).click();
       //   driver.findElement(By.id("//*[@class='primaryBtn capText  ']")).click();
	 
	 
	 
	 }

}
