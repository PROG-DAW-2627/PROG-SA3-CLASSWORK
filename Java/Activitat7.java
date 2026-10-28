
package prog.sa3.classwork;

import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat7 {

    // Codis ANSI per a colors i estils
    public static final String RESET = "\u001B[0m";
    public static final String NEGRETA = "\u001B[1m";
    public static final String SUBRATLLAT = "\u001B[4m";

    public static final String FONS_NEGRE = "\u001B[40m";
    public static final String FONS_VERD = "\u001B[42m";
    public static final String FONS_MAGENTA = "\u001B[45m";

    public static final String FONS_ROIG = "\u001B[41m";
    public static final String FONS_CYAN = "\u001B[46m";

    public static final String TEXT_BLANC = "\u001B[37m";
    public static final String TEXT_ROIG = "\u001B[31m";
    public static final String TEXT_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        // Sol·licitar nom i edat
        System.out.print("Introdueix el teu nom de pila (sense espais): ");
        String nom = teclat.next();
        
        
        System.out.print("Introdueix la teua edat: ");
        int edat = teclat.nextInt();

        // Mostrar nom i edat
        System.out.printf("Nom: %s, Edat: %d\n\n", nom, edat);

        // Sol·licitar tres números reals
        System.out.print("Introdueix tres números reals: ");
        double num1 = teclat.nextDouble();
        double num2 = teclat.nextDouble();
        double num3 = teclat.nextDouble();

        // Calcular el producte
        double producte = num1 * num2 * num3;

        // Mostrar el producte en diferents formats       
        System.out.printf("%s%s%sProducte en format decimal amb dos decimals: %.2f%s\n",
                FONS_NEGRE, TEXT_BLANC, NEGRETA, producte, RESET);  

        
        System.out.printf("%s%s%sProducte en format científic: %e%s\n",
                FONS_VERD, TEXT_ROIG, SUBRATLLAT, producte, RESET);

        System.out.printf("%s%s%sProducte en format hexadecimal: %a%s\n",
                FONS_MAGENTA, TEXT_CYAN, SUBRATLLAT, producte, RESET);

        System.out.printf("%s%sProducte amb 5 dígits com "
                + "a mínim de la part sencera i 3 de la part decimal: %s%s%s%09.3f%s\n",
                FONS_ROIG, TEXT_BLANC, RESET, FONS_NEGRE, TEXT_BLANC, producte, RESET);

        teclat.close();
    }
}
