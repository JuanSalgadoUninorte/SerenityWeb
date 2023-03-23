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
import question.demoqa.AnswerInteractionsDemoQA;
import task.demoqa.InteractionsDemoQATask;
import task.demoqa.OpenUpDemoQA;

public class InteractionsStepDefinitions {

    @Before
    public static void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The components")
    public void theComponents() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoQA.thePage());
    }

    @When("All are tried")
    public void allAreTried() {
        OnStage.theActorInTheSpotlight().attemptsTo(InteractionsDemoQATask.fillOut());
    }

    @Then("We are done")
    public void weAreDone(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerInteractionsDemoQA.finished(DemoQAModel.setData(dataTable).get(0))));

    }

}
