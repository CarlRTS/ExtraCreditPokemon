/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Interfaz.Menu;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author Carl
 */
public class Iniciador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            Menu g = new Menu();
            g.setVisible(true);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Iniciador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
