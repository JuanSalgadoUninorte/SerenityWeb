package question.opencart;

import model.opencart.OpenCartModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.opencart.OpenCartFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerCreateCartFromScratch implements Question<Boolean> {

    private OpenCartModel openCartModel;

    public AnswerCreateCartFromScratch(OpenCartModel openCartModel) {
        this.openCartModel = openCartModel;
    }

    public static AnswerCreateCartFromScratch successful(OpenCartModel openCartModel) {
        return new AnswerCreateCartFromScratch(openCartModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(OpenCartFields.COMPLETED, isVisible()).forNoMoreThan(10).seconds());
        String welcomeMessage = Text.of(OpenCartFields.COMPLETED).answeredBy(actor);
        return "Your order has been placed!".equals(welcomeMessage);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
