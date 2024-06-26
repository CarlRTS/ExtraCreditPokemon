/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.JOptionPane;

/**
 *
 * @author Carl
 */
public class TiendaBayas extends javax.swing.JFrame {

    /**
     * Creates new form Creditos
     */
    public TiendaBayas() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComprarBayaAranja = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ComprarBayaCaquic = new javax.swing.JButton();
        ComprarBayaZanama = new javax.swing.JButton();
        ComprarPokeBall = new javax.swing.JButton();
        ComprarPokeBall1 = new javax.swing.JButton();
        ComprarZreza = new javax.swing.JButton();
        ComprarZiuela = new javax.swing.JButton();
        ComprarEnigma = new javax.swing.JButton();
        ComprarEnigma1 = new javax.swing.JButton();
        ComprarZidra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HECHO POR: CMSB");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido  la tienda");

        ComprarBayaAranja.setText("Comprar ");
        ComprarBayaAranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarBayaAranjaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda/Baya_Aranja_EP.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda/Baya_Zreza_EP.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda/Baya_Caquic_EP.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda/Baya_Zanama_EP.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda/Baya_Ziuela_EP.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda/180px-Caramelo_raro_(Ilustración).png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda/Baya_Enigma_EP.png"))); // NOI18N
        jLabel9.setText("jLabel9");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda/Baya_Zidra_EP.png"))); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tienda/Pokeball.png"))); // NOI18N

        ComprarBayaCaquic.setText("Comprar");
        ComprarBayaCaquic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarBayaCaquicActionPerformed(evt);
            }
        });

        ComprarBayaZanama.setText("Comprar");
        ComprarBayaZanama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarBayaZanamaActionPerformed(evt);
            }
        });

        ComprarPokeBall.setText("Comprar");
        ComprarPokeBall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarPokeBallActionPerformed(evt);
            }
        });

        ComprarPokeBall1.setText("Cerrar tienda");
        ComprarPokeBall1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarPokeBall1ActionPerformed(evt);
            }
        });

        ComprarZreza.setText("Comprar");
        ComprarZreza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarZrezaActionPerformed(evt);
            }
        });

        ComprarZiuela.setText("Comprar");
        ComprarZiuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarZiuelaActionPerformed(evt);
            }
        });

        ComprarEnigma.setText("Comprar");
        ComprarEnigma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarEnigmaActionPerformed(evt);
            }
        });

        ComprarEnigma1.setText("Comprar");
        ComprarEnigma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarEnigma1ActionPerformed(evt);
            }
        });

        ComprarZidra.setText("Comprar");
        ComprarZidra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarZidraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(ComprarBayaAranja))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(ComprarPokeBall))
                                .addGap(93, 93, 93)
                                .addComponent(ComprarZiuela)
                                .addGap(82, 82, 82)
                                .addComponent(ComprarEnigma)
                                .addGap(108, 108, 108)
                                .addComponent(ComprarEnigma1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ComprarBayaCaquic)
                                        .addGap(72, 72, 72)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(ComprarBayaZanama)
                                        .addGap(87, 87, 87)
                                        .addComponent(ComprarZreza)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ComprarZidra)
                                        .addGap(40, 40, 40))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(ComprarPokeBall1)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ComprarPokeBall1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComprarZreza)
                            .addComponent(ComprarBayaZanama)
                            .addComponent(ComprarBayaCaquic)
                            .addComponent(ComprarZidra)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComprarBayaAranja)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComprarPokeBall)
                        .addGap(279, 279, 279))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComprarZiuela)
                            .addComponent(ComprarEnigma)
                            .addComponent(ComprarEnigma1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComprarPokeBall1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarPokeBall1ActionPerformed
        // Cierra tienda:
        
        this.dispose();
    }//GEN-LAST:event_ComprarPokeBall1ActionPerformed

    private void ComprarBayaAranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarBayaAranjaActionPerformed
        try {
            // BayaAranja
            LobbyFarfetch1 l = new LobbyFarfetch1();
            l.musica.stop();
            LobbyChar j = new LobbyChar();
            j.musica.stop();
            int opcion = JOptionPane.showConfirmDialog(null, "La baya cuesta 100 watts", "",0,1);
            if (opcion == 1) {
                if ((l.watts <100)||(j.watts<100)) {
                    JOptionPane.showMessageDialog(null, "No tienes watts suficientes para comprar este objeto");
                }else{
                    int compra = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres comprar esta baya?", "",0,0);
                    if (compra == 0) {
                        if (l.watts <100) {
                            l.watts  = l.watts - 100;
                            
                        }else{
                            j.watts = j.watts - 100;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprarBayaAranjaActionPerformed

    private void ComprarBayaCaquicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarBayaCaquicActionPerformed
        try {
            // BayaAranja
            LobbyFarfetch1 l = new LobbyFarfetch1();
            l.musica.stop();
            LobbyChar j = new LobbyChar();
            j.musica.stop();
            int opcion = JOptionPane.showConfirmDialog(null, "Esta baya vale 200 watts", "", 1);
            if (opcion == 1) {
                if ((l.watts <200)||(j.watts<200)) {
                    JOptionPane.showMessageDialog(null, "No tienes watts suficientes para comprar este objeto");
                }else{
                    int compra = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres comprar esta baya?", "rer",1,0,null);
                    if (compra == 1) {
                        if (l.watts <200) {
                            l.watts  = l.watts - 200;
                            
                        }else{
                            j.watts = j.watts - 100;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprarBayaCaquicActionPerformed

    private void ComprarBayaZanamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarBayaZanamaActionPerformed
        
        try {
            LobbyFarfetch1 l = new LobbyFarfetch1();
            l.musica.stop();
            LobbyChar j = new LobbyChar();
            j.musica.stop();
            int opcion = JOptionPane.showConfirmDialog(null, "Esta baya vale 200 watts", "", 1);
            if (opcion == 1) {
                if ((l.watts <200)||(j.watts<200)) {
                    JOptionPane.showMessageDialog(null, "No tienes watts suficientes para comprar este objeto");
                }else{
                    int compra = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres comprar esta baya?", "rer",1,0,null);
                    if (compra == 1) {
                        if (l.watts <200) {
                            l.watts  = l.watts - 200;
                            
                        }else{
                            j.watts = j.watts - 100;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprarBayaZanamaActionPerformed

    private void ComprarZrezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarZrezaActionPerformed
        try {
            LobbyFarfetch1 l = new LobbyFarfetch1();
            l.musica.stop();
            LobbyChar j = new LobbyChar();
            j.musica.stop();
            int opcion = JOptionPane.showConfirmDialog(null, "Esta baya vale 200 watts", "", 1);
            if (opcion == 1) {
                if ((l.watts <200)||(j.watts<200)) {
                    JOptionPane.showMessageDialog(null, "No tienes watts suficientes para comprar este objeto");
                }else{
                    int compra = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres comprar esta baya?", "rer",1,0,null);
                    if (compra == 1) {
                        if (l.watts <200) {
                            l.watts  = l.watts - 200;
                            
                        }else{
                            j.watts = j.watts - 100;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprarZrezaActionPerformed

    private void ComprarZidraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarZidraActionPerformed
        try {
            LobbyFarfetch1 l = new LobbyFarfetch1();
            l.musica.stop();
            LobbyChar j = new LobbyChar();
            j.musica.stop();
            int opcion = JOptionPane.showConfirmDialog(null, "Esta baya vale 200 watts", "", 1);
            if (opcion == 1) {
                if ((l.watts <200)||(j.watts<200)) {
                    JOptionPane.showMessageDialog(null, "No tienes watts suficientes para comprar este objeto");
                }else{
                    int compra = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres comprar esta baya?", "rer",1,0,null);
                    if (compra == 1) {
                        if (l.watts <200) {
                            l.watts  = l.watts - 200;
                            
                        }else{
                            j.watts = j.watts - 100;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprarZidraActionPerformed

    private void ComprarPokeBallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarPokeBallActionPerformed
        try {
            LobbyFarfetch1 l = new LobbyFarfetch1();
            l.musica.stop();
            LobbyChar j = new LobbyChar();
            j.musica.stop();
            int opcion = JOptionPane.showConfirmDialog(null, "Esta baya vale 200 watts", "", 1);
            if (opcion == 1) {
                if ((l.watts <200)||(j.watts<200)) {
                    JOptionPane.showMessageDialog(null, "No tienes watts suficientes para comprar este objeto");
                }else{
                    int compra = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres comprar esta baya?", "rer",1,0,null);
                    if (compra == 1) {
                        if (l.watts <200) {
                            l.watts  = l.watts - 200;
                            
                        }else{
                            j.watts = j.watts - 100;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprarPokeBallActionPerformed

    private void ComprarZiuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarZiuelaActionPerformed
        try {
            LobbyFarfetch1 l = new LobbyFarfetch1();
            l.musica.stop();
            LobbyChar j = new LobbyChar();
            j.musica.stop();
            int opcion = JOptionPane.showConfirmDialog(null, "Esta baya vale 200 watts", "", 1);
            if (opcion == 1) {
                if ((l.watts <200)||(j.watts<200)) {
                    JOptionPane.showMessageDialog(null, "No tienes watts suficientes para comprar este objeto");
                }else{
                    int compra = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres comprar esta baya?", "rer",1,0,null);
                    if (compra == 1) {
                        if (l.watts <200) {
                            l.watts  = l.watts - 200;
                            
                        }else{
                            j.watts = j.watts - 100;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprarZiuelaActionPerformed

    private void ComprarEnigmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarEnigmaActionPerformed
        try {
            LobbyFarfetch1 l = new LobbyFarfetch1();
            l.musica.stop();
            LobbyChar j = new LobbyChar();
            j.musica.stop();
            int opcion = JOptionPane.showConfirmDialog(null, "Esta baya vale 200 watts", "", 1);
            if (opcion == 1) {
                if ((l.watts <200)||(j.watts<200)) {
                    JOptionPane.showMessageDialog(null, "No tienes watts suficientes para comprar este objeto");
                }else{
                    int compra = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres comprar esta baya?", "rer",1,0,null);
                    if (compra == 1) {
                        if (l.watts <200) {
                            l.watts  = l.watts - 200;
                            
                        }else{
                            j.watts = j.watts - 100;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprarEnigmaActionPerformed

    private void ComprarEnigma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarEnigma1ActionPerformed
        try {
            LobbyFarfetch1 l = new LobbyFarfetch1();
            l.musica.stop();
            LobbyChar j = new LobbyChar();
            j.musica.stop();
            int opcion = JOptionPane.showConfirmDialog(null, "Esta baya vale 200 watts", "", 1);
            if (opcion == 1) {
                if ((l.watts <200)||(j.watts<200)) {
                    JOptionPane.showMessageDialog(null, "No tienes watts suficientes para comprar este objeto");
                }else{
                    int compra = JOptionPane.showConfirmDialog(null, "¿Estás seguro que quieres comprar esta baya?", "rer",1,0,null);
                    if (compra == 1) {
                        if (l.watts <200) {
                            l.watts  = l.watts - 200;
                            
                        }else{
                            j.watts = j.watts - 100;
                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(TiendaBayas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComprarEnigma1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComprarBayaAranja;
    private javax.swing.JButton ComprarBayaCaquic;
    private javax.swing.JButton ComprarBayaZanama;
    private javax.swing.JButton ComprarEnigma;
    private javax.swing.JButton ComprarEnigma1;
    private javax.swing.JButton ComprarPokeBall;
    private javax.swing.JButton ComprarPokeBall1;
    private javax.swing.JButton ComprarZidra;
    private javax.swing.JButton ComprarZiuela;
    private javax.swing.JButton ComprarZreza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
