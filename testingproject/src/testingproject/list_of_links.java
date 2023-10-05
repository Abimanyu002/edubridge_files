package testingproject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class list_of_links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");		

		WebDriver gm = new ChromeDriver();

		gm.get("https://artoftesting.com/samplesiteforselenium"); 
		gm.manage().window().maximize();
		List<WebElement> allLinks = gm.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement link:allLinks){
			boolean enabled=link.isEnabled();
			System.out.println(link.getText() + " - " + link.getAttribute("href") +" - " + enabled );
		}
		gm.quit();
 }
}
 