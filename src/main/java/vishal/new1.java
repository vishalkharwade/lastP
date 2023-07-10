package vishal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.Timeout;

public class new1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");

	ChromeOptions Z=new ChromeOptions();
	Z.addArguments("--remote-allow-origins=*");
	
	WebDriver driver=new ChromeDriver(Z);
	
//	driver.get("https://sbi.co.in/");
	// Navigate to the web page
    driver.get("https://www.example.com");

    // Find the input field
    WebElement inputElement = driver.findElement(By.id("my-input-field"));
    inputElement.clear(); // Clear any existing text

    // Enter the desired text character by character with a delay of 100 milliseconds
    String text = "Hello, world!";
    for (char c : text.toCharArray()) {
        inputElement.sendKeys(String.valueOf(c));
        Thread.sleep(100); // Add a delay between each keystroke
    }

    // Close the browser
   // driver.quit();

}}
