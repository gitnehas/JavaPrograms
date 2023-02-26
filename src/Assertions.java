import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Assertions {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.out.println(" I am a car class");
    
    System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Selenium\\DRIVER_V1\\chromedriver_104.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.automationtesting.co.uk");
    String pageTitle = driver.getTitle();
    Assert.assertEquals("Homepage",pageTitle);
}
}