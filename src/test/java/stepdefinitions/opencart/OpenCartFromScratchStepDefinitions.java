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
import question.opencart.AnswerCreateCartFromScratch;
import task.opencart.OpenUpOpenCart;
import task.opencart.PurchaseFromScratch;

public class OpenCartFromScratchStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Than Juan wants to place an order for some items")
    public void thanJuanWantsToPlaceAnOrderForSomeItems() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpOpenCart.thePage());
    }

    @When("He adds the items to the cart and places the order with his info")
    public void heAddsTheItemsToTheCartAndPlacesTheOrderWithHisInfo(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(PurchaseFromScratch.fillOutTheForm(OpenCartModel.setData(dataTable).get(0)));

    }

    @Then("He confirms that the order is already placed")
    public void heConfirmsThatTheOrderIsAlreadyPlaced(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCreateCartFromScratch.successful(OpenCartModel.setData(dataTable).get(0))));
    }

}
