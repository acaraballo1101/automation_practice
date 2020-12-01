package co.com.choucair.certification.testtecnical.tasks;

import co.com.choucair.certification.testtecnical.userinterface.SearchItemPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ComprarProducto implements Task{

        private String strComentario;
        public ComprarProducto (String strComentario) {
            this.strComentario = strComentario;
        }
        public static ComprarProducto enLinea (String strComentario) {
            return Tasks.instrumented(ComprarProducto.class, strComentario);
        }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchItemPage.CLIC_EN_CARRO_DE_COMPRA),
                Click.on(SearchItemPage.CHEKOUT_SUMMARY),
                Enter.theValue(strComentario).into(SearchItemPage.COMENTARIOS),
                Click.on(SearchItemPage.CHEKOUT_ADDRESS),
                Click.on(SearchItemPage.TERMINOS_CONDICIONES),
                Click.on(SearchItemPage.CHECKOUT_SHIPPING),
                Click.on(SearchItemPage.TIPO_DE_PAGO),
                Click.on(SearchItemPage.CONFIRMAR_PEDIDO)
        );

    }


}
