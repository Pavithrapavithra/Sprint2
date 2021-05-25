package utiltest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;




public class TestBase {

        public static WebDriver driver;
        public static Properties prop;
        
        public TestBase() {
        
            try {
                prop = new Properties();
                FileInputStream file = new FileInputStream("C:\\Users\\Lakshmi\\eclipse-workspace\\MakeMyTrip\\src\\test\\java\\feature\\configs\\configuration.properties");
                prop.load(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }

 

        public static void initialization(){
            String browserName = prop.getProperty("browser");
            
             if(browserName.equals("Chrome")){    
                driver = new ChromeDriver(); 
            }
             if (browserName.equals("Firefox"))
             {    
                    driver = new FirefoxDriver(); 
                }
                
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            
            driver.get(prop.getProperty("url"));
    }
    }
    


