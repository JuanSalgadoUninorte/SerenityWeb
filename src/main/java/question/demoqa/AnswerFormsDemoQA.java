package question.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.demoqa.DemoQAFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerFormsDemoQA implements Question<Boolean> {

    private DemoQAModel demoQAModel;

    public AnswerFormsDemoQA(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static AnswerFormsDemoQA confirmation(DemoQAModel demoQAModel) {
        return new AnswerFormsDemoQA(demoQAModel);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.CONFIRMATION_MESSAGE, isVisible()).forNoMoreThan(10).seconds()
        );
        String messageOfConfirmation = Text.of(DemoQAFields.CONFIRMATION_MESSAGE).answeredBy(actor);
        return demoQAModel.getConfirmationMessage().equals(messageOfConfirmation);
    }
}
