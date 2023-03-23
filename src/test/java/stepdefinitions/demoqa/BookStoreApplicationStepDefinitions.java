package stepdefinitions.demoqa;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import task.demoqa.BookStoreAndAppTask;
import task.demoqa.OpenUpDemoQA;

public class BookStoreApplicationStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The interaction")
    public void theInteraction() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoQA.thePage());
    }

    @When("The components are already tried")
    public void theComponentsAreAlreadyTried(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(BookStoreAndAppTask.fillOut(DemoQAModel.setData(dataTable).get(0)));
    }

    @Then("Lets go home")
    public void letsGoHome() {

    }

}
