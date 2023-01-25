package StepDefination;

import java.time.Duration;
import java.util.ArrayList;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.FirstPage;
import io.cucumber.java.en.*;

public class Steps {

	public WebDriver driver;
	public FirstPage fp;

	
	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Browser drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		fp = new FirstPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	@When("user is on google search page")
	public void user_is_on_google_search_page() 
	{
		driver.get("https://www.google.com/");
	}

	
	@Then("user need to type flipkart keyword")
	public void user_need_to_type() 
	{
		driver.findElement(By.name("q")).sendKeys("flipkart");
	}

	
	@Then("user need to click on google search button")
	public void user_need_to_click_on_google_search_button() 
	{
		fp.btn_click();
	}

	
	@Then("user need to click on first link")
	public void user_need_to_click_on_first_link()
	{
		fp.lnk_click();
	}

	
	@Given("user is on flipkart homepage")
	public void user_is_on_homepage()
	{
		Assert.assertEquals(driver.getTitle(), driver.getTitle());
		System.out.println(driver.getTitle());
	}

	
	@When("^user needs to provide (.*) and (.*)$")
	public void user_needs_to_provide_creds(String emailorphone, String password) 
	{
		fp.enter_email(emailorphone);
		fp.enter_password(password);
	}

	
	@Then("user need to click on login button")
	public void user_need_to_click_on_login_button()
	{
		fp.login_button();
	}

	
	@Then("user need to click on global search bar")
	public void user_need_to_clicks_on_search_bar() 
	{
		driver.navigate().refresh();
		fp.global_search_click();
	}

	
	@And("^user needs to type (.*) in the search bar$")
	public void user_needs_to_type_text_in_the_search_bar(String text) 
	{
		fp.global_search(text);
	}

	
	@Then("user need to click on global search button")
	public void user_needs_to_click_on_search_button() 
	{
		fp.global_search_button();
	}

	
	@Then("user needs to click on required game")
	public void user_needs_to_click_on_fifa_game() 
	{
		fp.click_on_game();
	}

	
	@Then("user needs to click on add to cart button")
	public void user_needs_to_click_on_add_to_cart_button()
	{
		ArrayList<String> wid = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(wid.get(1));
	    fp.add_to_cart_button();
	}

	
	@And("user needs to click on place order button")
	public void user_needs_to_click_on_place_order_button()
	{
		fp.place_order_button();
	}
	
	
	@Then("user needs to increase the quantity")
	public void user_needs_to_increase_the_quantity() 
	{
		fp.increase_quantity();		
	}

	
	@Then("user needs to click on continue button")
	public void user_needs_to_click_on_continue_button() 
	{
		fp.click_on_continue_button();
	}

	
	@Then("user needs to click on UPI radio button")
	public void user_needs_to_click_on_upi_radio_button() 
	{
		fp.click_on_upi_button();
	}

	
	@Then("user needs to click on phonepe radio button")
	public void user_needs_to_click_on_phonepe_radio_button()
	{
		fp.click_on_phonepe_button();
	}

	
	@And("user needs to click on continue button again")
	public void user_needs_to_click_on_continue_button_again()
	{
		fp.click_on_second_continue_button();
	}

	
	@Then("user needs to verify the first line on phonepe page")
	public void user_needs_to_verify_the_first_line_on_phonepe_page() 
	{
		Assert.assertTrue("Scan & Pay via PhonePe", false);
	}

}
