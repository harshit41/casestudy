/*package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudytwo {
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

	@When("enter the {string} as username")
	public void enter_the_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@When("enter the {string} as password")
	public void enter_the_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@Then("click on login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Login")).click();
	}



}*/
