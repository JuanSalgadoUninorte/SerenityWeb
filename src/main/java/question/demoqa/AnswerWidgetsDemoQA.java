package question.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.demoqa.DemoQAFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerWidgetsDemoQA implements Question<Boolean> {

    private DemoQAModel demoQAModel;

    public AnswerWidgetsDemoQA(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static AnswerWidgetsDemoQA finished(DemoQAModel demoQAModel) {
        return new AnswerWidgetsDemoQA(demoQAModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(DemoQAFields.SLIDER, isVisible()).forNoMoreThan(10).seconds());
        String confirmation = Text.of(DemoQAFields.SLIDER).answeredBy(actor);
        return demoQAModel.getFinished().equals(confirmation);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
