package question.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.demoqa.DemoQAFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerInteractionsDemoQA implements Question<Boolean> {

    private DemoQAModel demoQAModel;

    public AnswerInteractionsDemoQA(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static AnswerInteractionsDemoQA finished(DemoQAModel demoQAModel) {
        return new AnswerInteractionsDemoQA(demoQAModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(DemoQAFields.CURSOR_STYLE, isVisible()).forNoMoreThan(10).seconds());
        String confirmation = Text.of(DemoQAFields.CURSOR_STYLE).answeredBy(actor);
        return demoQAModel.getFinished().equals(confirmation);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
