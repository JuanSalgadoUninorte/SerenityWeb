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
import question.opencart.AnswerCreateCartLoggedIn;
import task.opencart.OpenUpOpenCart;
import task.opencart.PurchaseLoggedIn;

public class OpenCartLoggedInStepDefinitions {

    @Before
    public static void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Than Juan wants to place with his account and he is logged in")
    public void thanJuanWantsToPlaceWithHisAccountAndHeIsLoggedIn() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpOpenCart.thePage());
    }

    @When("He adds the items to the cart and places the order")
    public void heAddsTheItemsToTheCartAndPlacesTheOrder(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(PurchaseLoggedIn.fillOutTheForm(OpenCartModel.setData(dataTable).get(0)));
    }

    @Then("He logged in confirms that the order is already placed")
    public void heLoggedInConfirmsThatTheOrderIsAlreadyPlaced(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerCreateCartLoggedIn.successful(OpenCartModel.setData(dataTable).get(0))));
    }
}
