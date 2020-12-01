package co.com.choucair.certification.testtecnical.tasks;

import co.com.choucair.certification.testtecnical.model.TestTecnicalData;
import co.com.choucair.certification.testtecnical.userinterface.SearchItemPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import java.util.List;


public class Search implements Task {
    List<TestTecnicalData> testTecnicalData;


    public Search(List<TestTecnicalData> testTecnicalData) {
        this.testTecnicalData = testTecnicalData;
    }

    public static Search the(List<TestTecnicalData> testTecnicalData) {
        return Tasks.instrumented(Search.class,testTecnicalData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchItemPage.BTN_WOMEN),
                Enter.theValue(testTecnicalData.get(0).getStrPrenda()).into(SearchItemPage.CAJA_BUSQUEDA),
                Click.on(SearchItemPage.BOTON_BUSCAR),

                //Seleccionar Productos
                MoveMouse.to(SearchItemPage.MOVER_MOUSE_ART_1),
                Click.on(SearchItemPage.CLIC_EN_ADDTOCART_ART_1),
                Click.on(SearchItemPage.CONTINUAR_COMPRA),
                MoveMouse.to(SearchItemPage.MOVER_MOUSE_ART_2),
                Click.on(SearchItemPage.CLIC_EN_ADDTOCART_ART_2),
                Click.on(SearchItemPage.CONTINUAR_COMPRA),

                //Realizar Compra
                Click.on(SearchItemPage.CLIC_EN_CARRO_DE_COMPRA),
                Click.on(SearchItemPage.CHEKOUT_SUMMARY),
                Enter.theValue("Por favor LLamar media hora antes de ir").into(SearchItemPage.COMENTARIOS),
                Click.on(SearchItemPage.CHEKOUT_ADDRESS),
                Click.on(SearchItemPage.TERMINOS_CONDICIONES),
                Click.on(SearchItemPage.CHECKOUT_SHIPPING),
                Click.on(SearchItemPage.TIPO_DE_PAGO),
                Click.on(SearchItemPage.CONFIRMAR_PEDIDO)

        );

    }
}
