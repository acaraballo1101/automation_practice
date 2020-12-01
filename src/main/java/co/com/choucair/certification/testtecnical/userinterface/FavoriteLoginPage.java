package co.com.choucair.certification.testtecnical.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FavoriteLoginPage extends PageObject {

    public static final Target BOTON_ACCEDER = Target.the("Boton Sig In").located(By.xpath("//div[@class='header_user_info']"));
    public static final Target CAJA_CORREO = Target.the("Caja de texto para ingresar el correo").located(By.xpath("//input[@id='email']"));
    public static final Target CAJA_PASSWORD = Target.the("Caja de texto para ingresar password").located(By.xpath("//input[@id='passwd']"));
    public static final Target BOTON_LOGIN = Target.the("Boton iniciar Sesion").located(By.xpath("//button[@id='SubmitLogin']"));
}