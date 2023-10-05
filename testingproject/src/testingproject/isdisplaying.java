package testingproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class isdisplaying {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");		

		WebDriver gm = new ChromeDriver();

		gm.get("https://www.imdb.com/title/tt0120338/?ref_=fn_al_tt_1");
		gm.manage().window().maximize();
		boolean playingvid =gm.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[3]/div[1]/div[1]/div/a")).isDisplayed();
		if(playingvid==false)
			System.out.println("it is not displayed");
		else
			System.out.println("yes,it is displayed");
		
	}}