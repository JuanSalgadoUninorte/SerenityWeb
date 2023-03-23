package stepdefinitions.demoqa;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import question.demoqa.AnswerAlertFramesAndWindowDemoBlaze;
import task.demoqa.AlertsFramesAndWindowsTask;
import task.demoqa.OpenUpDemoQA;

public class AlertsFrameAndWindowsStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The elements")
    public void theElements() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoQA.thePage());
    }

    @When("I interact with those")
    public void iInteractWithThose(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(AlertsFramesAndWindowsTask.enterInto(DemoQAModel.setData(dataTable).get(0)));
    }

    @Then("All are done")
    public void allAreDone(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerAlertFramesAndWindowDemoBlaze.finished(DemoQAModel.setData(dataTable).get(0))));
    }

}
