package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Driver;

public class MyTest {

    @When("user tests")
    public void user_tests() {
        System.out.println("First method");
    }

    @Then("user gets")
    public void user_gets() {
        System.out.println("Second step here");

    }

    @Then("user adds new step")
    public void user_adds_new_step() {

        System.out.println("last step here");
        Assert.fail("On purpose failure");
    }

    @When("user logs in")
    public void user_logs_in() {
        Driver.getDriver().get("http://google.com");
    }

    @Then("user passes credentials")
    public void user_passes_credentials() {
        Driver.getDriver().findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
    }

    @Then("user checks")
    public void user_checks() {
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("apple"));
    }

}
