package sistema;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.application.Application.launch;

/**
 ** @author Antony-PC
 *
 */
public class Archivo {

    RandomAccessFile file;

    //Clases
    FuncionHash hash;

    public Archivo() {
        hash = new FuncionHash();
    }

    public void EscribirPuntos(String competencia, String etiqueta, String puntos) {
        try {
            BufferedReader com = new BufferedReader(new FileReader(new File("C:\\Users\\obito\\Desktop\\Sistema Experto Difuso\\Archivos\\Competencias")));
            int id = 0;
            String line1;
            while ((line1 = com.readLine()) != null) {
                String[] vg = line1.split(" ");
                System.out.println(line1);
                if(competencia.equals(vg[1])){
                    id = Integer.parseInt(vg[0]);
                }
            }
            com.close();
            
            BufferedReader leer = new BufferedReader(new FileReader(new File("C:\\Users\\obito\\Desktop\\Sistema Experto Difuso\\Archivos\\Puntos")));
            String competencias = "";
            String line;
            while ((line = leer.readLine()) != null) {
                competencias = competencias + line + "\n";
                String[] vg = line.split(" ");
                System.out.println(line);
            }
            leer.close();
            competencias = competencias + id + " " + etiqueta + " " + puntos + "\n";
            System.out.println(competencias);
            BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\Users\\obito\\Desktop\\Sistema Experto Difuso\\Archivos\\Puntos"));
            String[] esc = competencias.split("\n");
            for (int i = 0; i < esc.length; i++) {
                escribir.write(esc[i]);
                System.out.println(esc[i]);
                escribir.newLine();
            }
            escribir.close();
        } catch (Exception Ant) {
        }
    }

    public int RegistroSize(String competencia, String[] etiquetas) {
        int size = 0;
        //sacar las etiquetas del vector
        size = competencia.length();
        return size;
    }

    public String[] LeerCompetencias() {
        String[] vec = {};
        String temporal = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\obito\\Desktop\\Sistema Experto Difuso\\Archivos\\Competencias")));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                temporal = temporal + line + "\n";
            }
            vec = temporal.split("\n");
        } catch (Exception ant) {
        }
        return vec;
    }
    
    public String[] LeerEtiquetas(String competencia) {
        String[] vec = {};
        String temporal = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\obito\\Desktop\\Sistema Experto Difuso\\Archivos\\Competencias")));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Hola "+line);
                String[] temp = line.split(" ");
                if(competencia.equals(temp[1])){
                    System.out.println("Holasi "+line);
                    temporal = line;
                }
            }
            vec = temporal.split(" ");
        } catch (Exception ant) {
        }

        return vec;
    }

    public void EscribirCompetencia(String competencia, String etiquetas) {
        try {
            BufferedReader leer = new BufferedReader(new FileReader(new File("C:\\Users\\obito\\Desktop\\Sistema Experto Difuso\\Archivos\\Competencias")));
            String competencias = "";
            int id = 0;
            String line;
            while ((line = leer.readLine()) != null) {
                competencias = competencias + line + "\n";
                String[] vg = line.split(" ");
                System.out.println(line);
                id = Integer.parseInt(vg[0]);
            }
            leer.close();
            competencias = competencias + (id + 1) + " " + competencia + " " + etiquetas + "\n";
            System.out.println(competencias);
            BufferedWriter escribir = new BufferedWriter(new FileWriter("C:\\Users\\obito\\Desktop\\Sistema Experto Difuso\\Archivos\\Competencias"));
            String[] esc = competencias.split("\n");
            for (int i = 0; i < esc.length; i++) {
                escribir.write(esc[i]);
                System.out.println(esc[i]);
                escribir.newLine();
            }
            escribir.close();
        } catch (Exception Ant) {
        }
    }
}
