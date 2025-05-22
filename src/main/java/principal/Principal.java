/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package principal;

/**
 *
 * @author laispaivaportela 
 */
import controller.Sorteador;
public class Principal {
    public static Sorteador sorteador = new Sorteador(); //instancia o sorteador uma unica vez

    public static void main(String[] args) {
        sorteador.incia(); //inicia aqui
        //System.out.println("Hello World!");
    }
}