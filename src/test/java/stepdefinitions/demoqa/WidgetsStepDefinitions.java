package stepdefinitions.demoqa;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.demoqa.AnswerWidgetsDemoQA;
import task.demoqa.FormsDemoQA;
import task.demoqa.OpenUpDemoQA;
import task.demoqa.WidgetsDemoQATask;

public class WidgetsStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("The web page")
    public void theWebPage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoQA.thePage());
    }

    @When("I access to the components")
    public void iAccessToTheComponents(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(WidgetsDemoQATask.fillOut(DemoQAModel.setData(dataTable).get(0)));
    }

    @Then("We had finished")
    public void weHadFinished(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerWidgetsDemoQA.finished(DemoQAModel.setData(dataTable).get(0))));

    }

}
