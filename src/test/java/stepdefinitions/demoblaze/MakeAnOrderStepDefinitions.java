package stepdefinitions.demoblaze;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import question.demoblaze.AnswerPlaceAnOrder;
import task.demoblaze.LogIn;
import task.demoblaze.OpenUpDemoBlaze;
import task.demoblaze.PlaceAnOrder;

public class MakeAnOrderStepDefinitions {

    @Before
    public static void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("Access into the web page")
    public void accessIntoTheWebPage() {
        OnStage.theActorCalled("Juan").wasAbleTo(OpenUpDemoBlaze.thePage());
    }

    @When("The information of the items is added to the cart and the order is placed")
    public void theInformationOfTheItemsIsAddedToTheCartAndTheOrderIsPlaced(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(PlaceAnOrder.fillOut(DemoBlazeModel.setData(dataTable).get(0)));
    }

    @Then("He confirms that the purchase is placed")
    public void heConfirmsThatThePurchaseIsPlaced(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPlaceAnOrder.accomplished(DemoBlazeModel.setData(dataTable).get(0))));
    }

}
