/*package casestudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudythree {
	
	WebDriver driver;
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String chpath = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\cucumber\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chpath);
		 driver = new ChromeDriver();
		driver.get(string);
	}

	@When("alen enter the {string} as username")
	public void alen_enter_the_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("alen ente the {string} as password")
	public void alen_ente_the_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("alen click on login button")
	public void alen_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}
	
	@When("alex enter the {string} in search bar")
	public void alex_enter_the_in_search_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("myInput")).sendKeys(string);
	}

	@When("alex click on find item")
	public void alex_click_on_find_item() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		//throw new cucumber.api.PendingException();
	}
	

	@When("alex click on add to chart")
	public void alex_click_on_add_to_chart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@When("alex click on cart")
	public void alex_click_on_cart() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	}

	@When("alex  click on checkout")
	public void alex_click_on_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	}

	@When("alex click on procced to pay")
	public void alex_click_on_procced_to_pay() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}

	@When("alex select bank")
	public void alex_select_bank() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[contains(text(), 'HDFC Bank')]")).click();
	}

	@When("alex click on countiue for pay")
	public void alex_click_on_countiue_for_pay() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
	}

	@When("alex enter {string} as username")
	public void alex_enter_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    driver.findElement(By.name("username")).sendKeys(string);
	}

	@When("alex enter {string} as password")
	public void alex_enter_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	    driver.findElement(By.name("password")).sendKeys(string);
	}

	@When("alex click on login button to enter bankaccount")
	public void alex_click_on_login_button_to_enter_bankaccount() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	}

	@When("alex enter {string} as transactionpwd")
	public void alex_enter_as_transactionpwd(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException(); 
		driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/input")).sendKeys(string);
	}

	@Then("alex click on login button for transaction")
	public void alex_click_on_login_button_for_transaction() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		//throw new cucumber.api.PendingException(); 
	}




}*/
