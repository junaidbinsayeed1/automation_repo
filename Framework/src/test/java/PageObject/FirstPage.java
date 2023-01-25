package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage
{
	public WebDriver fpdriver;
	
	public FirstPage(WebDriver fdriver) 
	{
		fpdriver = fdriver;
		PageFactory.initElements(fdriver,this);
	}
	
	
	@FindBy(name = "btnK")
	WebElement googleSearchButton;
	
	public void btn_click()
	{
		googleSearchButton.click();
	}
	
	
	@FindBy(css = "h3.LC20lb.MBeuO.DKV0Md")
	WebElement googleFirstLink;
	
	public void lnk_click()
	{
		googleFirstLink.click();
	}
	
	
	@FindBy(css = "input._2IX_2-.VJZDxU")
	WebElement EnteremailorPhone;
	
	public void enter_email(String emailorphone)
	{
		EnteremailorPhone.sendKeys(emailorphone);
	}
	
	
	@FindBy(css = "input._2IX_2-._3mctLh.VJZDxU")
	WebElement Enterpassword;
	
	public void enter_password(String password)
	{
		Enterpassword.sendKeys(password);
	}
	
	
	@FindBy(css = "button._2KpZ6l._2HKlqd._3AWRsL")
	WebElement loginButton;

	public void login_button() 
	{
		loginButton.click();
	}
	
	
	@FindBy(className = "_3704LK")
	WebElement globalSearchClick;
	
	public void global_search_click()
	{
		globalSearchClick.click();
	}
	
	
	@FindBy(className = "_3704LK")
	WebElement globalSearch;
	
	public void global_search(String text)
	{
		globalSearch.sendKeys(text);
	}
	
	
	@FindBy(className = "_34RNph")
	WebElement globalSearchButton;
	
	public void global_search_button()
	{
		globalSearchButton.click();
	}
	
	
	@FindBy(xpath = "//*[@title='PS5 FIFA 22 (Standard)']")
	WebElement clickOnGame;
	
	public void click_on_game()
	{
		clickOnGame.click();
	}
	
	
	@FindBy(css = "button._2KpZ6l._2U9uOA._3v1-ww")
	WebElement addToCartButton;
	
	public void add_to_cart_button()
	{
		addToCartButton.click();
	}
	

	@FindBy(css = "button._2KpZ6l._2ObVJD._3AWRsL")
	WebElement placeOrderButton;
	
	public void place_order_button()
	{
		placeOrderButton.click();
	}
	
	
	@FindBy(xpath = "//*[@class='_23FHuj'][2]")
	WebElement increaseQuantity;
	
	public void increase_quantity()
	{
		increaseQuantity.click();
	}
	
	
	@FindBy(css = "button._2KpZ6l._1seccl._3AWRsL")
	WebElement continueButton;
	
	public void click_on_continue_button()
	{
		continueButton.click();
	}
	
	
	@FindBy(className = "_1XFPmK")
	WebElement upiButton;
	
	public void click_on_upi_button()
	{
		upiButton.click();
	}
	
	
	@FindBy(className = "_1XFPmK")
	WebElement phonepeButton;
	
	public void click_on_phonepe_button()
	{
		phonepeButton.click();
	}
	
	
	@FindBy(css = "button._2KpZ6l._3JboYb._3AWRsL")
	WebElement secondContinueButton;
	
	public void click_on_second_continue_button()
	{
		secondContinueButton.click();
	}
	
}
