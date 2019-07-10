package casestudy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class casestudyfour {
	WebDriver driver;

@Given("url of TestMeApp {string}")
public void url_of_TestMeApp(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	String chpath = "C:\\Users\\a07208trng_b4a.04.26\\Desktop\\cucumber\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", chpath);
	 driver = new ChromeDriver();
	driver.get(string);
}

@When("ali enter the {string} as username")
public void ali_enter_the_as_username(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.id("userName")).sendKeys(string);
}

@When("ali ente the {string} as password")
public void ali_ente_the_as_password(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.id("password")).sendKeys(string);
}

@When("ali click on login button")
public void ali_click_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
	driver.findElement(By.name("Login")).click();
}

@When("ali enter the {string} in search bar")
public void ali_enter_the_in_search_bar(String string) {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.id("myInput")).sendKeys(string);
}

@When("ali click on find item")
public void ali_click_on_find_item() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@Then("ali check cart option is available or not")
public void ali_check_cart_option_is_available_or_not() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	Assert.assertFalse(driver.findElement(By.xpath("a[contains(text(),'Cart')]")).isDisplayed());
}



}
