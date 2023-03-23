package stepdefinitions.demoblaze;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import question.demoblaze.AnswerLogInLogOutDemoBlaze;
import task.demoblaze.LogIn;
import task.demoblaze.LogOut;
import task.demoblaze.OpenUpDemoBlaze;

public class LogInAndLogOutStepDefinitions {

    @Before
    public static void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The access to the web page")
    public void theAccessToTheWebPage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoBlaze.thePage());
    }

    @When("I access the credentials and be logged in")
    public void iAccessTheCredentialsAndBeLoggedIn(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(LogIn.fillOut(DemoBlazeModel.setData(dataTable).get(0)));
    }

    @Then("I can log out")
    public void iCanLogOut(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(LogOut.getOut(DemoBlazeModel.setData(dataTable).get(0)));
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerLogInLogOutDemoBlaze.successful(DemoBlazeModel.setData(dataTable).get(0))));
    }


}
