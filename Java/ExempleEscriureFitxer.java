/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.sa3.classwork;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 *
 * @author empar
 */
public class ExempleEscriureFitxer {
    public static void main(String[] args) throws IOException {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Ruta al fitxer on escriure: ");
        String rutaFitxer = teclat.next();
        
        Path pathFitxer = Path.of(rutaFitxer);
        
        BufferedWriter bw = Files.newBufferedWriter(pathFitxer,
                                            StandardOpenOption.CREATE,
                                            StandardOpenOption.APPEND);
        
        bw.write("Hola");
        bw.newLine();
        bw.write("ADEU!!!");
        
        bw.close();
        
        
    }
}
