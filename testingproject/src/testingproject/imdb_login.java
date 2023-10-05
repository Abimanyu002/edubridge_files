package testingproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class imdb_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");		

		WebDriver gm = new ChromeDriver();

		gm.get("https://www.imdb.com/?ref_=nv_home");
		gm.manage().window().maximize();
		gm.findElement(By.xpath("//*[@id=\"imdbHeader\"]/div[2]/div[5]/a/span")).click();
		gm.findElement(By.xpath("//*[@id=\"signin-options\"]/div/div[1]/a[1]/span[2]")).click();
		gm.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("abimanyumutharasan4@gmail.com");
		gm.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("abimanyu,i");
		gm.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	}}