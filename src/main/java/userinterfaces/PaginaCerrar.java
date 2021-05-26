package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaCerrar extends PageObject {

    public static final Target DETALLE_SESION= Target.the("Botón para ver el detalle de la sesión").located(By.id("loginOk"));
    public static final Target CERRAR_SESION= Target.the("Botón para cerrar la sesión").located(By.id("lb--sign-off"));
}
