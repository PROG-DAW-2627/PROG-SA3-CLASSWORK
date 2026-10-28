package prog.sa3.classwork;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Activitat12 {

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);

        // Amb java.io.File
        // Demanar la ruta de l'arxiu
        System.out.println("----- Mostrar informació d'un arxiu java.io.File ------ ");
        System.out.print("Introdueix la ruta relativa de l'arxiu: ");
        String rutaArxiu = teclat.nextLine();

        // Crear objecte File i obtindre la informació
        File arxiu = new File(rutaArxiu);

        // Mostrar tota la informació demanada
        System.out.println("\n\tInformació de l'arxiu:");
        System.out.println("\tNom: " + arxiu.getName());
        System.out.println("\tRuta absoluta: " + arxiu.getAbsolutePath());
        System.out.println("\tExisteix? " + arxiu.exists());
        System.out.println("\tTenim permís per a escriure? " + arxiu.canWrite());
        System.out.println("\tTenim permís per a llegir? " + arxiu.canRead());
        System.out.println("\tÉs un directori ? " + arxiu.isDirectory());
        System.out.println("\tÉs un arxiu? " + arxiu.isFile());

        
        
        // Amb java.io.File
        // Demanar la ruta de l'arxiu
        System.out.println("----- Mostrar informació d'un arxiu java.nio.file ------ ");
        System.out.print("Introdueix la ruta relativa de l'arxiu: ");
        String novaRutaArxiu = teclat.nextLine();

        Path pathNouArxiu = Path.of(novaRutaArxiu);

        // Mostrar tota la informació demanada
        System.out.println("\n   Informació de l'arxiu:");
        System.out.println("\tNom: " + pathNouArxiu.getFileName());
        System.out.println("\tRuta absoluta: " + pathNouArxiu.toAbsolutePath());
        System.out.println("\tExisteix? " + Files.exists(pathNouArxiu));
        System.out.println("\tTenim permís per a escriure? " + Files.isWritable(pathNouArxiu));
        System.out.println("\tTenim permís per a llegir? " + Files.isReadable(pathNouArxiu));
        System.out.println("\tÉs un directori ? " + Files.isDirectory(pathNouArxiu));
        System.out.println("\tÉs un arxiu? " + Files.isRegularFile(pathNouArxiu));

        teclat.close();

    }

}
