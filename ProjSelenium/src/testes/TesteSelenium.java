package testes;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteSelenium {
	
	 public WebDriver driver;   
	 
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse2\\chromedriver_win32\\chromedriver.exe");
		  driver= new ChromeDriver(); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		driver.get("https://www.magazineluiza.com.br/");
		assertTrue("titulo diferente",driver.getTitle().contentEquals("Magazine Luiza | Pra você é Magalu!"));
		
		WebElement busca = driver.findElement(By.id("input-search"));
		busca.click();
		
		busca.sendKeys("xiaomi");
	    busca.sendKeys(Keys.ENTER);
		
		
	}

}
