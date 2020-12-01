package co.com.choucair.certification.testtecnical.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchItemPage extends PageObject {
    public static final Target BTN_WOMEN = Target.the("Clic en Women").located(By.xpath("//a[@title='Women']"));
    public static final Target CAJA_BUSQUEDA = Target.the("Cuadro de Busqueda").located(By.xpath("//input[@class='search_query form-control ac_input']"));
    public static final Target BOTON_BUSCAR = Target.the("Boton Buscar").located(By.xpath("//button[@name='submit_search']"));

    //Seleccionar Productos
    public static final Target MOVER_MOUSE_ART_1 = Target.the("Mover Mouse hacia Articulo 1").located(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']"));
    public static final Target CLIC_EN_ADDTOCART_ART_1 = Target.the("Clic en el boton add to cart del articulo 1").locatedBy("//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=5&token=a07f7e7c1d598ac705caec041322f1ce']");
    public static final Target CONTINUAR_COMPRA = Target.the("Cerrar ventana Flotante").locatedBy("//span[@title='Close window']");
    public static final Target MOVER_MOUSE_ART_2 = Target.the("Mover Mouse hacia Articulo 2").located(By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']"));
    public static final Target CLIC_EN_ADDTOCART_ART_2 = Target.the("Clic en el boton add to cart del articulo 2").locatedBy("//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=4&token=a07f7e7c1d598ac705caec041322f1ce']");

    //Realizar Compra
    public static final Target CLIC_EN_CARRO_DE_COMPRA = Target.the("Clic en Carro de compras").locatedBy("//A[@title='View my shopping cart']");
    public static final Target CHEKOUT_SUMMARY = Target.the("Clic en Cheout sesion Summary").locatedBy("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']");
    public static final Target COMENTARIOS = Target.the("Realizar comentarios en cuadro de Texto").locatedBy("//textarea[@class='form-control']");
    public static final Target CHEKOUT_ADDRESS = Target.the("Clic en Cheout sesion Address").locatedBy("//button[@class='button btn btn-default button-medium']");
    public static final Target TERMINOS_CONDICIONES = Target.the("Clic en aceptar terminos y condiciones").locatedBy("//input[@name='cgv']");
    public static final Target CHECKOUT_SHIPPING = Target.the("Clic en Cheout sesion Shipping").locatedBy("//button[@name='processCarrier']");
    public static final Target TIPO_DE_PAGO = Target.the("Seleccionar el tipo de pago").locatedBy("//a[@class='bankwire']");
    public static final Target CONFIRMAR_PEDIDO = Target.the("Finalizar Pedido").locatedBy("//button[@class='button btn btn-default button-medium']");
    public static final Target COMPRA_EXITOSA = Target.the("Extrae y confirma que la compra se hizo Con 'Your order on My Store is complete'").located(By.xpath("//p[@class='cheque-indent']"));
}


