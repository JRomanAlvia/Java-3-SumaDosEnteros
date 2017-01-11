/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoc03;
import java.util.Scanner; //libreria para leer por teclado
/**
 *Programa: 03
 * Descripciòn: Programa que sume dos numeros enteros(basado en el libro how to program)
 * @author Jairo Roman Alvia
 * Fecha: Diciembre 02, 2014
 */
public class CursoC03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada=new Scanner(System.in);
    int numero1;
    // primero tipo de variable (int = entero) luego el nombre de variable
    int numero2,suma;
    //SE PUEDE DECLARAS VARIABLES SEPARADAS O EN LA MISMA LINEA SEPARADAS POR UNA COMA(,)
    System.out.print("Ingrese el primer numero entero: ");
    numero1=entrada.nextInt();//lee y se asigna lo que se escriba en el teclado
    System.out.print("Ingrese el segundo numero entero: ");
    numero2=entrada.nextInt();
    suma=numero1+numero2;//operaciòn para la suma
    System.out.println("El resultado es: "+suma);//se usa el (+) para concatenar
    }
    
}
