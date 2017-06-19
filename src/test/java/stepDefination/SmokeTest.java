package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
    WebDriver driver;
	
    @Given("^Open firefox and start application$")
    public void open_firefox_and_start_application() throws Throwable {
       driver=new FirefoxDriver();
       driver.manage().window().maximize();
       driver.navigate().to("http://www.facebook.com");
    }

    @When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_valid_username_and_password(String username, String password) throws Throwable {
      driver.findElement(By.id("email")).sendKeys(username);
      driver.findElement(By.id("pass")).sendKeys(password);
    }

  
    @Then("^User should be able to login Successfully$")
    public void user_should_be_able_to_login_Successfully() throws Throwable {
    	driver.findElement(By.id("u_0_r")).click();
    }
    
    @Then("^application should be closed$")
    public void application_should_be_closed() throws Throwable {
        driver.quit();
    }

}
