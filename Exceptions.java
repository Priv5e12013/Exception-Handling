package week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptions {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("visual_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
				
		Thread.sleep(30);
		
		String price = driver.findElement(By.className("inventory_details_price")).getText();
		System.out.println("Price of Backpack "+price);
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		
		driver.findElement(By.xpath("//button[text()='Continue Shopping']/following::button")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Leaf");
		driver.findElement(By.id("last-name")).sendKeys("Tree");
		driver.findElement(By.name("postalCode")).sendKeys("600114");
		
		driver.findElement(By.xpath("//button[text()='Cancel']/following-sibling::input")).click();
		
		String sauceCard = driver.findElement(By.xpath("//div[text()='Payment Information:']/following-sibling::div")).getText();

		System.out.println(sauceCard);
		
		driver.findElement(By.xpath("//button[text()='Finish']")).click();
		
		
	}




}


	

