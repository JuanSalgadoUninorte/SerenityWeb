package question.demoqa;

import model.demoqa.DemoQAModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.demoqa.SecondPartOfFields;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AnswerOfElementsDemoQA implements Question<Boolean> {

    private DemoQAModel demoQAModel;

    public AnswerOfElementsDemoQA(DemoQAModel demoQAModel) {
        this.demoQAModel = demoQAModel;
    }

    public static AnswerOfElementsDemoQA finished(DemoQAModel demoQAModel) {
        return new AnswerOfElementsDemoQA(demoQAModel);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(SecondPartOfFields.LAST_MESSAGE, isVisible()).forNoMoreThan(10).seconds());
        String message = Text.of(SecondPartOfFields.LAST_MESSAGE).answeredBy(actor);
        return message.equals(demoQAModel.getLastMessage());
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }

}
