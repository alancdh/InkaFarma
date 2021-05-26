package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.PaginaCerrar.CERRAR_SESION;
import static userinterfaces.PaginaCerrar.DETALLE_SESION;
import static userinterfaces.PaginaInicio.CERRAR_BIENVENIDA;


public class CerrarSesion implements Task  {

    public CerrarSesion(){
        return;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(CERRAR_BIENVENIDA).viewedBy(actor).asBoolean())
        {
            actor.attemptsTo(Click.on(CERRAR_BIENVENIDA));
        }
        actor.attemptsTo(
                Click.on(DETALLE_SESION), //Click en detalle de la Sesión
                Click.on(CERRAR_SESION) //Click en Cerrar Sesión
        );
    }

    public static task.CerrarSesion Cierra() {
        return instrumented(task.CerrarSesion.class);
    }

}
