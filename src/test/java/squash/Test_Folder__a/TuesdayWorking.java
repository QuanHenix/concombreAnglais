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

   @Given("today is tuesday")
    public void today_is_tuesday() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get("https://squash-tf.readthedocs.io/en/latest/");
        a = 5;
        c = 12;
    }
		
    @When("i still go to work")
    public void i_still_go_to_work() throws InterruptedException {
        Thread.sleep(300);
        b = 6;
    }

    @Then("i am late")
    public void i_am_late() {
        driver.quit();
        Assert.assertTrue("Calcul faux",c==(a+b));
    }

}
