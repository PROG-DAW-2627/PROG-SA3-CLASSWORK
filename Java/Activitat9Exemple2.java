
package prog.sa3.classwork;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat9Exemple2 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        // primer constructor
        // File f1 = new File("resources/prog-daw-dam/dades.txt");
        System.out.println("PRIMER CONSTRUCTOR");
        System.out.print("Introdueix la ruta relativa a un fitxer: ");
        String rutaF1 = teclat.nextLine();

        File f1 = new File(rutaF1);
        System.out.println("Ruta absoluta: " + f1.getAbsolutePath());
        

        // segon constructor        
        //File f2 = new File("resources/prog-daw-dam/", "dades.txt");
        System.out.println("SEGON CONSTRUCTOR");
        System.out.print("Introdueix la ruta relativa al directori: ");
        String nomDirectori = teclat.nextLine();
        System.out.print("Introdueix el nom del fitxer: ");
        String nomFitxer = teclat.nextLine();
        
        File f2 = new File(nomDirectori, nomFitxer);
        
        System.out.println("Ruta absoluta: " + f2.getAbsolutePath());

        // tercer constructor
        //File directori = new File("resources/prog-daw-dam/");        
        //File f3 = new File(directori, "dades.txt");
        System.out.println("TERCER CONSTRUCTOR");
        File directori = new File(nomDirectori);
        File f3 = new File(directori, nomFitxer);
        
        System.out.println("Ruta absoluta: " + f3.getAbsolutePath());
        
        teclat.close();
    }
}
