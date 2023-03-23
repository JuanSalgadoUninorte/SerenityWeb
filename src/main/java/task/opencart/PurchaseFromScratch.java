package task.opencart;

import model.opencart.OpenCartModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterface.opencart.OpenCartFields;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class PurchaseFromScratch implements Task {


    private OpenCartModel openCartModel;

    public PurchaseFromScratch(OpenCartModel openCartModel) {
        this.openCartModel = openCartModel;
    }

    public static PurchaseFromScratch fillOutTheForm(OpenCartModel openCartModel) {
        return Tasks.instrumented(PurchaseFromScratch.class, openCartModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OpenCartFields.LOOKFOR_FIELD, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(openCartModel.getDeviceName1()).into(OpenCartFields.LOOKFOR_FIELD),
                Hit.the(Keys.ENTER).into(OpenCartFields.LOOKFOR_FIELD),
                Click.on(OpenCartFields.ADD_ITEM),
                Enter.theValue(openCartModel.getDeviceName2()).into(OpenCartFields.LOOKFOR_FIELD),
                Hit.the(Keys.ENTER).into(OpenCartFields.LOOKFOR_FIELD),
                Click.on(OpenCartFields.ADD_ITEM),
                WaitUntil.the(OpenCartFields.CHECKOUT1, isVisible()).forNoMoreThan(30).seconds(),
                Scroll.to(OpenCartFields.CHECKOUT1),
                WaitUntil.the(OpenCartFields.CHECKOUT1, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(OpenCartFields.CHECKOUT1),
                WaitUntil.the(OpenCartFields.CHECKOUT, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(OpenCartFields.CHECKOUT),
                Scroll.to(OpenCartFields.START).then(Click.on(OpenCartFields.START)),
                Scroll.to(OpenCartFields.PROCEED).then(Click.on(OpenCartFields.PROCEED)),
                Click.on(OpenCartFields.CONTINUE),
                Enter.theValue(openCartModel.getFirstName()).into(OpenCartFields.FIRSTNAME_PURCHSE),
                Enter.theValue(openCartModel.getLastName()).into(OpenCartFields.LASTNAME_PURCHSE),
                Enter.theValue(openCartModel.getEmail()).into(OpenCartFields.EMAIL_PURCHASE),
                Enter.theValue(openCartModel.getPhone()).into(OpenCartFields.PHONE_NUMBER),
                Enter.theValue(openCartModel.getPassword()).into(OpenCartFields.PASSWORD_PAYMENT),
                Enter.theValue(openCartModel.getPassword()).into(OpenCartFields.CONFIRM_PASSWORD_PAYMENT),
                Enter.theValue(openCartModel.getAddress1()).into(OpenCartFields.DELIVERY_ADDRESS),
                Enter.theValue(openCartModel.getPostCode()).into(OpenCartFields.POST_CODE),
                Enter.theValue(openCartModel.getCity()).into(OpenCartFields.CITY),
                SelectFromOptions.byVisibleText(openCartModel.getCountry()).from(OpenCartFields.COUNTRY),
                SelectFromOptions.byVisibleText(openCartModel.getRegionState()).from(OpenCartFields.REGION),
                SetCheckbox.of(OpenCartFields.PRIVACYANDPOLICIES).toTrue(),
                Scroll.to(OpenCartFields.CONTINUE2).then(Click.on(OpenCartFields.CONTINUE2)),
                Scroll.to(OpenCartFields.CONTINUE3).then(Click.on(OpenCartFields.CONTINUE3)),
                Enter.theValue(openCartModel.getComment()).into(OpenCartFields.TEXAREA_COMMENT),
                Scroll.to(OpenCartFields.CONTINUE4).then(Click.on(OpenCartFields.CONTINUE4)),
                Click.on(OpenCartFields.PSYSICAL_PAYMENT),
                SetCheckbox.of(OpenCartFields.CONDITIONS).toTrue(),
                Scroll.to(OpenCartFields.CONTINUE5).then(Click.on(OpenCartFields.CONTINUE5)),
                Click.on(OpenCartFields.FINISH),
                WaitUntil.the(OpenCartFields.COMPLETED, isVisible()).forNoMoreThan(30).seconds()


        );
    }
}
