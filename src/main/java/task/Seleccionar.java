package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.PaginaArticulos.INGRESAR_ARTICULO;
import static userinterfaces.PaginaInicio.CERRAR_BIENVENIDA;

public class Seleccionar implements Task {

    private String articulo;

    public Seleccionar(String articulo){
        this.articulo = articulo;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(CERRAR_BIENVENIDA).viewedBy(actor).asBoolean())
        {
            actor.attemptsTo(Click.on(CERRAR_BIENVENIDA));
        }
        actor.attemptsTo(
                Enter.theValue(articulo).into(INGRESAR_ARTICULO),//Ingresa el articulo
                Hit.the(Keys.ENTER).into(INGRESAR_ARTICULO));
    }

    public static task.Seleccionar Articulo(String articulo) {
        return instrumented (Seleccionar.class, articulo);
    }

}
