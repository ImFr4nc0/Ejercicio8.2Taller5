/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nota;

/**
 *
 * @author jorge
 */
public class Notas {
   double[] listaNotas; /* Atributo que identifica un array de notas de
tipo double */
/**
* Constructor de la clase Notas, instancia un array con 5 notas de
* tipo double
*/
public Notas() {
    listaNotas = new double[5]; // Crea un array de 5 notas
    }
    double calcularPromedio() {
    double suma = 0;
    for(int i=1; i < listaNotas.length; i++) { 
    suma = suma + listaNotas[i]; 
    }
    return (suma / listaNotas.length);
    }
    double calcularDesviación() {
    double prom = calcularPromedio();
    double suma = 0;
    for(int i=0; i < listaNotas.length; i++) {

    suma += Math.pow(listaNotas[i] - prom, 2 );
    }
    return Math.sqrt (suma/listaNotas.length );
    }

    double calcularMenor() {
    double menor = listaNotas[0]; 
    for(int i=0; i < listaNotas.length; i++) {
    if (listaNotas[i] < menor) {

    menor = listaNotas[i];
    }
    }
    return menor;
    }

    double calcularMayor() {
    double mayor = listaNotas[0];
    for(int i=0; i < listaNotas.length; i++) { 
    if (listaNotas[i] > mayor) {
        mayor = listaNotas[i];
        }
    }
    return mayor;
    }
}
    

