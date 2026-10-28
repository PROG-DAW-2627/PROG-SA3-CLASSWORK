/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.sa3.classwork;

import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat4 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        System.out.print("Quantes monedes tens de 2 cèntims? ");
        int monedes2Centims = teclat.nextInt();

        System.out.print("Quantes monedes tens de 5 cèntims? ");
        int monedes5Centims = teclat.nextInt();

        System.out.print("Quantes monedes tens de 10 cèntims? ");
        int monedes10Centims = teclat.nextInt();

        System.out.print("Quantes monedes tens de 20 cèntims? ");
        int monedes20Centims = teclat.nextInt();

        System.out.print("Quantes monedes tens de 50 cèntims? ");
        int monedes50Centims = teclat.nextInt();

        System.out.print("Quantes monedes tens de 1 € ? ");
        int monedes1Euro = teclat.nextInt();

        System.out.print("Quantes monedes tens de 2 € ? ");
        int monedes2Euros = teclat.nextInt();

        // càlculs
        long totalCentims = monedes2Centims * 2 + monedes5Centims * 5 
                            + monedes10Centims * 10
                            + monedes20Centims * 20 + monedes50Centims * 50;

        long totalEuros = monedes1Euro + monedes2Euros * 2 + totalCentims / 100;

        //totalCentims = totalCentims % 100;
        totalCentims %= 100;

        // Eixida resultat
        System.out.println("Tens " + totalEuros + " € i " 
                                   + totalCentims + " cèntims");

        
        teclat.close();
    }
}
