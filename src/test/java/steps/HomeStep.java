package steps;

import Page.Pages;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

public class HomeStep {
    public Pages page;

    @Given("User open application")
    public void user_open_application() {
        System.out.println("User open application");
    }
    @When("User on welcome screen")
    public void user_on_welcome_screen() {
        System.out.println("User on welcome screen");
    }

    @Then("I login with {string} and {string}")
    public void i_login_with_and(String userName, String pwd) {
         page = new Pages();
         page.sum(userName, pwd);
       // System.out.println("My credentials :: " + userName + " and  password is :: " + pwd);
    }


    @Given("I entered my credentials")
    public void i_entered_my_credentials(DataTable dataTable) {
        List<List<String>> list = dataTable.asLists(String.class);
        System.out.println(list.get(0).get(0));
        System.out.println(list.get(0).get(1));
        System.out.println(list.get(0).get(2));

    }
    @Then("I verify login failed")
    public void i_verify_login_failed() {
        System.out.println("I verify login failed");
    }

}
