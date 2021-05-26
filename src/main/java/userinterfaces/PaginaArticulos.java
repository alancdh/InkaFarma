package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaArticulos extends PageObject {
    public static final Target INGRESAR_ARTICULO= Target.the("Texto para ingresar el nombre del articulo").located(By.id("ctrl-product-searcher"));
}
