/**
* Ejercicio Juego Dados UT4 - Operadores
* 
* @author  Adán García
* @version 1.0
* @since   10-01-2018
*/
package com.cip.prog;

public class JuegoDados {
	public static void main(String[] args) {
		//---------- VARIABLES GENERALES ----------
		double dado1_jugador1;	//Variable almacenar resultado dado 1 jugador 1
		double dado2_jugador1;	//Variable almacenar resultado dado 2 jugador 1
		double dado1_jugador2;	//Variable almacenar resultado dado 1 jugador 2
		double dado2_jugador2;	//Variable almacenar resultado dado 2 jugador 2
		
		//---------- LANZAMIENTO DE DADOS ----------
		System.out.println("El jugador 1 hace su lanzamiento:");
		dado1_jugador1=Math.random()*6+1;	//Obtener número aleatorio entre 1 y 6
		dado2_jugador1=Math.random()*6+1;	//Obtener número aleatorio entre 1 y 6
		System.out.printf("Dado 1: %.0f\nDado 2: %.0f\n", dado1_jugador1, dado2_jugador1);	//Mostrar resultados
		
		System.out.println("El jugador 2 hace su lanzamiento:");
		dado1_jugador2=Math.random()*6+1;	//Obtener número aleatorio entre 1 y 6
		dado2_jugador2=Math.random()*6+1;	//Obtener número aleatorio entre 1 y 6
		System.out.printf("Dado 1: %.0f\nDado 2: %.0f\n", dado1_jugador2, dado2_jugador2);	//Mostrar resultados
		
		//---------- COMPROBACIÓN RESULTADOS Y GANADOR ----------
		//Obtener tirada más alta mediante el número mas alto de la suma de los dados
		System.out.printf("La tirada más alta es %.0f \n", Math.max((dado1_jugador1+dado2_jugador1), (dado1_jugador2+dado2_jugador2)));
		
		//Comprobación ganador:
		if (dado1_jugador1+dado2_jugador1 > dado1_jugador2+dado2_jugador2) {
			System.out.println("El ganador es el jugador 1");
			
		} else if (dado1_jugador1+dado2_jugador1 < dado1_jugador2+dado2_jugador2) {
			System.out.println("El ganador es el jugador 2");
			
		} else {
			System.out.println("Los jugadores han empatado en este lanzamiento");		
		}
		
		//Obtener media de los 4 dados (Realiza truncamiento a la unidad):
		System.out.printf("La media de los 4 dados es %.0f" , ((dado1_jugador1+dado2_jugador1+dado1_jugador2+dado2_jugador2)/4));	
		
	}
}
