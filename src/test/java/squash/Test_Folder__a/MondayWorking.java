package squash.Test_Folder__a;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MondayWorking {

    WebDriver driver;
    int a;
    int b;
    int c;

   @Given("today is monday")
    public void today_is_monday() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("https://squash-tf.readthedocs.io/en/latest/");
        a = 5;
        c = 11;
    }
		
    @When("i go to work")
    public void i_go_to_work() throws InterruptedException {
        Thread.sleep(300);
        b = 6;
    }

    @Then("i am at the office")
    public void i_am_at_the_office() {
        driver.quit();
        Assert.assertTrue("Calcul faux",c==(a+b));
    }

}
