/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Interfaz.Menu;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;

/**
 * **Clase Principal:**
 *
 * Esta clase es la clase principal (main) del programa.
 *
 * @author Carl
 */
public class Iniciador {

    /**
     * Punto de entrada del programa.
     *
     * @param args Argumentos de la línea de comando (no utilizados).
     */
    public static void main(String[] args) throws IOException {
        
        
        
        //escritor.close();
        
        
        /**
         * **Creación de un menú:**
         *
         * Se crea una instancia de la clase `Menu` y se hace visible.
         */
        try {
            Menu g = new Menu();
            g.setVisible(true);
        } catch (LineUnavailableException ex) {
             // Manejar la excepción de forma adecuada
            Logger.getLogger(Iniciador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
