 
package prog.sa3.classwork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Activitat10 {
    public static void main(String[] args) throws IOException {
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("----- Creem un directori usant java.io.File ------ ");
        System.out.print("Introdueix la ruta relativa del directori a crear: ");
        String rutaDirectori = teclat.nextLine();
        
        File directori = new File(rutaDirectori);
        
        // crear directori en eixa ruta
        boolean estaCreatDirectori = directori.mkdir();
        
        System.out.println("Directori: " + directori.getPath() 
                           + " creat? " + estaCreatDirectori );
        
        System.out.println("----- Creem un directori usant java.nio.file ------ ");
        System.out.print("Introdueix la ruta relativa del directori a crear: ");
        
        rutaDirectori = teclat.nextLine();
        
        Path pathRuta = Path.of(rutaDirectori);
        // crear directori
        Path pathDirectori = Files.createDirectory(pathRuta);
        
        System.out.println(" Directori: " + pathRuta.toString()
                         + " Creat? " + Files.isDirectory(pathDirectori));
        
        teclat.close();
        
    }
}
