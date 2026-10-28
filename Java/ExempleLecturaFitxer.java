
package prog.sa3.classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;


public class ExempleLecturaFitxer {
    public static void main(String[] args) throws IOException {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Ruta al fitxer on escriure: ");
        String rutaFitxer = teclat.next();
        
        Path pathFitxer = Path.of(rutaFitxer);
        
        BufferedReader  br  = Files.newBufferedReader(pathFitxer);
        
        br.readLine();
        String linia2 = br.readLine();
        
        br.close();
        
        System.out.println("Línia 2 del fitxer " + pathFitxer.toString());
        System.out.println(linia2);
        
        
        
    }
}
