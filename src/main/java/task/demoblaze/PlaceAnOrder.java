package task.demoblaze;

import model.demoblaze.DemoBlazeModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import userinterface.demoblaze.DemoBlazeFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PlaceAnOrder implements Task {

    private DemoBlazeModel demoBlazeModel;

    public PlaceAnOrder(DemoBlazeModel demoBlazeModel) {
        this.demoBlazeModel = demoBlazeModel;
    }

    public static PlaceAnOrder fillOut(DemoBlazeModel demoBlazeModel) {
        return Tasks.instrumented(PlaceAnOrder.class, demoBlazeModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    WaitUntil.the(DemoBlazeFields.PHONES_MENU, isVisible()).forNoMoreThan(30).seconds(),
                    Click.on(DemoBlazeFields.PHONES_MENU),
                    Click.on(DemoBlazeFields.PHONE_TO_SELECT),
                    Click.on(DemoBlazeFields.ADD_ITEM),
                    WaitUntil.the(DemoBlazeFields.ADD_ITEM, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on("//*[contains(text(), 'Home')]"),
                    Click.on(DemoBlazeFields.LAPTOPS),
                    Click.on(DemoBlazeFields.PC_TO_SELECT),
                    Click.on(DemoBlazeFields.ADD_ITEM),
                    Switch.toAlert().andAccept(),
                    Click.on("//*[contains(text(), 'Home')]"),
                    WaitUntil.the(DemoBlazeFields.GO_TO_CART, isVisible()).forNoMoreThan(10).seconds(),
                    Click.on(DemoBlazeFields.GO_TO_CART),
                    Click.on(DemoBlazeFields.PLACE_ORDER),
                    Enter.theValue(demoBlazeModel.getName()).into(DemoBlazeFields.NAME_FIELD),
                    Enter.theValue(demoBlazeModel.getCountry()).into(DemoBlazeFields.COUNTRY_FIELD),
                    Enter.theValue(demoBlazeModel.getCity()).into(DemoBlazeFields.CITY_FIELD),
                    Enter.theValue(demoBlazeModel.getCreditCard()).into(DemoBlazeFields.CARD_FIELD),
                    Enter.theValue(demoBlazeModel.getMonth()).into(DemoBlazeFields.MONTH_FIELD),
                    Enter.theValue(demoBlazeModel.getYear()).into(DemoBlazeFields.YEAR_FIELD),
                    Click.on(DemoBlazeFields.FINISH_ORDER)
            );
    }
}
