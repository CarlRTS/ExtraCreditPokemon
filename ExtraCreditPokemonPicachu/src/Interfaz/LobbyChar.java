/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.Timer;
import Jugador.Partida;
import MusicaMenu.Musica;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Carl
 */
public class LobbyChar extends javax.swing.JFrame {
    
    Clip musica;
    
    /**
     * Creates new form Creditos
     */
    public LobbyChar() throws IOException, LineUnavailableException {
        initComponents();
        
        
    
        
        try {
            // Load your sound file (replace "your-sound-file.wav" with the actual file path)
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    Menu.class.getResourceAsStream("/MusicaMenu/MusicaSelector.wav"));
            // Get a Clip
            musica = AudioSystem.getClip();

            // Open the audio stream
            musica.open(audioInputStream);

            // Start playing the clip
            musica.start();
            musica.loop(100);
            
            
                 
            
    }   catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
                 
            
    
        
        
        
        t = new Timer(10,acciones);
        
    }
    //Cronometro
    private Timer t;
    private int h,m,s,cs;
    
    private ActionListener acciones = new ActionListener(){
        
        
    @Override 
        public void actionPerformed(ActionEvent ae){
            cs++;
            if(cs==100){
                cs = 0;
                ++s;
                
            }
            if(s==60){
                s=0;
                ++m;
            }
            if(m==60){
                m =0;
                ++h;
            }
            actualizarLabel();
        }
    };
    
    private void actualizarLabel(){
        String tiempo = (h<=9?"0":"")+h+":"+(m<=9?"0":"")+m+":"+(s<=9?"0":"")+s+":"+(cs<=9?"0":"")+cs;
        etiquetaTiempo.setText(tiempo);
    }
    
    private void actualizarPuntos(){
        
        String puntosrelacion = "0";
        int puntos = 0;
        Relacion.setText(puntosrelacion);
    }
    
    public void inicioCount(){
        t.start();
    }
    
    
    
    
    
    
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Creditos = new javax.swing.JButton();
        Charmeleon = new javax.swing.JLabel();
        Relacion = new javax.swing.JLabel();
        etiquetaTiempo = new javax.swing.JLabel();
        TiempoJugado = new javax.swing.JLabel();
        Relacionint = new javax.swing.JLabel();
        Tienda = new javax.swing.JButton();
        FotoRelacion = new javax.swing.JLabel();
        GuardarTXT = new javax.swing.JButton();
        TiempoJugado1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        Creditos.setText("Back to Menu");
        Creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditosActionPerformed(evt);
            }
        });

        Charmeleon.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Charmeleon.setForeground(new java.awt.Color(255, 255, 255));
        Charmeleon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Movimientos Charmeleon/Normal-removebg-preview.png"))); // NOI18N

        Relacion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Relacion.setForeground(new java.awt.Color(255, 255, 255));
        Relacion.setText("Relación:");
        Relacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelacionMouseClicked(evt);
            }
        });

        etiquetaTiempo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiquetaTiempo.setText("00:00:00:00");

        TiempoJugado.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        TiempoJugado.setForeground(new java.awt.Color(255, 255, 255));
        TiempoJugado.setText("Tiempo jugado");
        TiempoJugado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TiempoJugadoMouseClicked(evt);
            }
        });

        Relacionint.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Relacionint.setForeground(new java.awt.Color(255, 255, 255));
        Relacionint.setText("0");
        Relacionint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelacionintMouseClicked(evt);
            }
        });

        Tienda.setText("Tienda");
        Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiendaActionPerformed(evt);
            }
        });

        FotoRelacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Emociones Charmeleon/Sigh1.PNG"))); // NOI18N
        FotoRelacion.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FotoRelacionPropertyChange(evt);
            }
        });

        GuardarTXT.setText("Guardar Partida");
        GuardarTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarTXTActionPerformed(evt);
            }
        });

        TiempoJugado1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        TiempoJugado1.setForeground(new java.awt.Color(255, 255, 255));
        TiempoJugado1.setText("Guardar partida");
        TiempoJugado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TiempoJugado1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(Relacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Relacionint)
                        .addGap(268, 268, 268)
                        .addComponent(Tienda))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Creditos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(FotoRelacion)))
                        .addGap(197, 197, 197)
                        .addComponent(Charmeleon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TiempoJugado)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaTiempo)
                            .addComponent(GuardarTXT))
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TiempoJugado1)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Creditos)
                    .addComponent(TiempoJugado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Charmeleon)
                    .addComponent(FotoRelacion))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Relacion)
                    .addComponent(Relacionint)
                    .addComponent(Tienda)
                    .addComponent(GuardarTXT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TiempoJugado1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditosActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "Si vuelves al menú todos los cambios que no guardaste se perderan...", "",0,1);
        if (opcion == 0) {
           t.stop();
           musica.close();
           musica.stop();
           
        try {
            // Ir al menu
            Menu j = new Menu();
            j.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(LobbyChar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(LobbyChar.class.getName()).log(Level.SEVERE, null, ex);
        } 
        }
        
        
    }//GEN-LAST:event_CreditosActionPerformed

    private void RelacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RelacionMouseClicked

    private void TiempoJugadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiempoJugadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempoJugadoMouseClicked

    private void RelacionintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelacionintMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RelacionintMouseClicked

    private void TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiendaActionPerformed
        // Abre la tienda:
            TiendaBayas tiendita = new TiendaBayas();
            tiendita.setVisible(true);
            
            
    }//GEN-LAST:event_TiendaActionPerformed

    private void FotoRelacionPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FotoRelacionPropertyChange
        //Cambiar fotorelacion dependiendo de los puntos de relacion
        //Partida nuevapartida = new Partida();
        
            
        
    }//GEN-LAST:event_FotoRelacionPropertyChange

    private void GuardarTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarTXTActionPerformed
        // Guardar partida
        Partida nueva = new Partida();
        int opcion = JOptionPane.showConfirmDialog(null, "¿Quieres guardar la partida?", "",0,1);
        if (opcion == 0) {
        nueva.guardarjuego();
        JOptionPane.showMessageDialog(null, "Se ha guardado la partida exitosamente");
        }
        
    }//GEN-LAST:event_GuardarTXTActionPerformed

    private void TiempoJugado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiempoJugado1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempoJugado1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Charmeleon;
    private javax.swing.JButton Creditos;
    public javax.swing.JLabel FotoRelacion;
    private javax.swing.JButton GuardarTXT;
    private javax.swing.JLabel Relacion;
    private javax.swing.JLabel Relacionint;
    private javax.swing.JLabel TiempoJugado;
    private javax.swing.JLabel TiempoJugado1;
    private javax.swing.JButton Tienda;
    private javax.swing.JLabel etiquetaTiempo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

