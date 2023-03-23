package stepdefinitions.opencart;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.opencart.OpenCartModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.opencart.AnswerCreateAccount;
import task.opencart.AccessToRegister;
import task.opencart.CreateUserOpenCart;
import task.opencart.OpenUpOpenCart;

public class CreateAnAccountStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Than Juan wants to create his account")
    public void thanJuanWantsToCreateHisAccount() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpOpenCart.thePage());
        OnStage.theActorInTheSpotlight().attemptsTo(AccessToRegister.access());
    }

    @When("He adds the right info in the form")
    public void heAddsTheRightInfoInTheForm(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUserOpenCart.fillOut(OpenCartModel.setData(dataTable).get(0)));
    }

    @Then("The system has successfully created the account")
    public void theSystremHasSuccessfullyCreatedTheAccount(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCreateAccount.successful(OpenCartModel.setData(dataTable).get(0))));
    }

}
