package prog.sa3.classwork;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author empar
 */
public class Activitat14 {

    static final String RUTA_FITXER_MODULS = "resources" + File.separatorChar + "activitat14" + File.separatorChar + "moduls.txt";
    static final String RUTA_FITXER_MODULS_A_MAJUSC = "resources/activitat14/moduls_majuscules.txt";  // usar per a multiplataforma: File.separatorChar

    public static void main(String[] args) throws IOException {

        Path fitxerPath = Path.of(RUTA_FITXER_MODULS);
        Path fitxerMajusculesPath = Path.of(RUTA_FITXER_MODULS_A_MAJUSC);
        // alternativa:
        //Path fitxerPath = Path.of("resources", "activitat14", "moduls.txt");
        //Path fitxerMajusculesPath = Path.of("resources", "activitat14", "moduls_majuscules.txt");

        BufferedReader br = Files.newBufferedReader(fitxerPath);
        BufferedWriter bw = Files.newBufferedWriter(fitxerMajusculesPath);

        String linia;

        System.out.printf("Llegint fitxer: '%s'\n", RUTA_FITXER_MODULS);
        System.out.println("Convertint a majúscules i bolcant a altre fitxer ...\n");

        // linia 1  =  Llenguatge de marques
        linia = br.readLine();
        bw.write(linia.toUpperCase());
        bw.newLine();

        // linia 2  =  Programació
        linia = br.readLine();
        bw.write(linia.toUpperCase());
        bw.newLine();

        // linia 3  =  Bases de Dades
        linia = br.readLine();
        bw.write(linia.toUpperCase());
        bw.newLine();

        // linia 4  =  Entorns de Desenrotllament
        linia = br.readLine();
        bw.write(linia.toUpperCase());
        bw.newLine();

        // linia 5  =  Sistemes Informàtics
        linia = br.readLine();
        bw.write(linia.toUpperCase());
        bw.newLine();

        // linia 6  =  Projecte Intermodular
        linia = br.readLine();
        bw.write(linia.toUpperCase());
        bw.newLine();

        br.close();
        bw.close();

        // No es demana, però mostrem resultat de les operacions d'escriptura al fitxer
        System.out.printf("Fitxer '%s'.\n  S'ha Creat?: '%b'  (%d bytes)  \n",
                fitxerMajusculesPath,
                Files.exists(fitxerMajusculesPath),
                Files.size(fitxerMajusculesPath));
    }
}
