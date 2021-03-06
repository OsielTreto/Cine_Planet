/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.bd.pkg2.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Osiel Treto
 */
public class Menu extends javax.swing.JFrame {
Connection conex = null;
    private static Connection Conexion;
    /**
     * Creates new form Menu
     */
    public Menu() {
        MySQLConnection();
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BTNVENTA = new javax.swing.JButton();
        BTNCARTELERA = new javax.swing.JButton();
        BTNHORARIO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTNSALIR = new javax.swing.JButton();
        BTNUSUARIO = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1000, 700));
        setName("Menu"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(1000, 700));

        jPanel1.setBackground(new java.awt.Color(162, 28, 38));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 40));
        jPanel1.setLayout(null);

        BTNVENTA.setBackground(new java.awt.Color(162, 28, 38));
        BTNVENTA.setFont(new java.awt.Font("Haettenschweiler", 0, 30)); // NOI18N
        BTNVENTA.setForeground(new java.awt.Color(255, 255, 255));
        BTNVENTA.setText("Venta de Boletos");
        BTNVENTA.setAutoscrolls(true);
        BTNVENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNVENTAActionPerformed(evt);
            }
        });
        jPanel1.add(BTNVENTA);
        BTNVENTA.setBounds(200, 0, 200, 40);

        BTNCARTELERA.setBackground(new java.awt.Color(162, 28, 38));
        BTNCARTELERA.setFont(new java.awt.Font("Haettenschweiler", 0, 30)); // NOI18N
        BTNCARTELERA.setForeground(new java.awt.Color(255, 255, 255));
        BTNCARTELERA.setText("Cartelera");
        BTNCARTELERA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCARTELERAActionPerformed(evt);
            }
        });
        jPanel1.add(BTNCARTELERA);
        BTNCARTELERA.setBounds(400, 0, 200, 40);

        BTNHORARIO.setBackground(new java.awt.Color(162, 28, 38));
        BTNHORARIO.setFont(new java.awt.Font("Haettenschweiler", 0, 30)); // NOI18N
        BTNHORARIO.setForeground(new java.awt.Color(255, 255, 255));
        BTNHORARIO.setText("Horario");
        BTNHORARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNHORARIOActionPerformed(evt);
            }
        });
        jPanel1.add(BTNHORARIO);
        BTNHORARIO.setBounds(600, 0, 200, 40);

        jLabel1.setFont(new java.awt.Font("Haettenschweiler", 0, 100)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cine");

        jLabel2.setFont(new java.awt.Font("Haettenschweiler", 0, 100)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(162, 28, 38));
        jLabel2.setText("Planet");

        BTNSALIR.setBackground(new java.awt.Color(51, 51, 51));
        BTNSALIR.setFont(new java.awt.Font("Haettenschweiler", 0, 21)); // NOI18N
        BTNSALIR.setForeground(new java.awt.Color(255, 255, 255));
        BTNSALIR.setText("Salir");
        BTNSALIR.setBorderPainted(false);
        BTNSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSALIRActionPerformed(evt);
            }
        });

        BTNUSUARIO.setBackground(new java.awt.Color(51, 51, 51));
        BTNUSUARIO.setFont(new java.awt.Font("Haettenschweiler", 0, 21)); // NOI18N
        BTNUSUARIO.setForeground(new java.awt.Color(255, 255, 255));
        BTNUSUARIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        BTNUSUARIO.setText("Usuario");
        BTNUSUARIO.setBorderPainted(false);
        BTNUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNUSUARIOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(BTNSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTNUSUARIO)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(BTNSALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1000, 155);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avengers.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 150, 1000, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNVENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNVENTAActionPerformed
        Venta venta2 = new Venta();
        setVisible(false);

        venta2.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_BTNVENTAActionPerformed

    private void BTNCARTELERAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCARTELERAActionPerformed
        Cartelera cartelera2 = new Cartelera();
        setVisible(false);

        cartelera2.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_BTNCARTELERAActionPerformed

    private void BTNHORARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNHORARIOActionPerformed
        Horario horario2 = new Horario();
        setVisible(false);

        horario2.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_BTNHORARIOActionPerformed

    private void BTNSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSALIRActionPerformed
        try {
            Conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
            System.exit(0);

        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Se ha finalizado la conexión con el servidor");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BTNSALIRActionPerformed

    private void BTNUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNUSUARIOActionPerformed
        Usuario usuario5 = new Usuario();
        setVisible(false);
        usuario5.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNUSUARIOActionPerformed


    /**
     * @param args the command line arguments
     */
    
    public void MySQLConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cine", "root", "");
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCARTELERA;
    private javax.swing.JButton BTNHORARIO;
    private javax.swing.JButton BTNSALIR;
    private javax.swing.JButton BTNUSUARIO;
    private javax.swing.JButton BTNVENTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
