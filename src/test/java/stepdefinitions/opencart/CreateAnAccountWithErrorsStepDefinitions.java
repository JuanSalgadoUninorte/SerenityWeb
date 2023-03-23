package stepdefinitions.opencart;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.opencart.OpenCartModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import question.opencart.AnswerCreateAccountWithErrors;
import task.opencart.AccessToRegister;
import task.opencart.CreateUserOpenCart;
import task.opencart.OpenUpOpenCart;

public class CreateAnAccountWithErrorsStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Than Juan wants create his account")
    public void thanJuanWantsCreateHisAccount() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpOpenCart.thePage());
        OnStage.theActorInTheSpotlight().attemptsTo(AccessToRegister.access());
    }

    @When("He add the wrong info")
    public void heAddTheWrongInfo(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUserOpenCart.fillOut(OpenCartModel.setData(dataTable).get(0)));
    }

    @Then("The system doesnt let him proceed")
    public void theSystemDoesntLetHimProceed(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCreateAccountWithErrors.unsuccessful(OpenCartModel.setData(dataTable).get(0))));
    }
}
