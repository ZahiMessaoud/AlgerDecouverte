package dz.zahi.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

/**
 *
 */
/**
 * @author acer
 *
 */
public class Fichier {

    /**
     * une methode permet de recuperer une information à partir d'un fichier
     *
     * @param nomFichier
     * @param code
     * @return
     * @throws IOException
     */
    public static String getInformation(String nomFichier, int code) throws IOException {

        String ligne = null;
        BufferedReader br = new BufferedReader(new FileReader(Fichier.class.getResource(nomFichier).getPath()));
        int i = 0;

        while (i < code) {
            ligne = br.readLine();//on recupere une ligne a partir de fichier Nomfich
            i++;
        }
        ligne = ligne.substring(0, ligne.indexOf(";"));

        return ligne;

    }

    /**
     * une methode permet de recuperer un Vector d'informations à partir d'un
     * fichier
     *
     * @param nomFichier
     * @return
     * @throws IOException
     */
    public static Vector<String> getInformations(String nomFichier) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(Fichier.class.getResource(nomFichier).getPath()));

        String ligne = br.readLine();
        Vector<String> tabString = new Vector<>();
        while (ligne != null) {
            ligne = ligne.substring(0, ligne.indexOf(";"));
            tabString.addElement(ligne);
            ligne = br.readLine();
        }

        return tabString;

    }

    /**
     * Methode permet de lister l'ensemble de fichier qui sont dans repartoire
     * qui ont le type typeFile et recupere leurs chemins
     *
     * @param repertoire
     * @return
     */
    public static Vector<String> listeRepertoire(File repertoire, String typFile) {

        Vector<String> tab = new Vector<String>();

        if (repertoire.isDirectory()) {
            File[] list = repertoire.listFiles();
            if (list != null) {
                for (int i = 0; i < list.length; i++) {
                    if (list[i].getAbsolutePath().endsWith(typFile)) {
                        tab.addElement(list[i].getAbsolutePath());
                    }
                }
            } else {
                System.err.println(repertoire + " : Erreur de lecture.");
            }

        }
        return tab;
    }

}
