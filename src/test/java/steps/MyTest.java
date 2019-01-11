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
        Assert.fail("I am just failing to test");
    }

    @Then("user adds new step")
    public void user_adds_new_step() {
        System.out.println("last step here");
    }

}
