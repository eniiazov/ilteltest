package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

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
    }

    @When("user logs in")
    public void user_logs_in() {
        System.out.println("User trying to log in");
    }

    @Then("user passes credentials")
    public void user_passes_credentials() {
        System.out.println("User passing the credentials");
    }

    @Then("user checks")
    public void user_checks() {
        System.out.println("User is checking login functionality");
    }

}
