package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.PaginaInicio.*;

public class IniciarSesion implements Task {

    private String usuario;
    private String password;

    public IniciarSesion(String usuario, String password){
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (Visibility.of(CERRAR_BIENVENIDA).viewedBy(actor).asBoolean())
        {
            actor.attemptsTo(Click.on(CERRAR_BIENVENIDA));
        }
            actor.attemptsTo(
                Click.on(SELECT_INICIAR), //Click en Iniciar Sesión
                Click.on(SELECT_INGRESAR_CORREO), //Click en ingresar con correo Electronico
                Enter.theValue(usuario).into(INPUT_USUARIO),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(SELECT_INGRESAR) //Click en ingresar a tu cuenta
                 );
    }

    public static task.IniciarSesion ConUsuario(String usuario, String password) {
        return instrumented(task.IniciarSesion.class, usuario, password);
    }

}
