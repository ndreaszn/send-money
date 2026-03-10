# BIZUM 

## Como funciona

Para realizar este pequeño proyecto con JavaFX, y siguiendo el modelo MVC (modelo-vista-controlador).

- Con el **@FXML** sobre las variables indicamos que ese elemento esta conectado al archivo .fxml que es la interfaz visual que usaremos.

- El archivo **BizumModel.java** es el que almacena y gestiona toda la información que se introduce

Algunas de las funciones a tener en cuenta para que todo esto funcione correctamente son: 

- updateScreen(): Cada que cambiamos el total a enviar, se consulta el modelo y actualiza la interfaz visible

- reset(): Este método solo reinicia el total a 0 después de enviar el bizum

- send(): Finalmente, con este método, realizamos el bizum siempre y cuando el importe sea mayor a 0, si no, imprimirá un mensaje solictando que se añada un importe