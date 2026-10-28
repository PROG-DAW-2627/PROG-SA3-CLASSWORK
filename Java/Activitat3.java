
package prog.sa3.classwork;

import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat3 {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        
        double num1, num2, num3;
              
        System.out.println("Introdueix 3 números amb decimals: ");
        num1 = teclat.nextDouble();
        num2 = teclat.nextDouble();
        num3 = teclat.nextDouble();
        
        double mult = num1 * num2 * num3;
        
        System.out.println("Resultat multiplicació: " + mult);
        
        
        teclat.close();
    }
    
}
