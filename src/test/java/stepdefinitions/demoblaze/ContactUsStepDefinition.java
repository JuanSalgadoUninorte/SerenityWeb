package stepdefinitions.demoblaze;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.demoblaze.AnswerContactUsDemoBlaze;
import question.demoblaze.AnswerCreateAccountDemoBlaze;
import task.demoblaze.ContactUs;
import task.demoblaze.OpenUpDemoBlaze;

public class ContactUsStepDefinition {

    @Given("Juan is on the web page")
    public void juanIsOnTheWebPage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoBlaze.thePage());
    }

    @When("He gives his information")
    public void heGivesHisInformation(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(ContactUs.fillOut(DemoBlazeModel.setData(dataTable).get(0)));
    }

    @Then("He receives the message confirmation")
    public void heReceivesTheMessageConfirmation(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerContactUsDemoBlaze.finished(DemoBlazeModel.setData(dataTable).get(0))));
    }

}
