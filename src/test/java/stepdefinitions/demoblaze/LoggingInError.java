package stepdefinitions.demoblaze;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.demoblaze.AnswerLogInUnsuccessfullDemoBlaze;
import task.demoblaze.LogIn;
import task.demoblaze.OpenUpDemoBlaze;

public class LoggingInError {

    @Given("The access to the web page is given")
    public void theAccessToTheWebPageIsGiven() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoBlaze.thePage());
    }
    @When("I access some wrong credentials and be logged in")
    public void iAccessSomeWrongCredentialsAndBeLoggedIn(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(LogIn.fillOut(DemoBlazeModel.setData(dataTable).get(0)));

    }

    @Then("I can see the error message")
    public void iCanSeeTheErrorMessage(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLogInUnsuccessfullDemoBlaze.unsuccessful(DemoBlazeModel.setData(dataTable).get(0))));

    }

}
