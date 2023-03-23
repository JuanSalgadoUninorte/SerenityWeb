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
import question.demoqa.AnswerOfElementsDemoQA;
import task.demoqa.ElementsDemoQA;
import task.demoqa.OpenUpDemoQA;

public class ElementsStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Access to the page")
    public void accessToThePage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoQA.thePage());
    }

    @When("I interact with the components")
    public void iInteractWithTheComponents(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(ElementsDemoQA.fillOut(DemoQAModel.setData(dataTable).get(0)));    }

    @Then("I had finished my work")
    public void iHadFinishedMyWork(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerOfElementsDemoQA.finished(DemoQAModel.setData(dataTable).get(0))));
    }

}
