package StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class MyStepdefs {
        @Given("Start the execution")
        public void Start_the_execution(){
            System.out.println("script execution started");
        }
        @Then("Execution in Progress")
        public void Execution_in_Progress() {
            System.out.println("script execution in progress");
        }
        @And("Execution Completed")
        public void Execution_Completed(){
            System.out.println("Script Execution Completed");
        }


}
