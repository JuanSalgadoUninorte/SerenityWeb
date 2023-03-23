package question.opencart;

import model.opencart.OpenCartModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.opencart.OpenCartFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerCreateAccount implements Question<Boolean> {

    private OpenCartModel openCartModel;

    public AnswerCreateAccount(OpenCartModel openCartModel) {
        this.openCartModel = openCartModel;
    }

    public static AnswerCreateAccount successful(OpenCartModel openCartModel) {
        return new AnswerCreateAccount(openCartModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(OpenCartFields.CONFIRM_MESSAGE_REGISTER, isVisible()).forNoMoreThan(10).seconds());
                String welcomeMessage = Text.of(OpenCartFields.CONFIRM_MESSAGE_REGISTER).answeredBy(actor);
                return openCartModel.getSuccessMessage().equals(welcomeMessage);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
