import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.out.println(" I am a car class");
    
    System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Selenium\\DRIVER_V1\\chromedriver_104.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.automationtesting.co.uk/dropdown.html");
    Select menuItem = new Select(driver.findElement(By.cssSelector("select#cars")));
    //menuItem.selectByVisibleText("Jeep");
    menuItem.selectByValue("suzuki");
}
}