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
import question.demoblaze.AnswerCreateAccountDemoBlaze;
import task.demoblaze.CreateUser;
import task.demoblaze.OpenUpDemoBlaze;

public class CreateAUserStepDefinition {

    @Before
    public static void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Juan access to the webpage")
    public void juanAccessToTheWebpage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoBlaze.thePage());
    }

    @When("He adds his credentials")
    public void heAddsHisCredentials(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.fillOut(DemoBlazeModel.setData(dataTable).get(0)));
    }

    @Then("He is notified that the user is created")
    public void heIsNotifiedThatTheUserIsCreated(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCreateAccountDemoBlaze.successful(DemoBlazeModel.setData(dataTable).get(0))));
    }

}
