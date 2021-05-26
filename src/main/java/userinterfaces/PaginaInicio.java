package userinterfaces;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://inkafarma.pe/")
public class PaginaInicio extends PageObject {

    public static final Target CERRAR_BIENVENIDA= Target.the("Botón para cerrar la bienvenida").located(By.id("onesignal-slidedown-cancel-button"));
    public static final Target SELECT_INICIAR = Target.the("Botón para iniciar sesión").located(By.id("lb--open-login-modal"));
    public static final Target SELECT_INGRESAR_CORREO = Target.the("Botón para ingresar información").locatedBy("//*[contains(@class,'btn btn-outline btn-border-bold btn-spacer-regular label-black btn-block')]");
    public static final Target INPUT_USUARIO = Target.the("Input donde se ingresa el usuario").located(By.id("ctrl--login-email"));
    public static final Target INPUT_PASSWORD = Target.the("Input donde se ingresa la contraseña").located(By.id("ctrl--login-password"));
    public static final Target SELECT_INGRESAR= Target.the("Botón para entrar a la cuenta").located(By.id("btn--login-email"));

}
