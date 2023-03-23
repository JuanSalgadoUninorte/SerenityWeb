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
import question.demoqa.AnswerFormsDemoQA;
import task.demoqa.FormsDemoQA;
import task.demoqa.OpenUpDemoQA;

public class FormsStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The page")
    public void thePage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoQA.thePage());
    }

    @When("All the components are tested")
    public void allTheComponentsAreTested(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FormsDemoQA.fillOut(DemoQAModel.setData(dataTable).get(0)));
    }

    @Then("I can go home")
    public void iCanGoHome(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerFormsDemoQA.confirmation(DemoQAModel.setData(dataTable).get(0))));
    }

}
