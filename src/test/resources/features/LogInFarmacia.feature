# language: es

Característica: Realizar el login en la pagina de InkaFarma

  @LogIn
  Escenario: Hacer LogIn en la pantalla de InkaFarma
    Dado que el cliente previamente se registro en la pagina
    Cuando Ingresa correctamente su usuario alancdh@gmail.com y su password Ejemplo1.
    Entonces puede ingresar a la pagina y seleccionar el articulo Mascarilla KN95 Protective Mask
    Y se cierra la sesión

  Escenario: Verificar la funcionalidad de olvidaste tu contraseña

  Escenario: Verificar la funcionalidad de Registrate

  Escenario: Verificar la funcionalidad de logeo
  Given Accedo a la web page de inkafarma
  When ingreso "<usuario>" y "<contraseña>"
  Then verifico el "<acceso>"
  | usuario             | contraseña            | acceso  |
  | cualquierusuario    |                       | false   |
  |                     | cualquiercontraseña   | false   |
  | cualquierusuario    | cualquiercontraseña   | false   |
  |                     |                       | false   |
  | usuarioValido       | contraseñaValida      | true    |