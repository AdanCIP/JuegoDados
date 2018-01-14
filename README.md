# Práctica UT04 - OPERADORES - Juego Dados

## Objetivo

El objetivo de esta práctica es el de desarrollar un pequeño programa que permita la simulación de la tirada de dos dados. En este pequeño juego compiten dos jugadores donde se mostrará por pantalla que jugador ha ganado.

## Desarrollo

El desarrollo de este programa se puede dividir en cuatro partes:

* Tirada de dados.
* Cálculo de tirada más alta.
* Obtención de ganador.
* Calculo media de los dados.

Para obtener un número aleatorio y así simular el lanzamiento de un dado se utiliza la clase Math:
```bash
Math.random()*6+1;
```
>__Nota__: Se multiplica por 6 para obtener un número entre 0-5 y se le suma 1 para que esta cantidad varíe entre 1 y 6 como corresponde con las caras de un dado.

La clase Math tambien es utilizada para obtener la tirada más alta. Lo podemos obtener mediante su método max:
```bash
Math.max(tirada1, tirada2);
```
> __Nota__: Al método max se le pasa como parámetro las cantidades a obtener la más alta.

Para obtener el jugador ganador se utiliza la estructura conficional "if", comparandose cual es mayor entre los resultados obtenidos para cada jugador.

Otra alternativa a la estructura "if" vista en el Unidad de Trabajo 4 podría ser el operador condicional estilo C. Veamos un ejemplo:
```bash
String resultado;
resultado = (resultado_j1 > resultado_j2 ? "El ganador es el jugador 1" : "El ganador es el jugador 2");
```
> __Nota__:Donde resultado_j1 es el resultado de la tirada del jugador 1 y resultado_j2 la del jugador 2.

Para el calculo de la media se utiliza una simple expresión: En este caso se suma todos los valores de los dados y se divide entre el total de tiradas obteniendo así la media. Para finalizar y mostrar un número mas bonito se trunca eliminando decimales visualizados a la salida mediente el metodo printf.
