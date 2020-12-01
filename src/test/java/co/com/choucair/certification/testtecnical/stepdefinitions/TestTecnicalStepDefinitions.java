package co.com.choucair.certification.testtecnical.stepdefinitions;

import co.com.choucair.certification.testtecnical.model.TestTecnicalData;
import co.com.choucair.certification.testtecnical.questions.Answer;
import co.com.choucair.certification.testtecnical.tasks.Login;
import co.com.choucair.certification.testtecnical.tasks.OpenUp;
import co.com.choucair.certification.testtecnical.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;


public class TestTecnicalStepDefinitions {

    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
    }

    @Dado("que Claudia quiere buscar vestidos")
    public void queClaudiaQuiereBuscarVestidos(List<TestTecnicalData> testTecnicalData) {
        theActorCalled("Claudia").wasAbleTo(OpenUp.thePage(), (Login.
                OnThePage(testTecnicalData.get(0).getStrUser(),testTecnicalData.get(0).getStrPassword())));
    }

    @Cuando("^compra vestidos de mujeres$")
    public void compraVestidosDeMujeres(List<TestTecnicalData> testTecnicalData) {
        theActorInTheSpotlight().attemptsTo(Search.the(testTecnicalData));
    }

    @Entonces("ella deberia visualizar que su compra fue exitosa")
    public void ellaDeberiaVisualizarQueSuCompraFueExitosa(List<TestTecnicalData> testTecnicalData){
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(testTecnicalData.get(0).getStrConfirmacion())));
    }
}
