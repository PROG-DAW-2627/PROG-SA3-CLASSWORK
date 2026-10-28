
package prog.sa3.classwork;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat9Exemple3 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix el nom del directori: ");
        String nomDirectori = teclat.next();
        
        System.out.print("Introdueix el nom del fitxer: ");
        String nomFitxer = teclat.next();
        
        File fLinuxMac = new File(nomDirectori + "/" + nomFitxer);
        File fWindows = new File(nomDirectori + "\\" + nomFitxer);
        File fMultiplataforma = new File(nomDirectori + File.separatorChar + nomFitxer);
        
        System.out.println(fLinuxMac.isFile());
        System.out.println(fWindows.isFile());
        System.out.println(fMultiplataforma.isFile());
        
        System.out.println("ruta absoluta de fLinuxMac: " 
                + fLinuxMac.getAbsolutePath());
        System.out.println("ruta absoluta de fWindows: " 
                + fWindows.getAbsolutePath());
        System.out.println("ruta absoluta de fMultiplataforma: " 
                + fMultiplataforma.getAbsolutePath());
        
        teclat.close();
    }

}
