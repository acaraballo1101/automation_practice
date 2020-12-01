package co.com.choucair.certification.testtecnical.tasks;

import co.com.choucair.certification.testtecnical.userinterface.SearchItemPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

public class SeleccionarProducto implements Task{


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(SearchItemPage.MOVER_MOUSE_ART_1),
                Click.on(SearchItemPage.CLIC_EN_ADDTOCART_ART_1),
                Click.on(SearchItemPage.CONTINUAR_COMPRA),
                MoveMouse.to(SearchItemPage.MOVER_MOUSE_ART_2),
                Click.on(SearchItemPage.CLIC_EN_ADDTOCART_ART_2),
                Click.on(SearchItemPage.CONTINUAR_COMPRA)

        );

    }

    public static SeleccionarProducto deVestidos(){
        return Tasks.instrumented(SeleccionarProducto.class);
    }



}
