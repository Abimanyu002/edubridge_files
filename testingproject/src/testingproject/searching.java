package testingproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class searching {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");		

		WebDriver gm = new ChromeDriver();

		gm.get("https://www.imdb.com/?ref_=nv_home");
		gm.manage().window().maximize();
		String searchtxt="Titanic";
		gm.findElement(By.id("suggestion-search")).sendKeys(searchtxt);
		gm.findElement(By.xpath("//*[@id=\"suggestion-search-button\"]")).click();
		WebElement text= gm.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div[3]/section/div/div[1]/section[2]/div[2]/ul/li[1]/div[2]/div/a"));
		String title = (text.getText());
		if(title==searchtxt)
			System.out.println("Titanic is not displayed");
		else
			System.out.println("yes,Titanic is displayed");
		
	}}