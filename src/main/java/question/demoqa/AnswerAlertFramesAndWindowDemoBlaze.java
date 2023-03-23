package question.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.demoqa.DemoQAFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerAlertFramesAndWindowDemoBlaze implements Question<Boolean> {

    private DemoQAModel demoQAModel;

    public AnswerAlertFramesAndWindowDemoBlaze(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static AnswerAlertFramesAndWindowDemoBlaze finished(DemoQAModel demoQAModel) {
        return new AnswerAlertFramesAndWindowDemoBlaze(demoQAModel);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(DemoQAFields.ALERTS_BUTTON, isVisible()).forNoMoreThan(10).seconds()
        );
        String messageMeeting = Text.of(DemoQAFields.ALERTS_BUTTON).answeredBy(actor);
        return demoQAModel.getMessage().equals(messageMeeting);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
