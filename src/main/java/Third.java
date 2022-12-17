import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Third {

    public static void main(String[] args) {
        String CSE_GRAD_COURSES_URL = "https://catalog.apps.asu.edu/catalog/classes/classlist?campusOrOnlineSelection=C&honors=F&level=grad&promod=F&searchType=open&subject=CSE&term=2231";

        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Dhanraj\\chromedriver_win32\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();

        // Launch Website
        driver.navigate().to(CSE_GRAD_COURSES_URL);

        //Maximize the browser
        driver.manage().window().maximize();

        //Scroll down the webpage by 5000 pixels
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("scrollBy(0, 5000)");
//
//        // Click on the Search button
//        driver.findElement(By.linkText("Core Java")).click();

        driver.quit();

    }
}