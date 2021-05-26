package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.CerrarSesion;
import task.IniciarSesion;
import task.Seleccionar;
import userinterfaces.PaginaInicio;

public class LoginInkaSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Usuario");
    private PaginaInicio inicio = new PaginaInicio();


    @Dado("^que el cliente previamente se registro en la pagina$")
    public void queElClientePreviamenteSeRegistroEnLaPagina() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(inicio));
        navegador.manage().window().maximize();
    }

    @Cuando("^Ingresa correctamente su usuario (.*) y su password (.*)$")
    public void ingresaCorrectamenteSu(String usuario, String password)  {
        actor.wasAbleTo(
                IniciarSesion.ConUsuario(usuario, password)
        );

    }

    @Entonces("^puede ingresar a la pagina y seleccionar el articulo (.*)$")
    public void puedeIngresarALaPagina(String articulo) {
        actor.wasAbleTo(
                Seleccionar.Articulo(articulo)
        );
    }

    @Y("^se cierra la sesión$")
    public void seCierraLaSesión() {
        actor.wasAbleTo(
                CerrarSesion.Cierra()
        );
    }
}
