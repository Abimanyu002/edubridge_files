package testingproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class sort_reviews {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");		

		WebDriver gm = new ChromeDriver();

		gm.get("https://www.imdb.com/title/tt0120338/?ref_=fn_al_tt_1");
		gm.manage().window().maximize();
		gm.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section[1]/section/div[3]/section/section/div[1]/div/div[2]/ul/li[2]/a")).click();
		gm.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/div[1]/form/div/div[2]/select")).click();
		gm.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/div[1]/form/div/div[2]/select/option[2]")).click();
		gm.findElement(By.xpath("//*[@id=\"main\"]/section/div[2]/div[1]/form/div/div[2]/span")).click();
		
	}
}