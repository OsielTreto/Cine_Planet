/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.bd.pkg2.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Osiel Treto
 */
public class CarteleraRegistrar extends javax.swing.JFrame {

    Connection conex = null;
    private static Connection Conexion;

    /**
     * Creates new form CarteleraRegistrar
     */
    public CarteleraRegistrar() {
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
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        tfTitulo = new javax.swing.JTextField();
        tfClasificacion = new javax.swing.JTextField();
        tfAño = new javax.swing.JTextField();
        tfDuracion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfGenero = new javax.swing.JTextField();
        tfDirector = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setSize(new java.awt.Dimension(1000, 700));
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(162, 28, 38));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cartelera");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(200, 20, 420, 40);

        jPanel5.setBackground(new java.awt.Color(239, 239, 239));

        btnModificar.setBackground(new java.awt.Color(255, 255, 255));
        btnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(112, 112, 115));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(112, 112, 115));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(112, 112, 115));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(112, 112, 115));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("OPCIONES");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(20, 20, 160, 210);

        jPanel7.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("Titulo");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(60, 80, 70, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Director");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(60, 120, 90, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Año");
        jPanel7.add(jLabel14);
        jLabel14.setBounds(60, 160, 90, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("Clasificación");
        jPanel7.add(jLabel15);
        jLabel15.setBounds(60, 200, 101, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Duración");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(60, 240, 90, 20);

        btnAceptar.setBackground(new java.awt.Color(162, 28, 38));
        btnAceptar.setFont(new java.awt.Font("Haettenschweiler", 0, 21)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel7.add(btnAceptar);
        btnAceptar.setBounds(140, 350, 144, 39);

        jPanel8.setBackground(new java.awt.Color(112, 112, 115));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registrar");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(156, 156, 156))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8);
        jPanel8.setBounds(0, 0, 420, 41);

        tfTitulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel7.add(tfTitulo);
        tfTitulo.setBounds(200, 80, 150, 25);

        tfClasificacion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel7.add(tfClasificacion);
        tfClasificacion.setBounds(200, 200, 150, 25);

        tfAño.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel7.add(tfAño);
        tfAño.setBounds(200, 160, 150, 25);

        tfDuracion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDuracionActionPerformed(evt);
            }
        });
        jPanel7.add(tfDuracion);
        tfDuracion.setBounds(200, 240, 150, 25);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setText("Género");
        jPanel7.add(jLabel16);
        jLabel16.setBounds(60, 280, 90, 20);

        tfGenero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel7.add(tfGenero);
        tfGenero.setBounds(200, 280, 150, 25);

        tfDirector.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel7.add(tfDirector);
        tfDirector.setBounds(200, 120, 150, 25);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(200, 80, 420, 450);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 150, 640, 550);

        jLabel5.setBackground(new java.awt.Color(204, 102, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartelera/Verdad O Reto.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 420, 182, 272);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartelera/avengers.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 150, 182, 272);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartelera/Rampage Devastación.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(820, 150, 182, 272);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cartelera/deadpool.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(820, 420, 182, 272);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        CarteleraModificar modificar = new CarteleraModificar();
        setVisible(false);
        modificar.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        CarteleraEliminar eliminar = new CarteleraEliminar();
        setVisible(false);
        eliminar.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        String titulo = tfTitulo.getText();
        String director = tfDirector.getText();
        String año = tfAño.getText();
        String clasificacion = tfClasificacion.getText();
        String duracion = tfDuracion.getText();
        String genero = tfGenero.getText();

        // String consulta = "INSERT INTO `usuario`(`No_tarjeta`, `Nombre`, `Apellido`, `Telefono`, `Correo`, `Direccion`, `Puntos`) VALUES ([" + no_tarjeta + "],[" + nombre + "],[" + apellido + "],[" + telefono + "],[" + correo + "],[" + direccion + "],[" + puntos + "])";
        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor,ingresa el titulo");
        } else {
            if (director.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor,ingresa el director");
            } else {
                if (año.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa el año");
                } else {
                    if (clasificacion.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingresa la clasificacion");
                    } else {
                        if (duracion.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Por favor, ingresa la duracion");
                        } else {
                            if (genero.isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Por favor, ingresa el genero");

                            } else {

                                int dialogButton;

                                dialogButton = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea realizar el registro?");
                                if (dialogButton == JOptionPane.YES_OPTION) {
                                    try {
                                        String Query = "INSERT INTO " + "cartelera" + " VALUES("
                                                + "\"" + titulo + "\", "
                                                + "\"" + director + "\", "
                                                + "\"" + año + "\", "
                                                + "\"" + clasificacion + "\", "
                                                + "\"" + duracion + "\", "
                                                + "\"" + genero + "\")";
                                        Statement st = Conexion.createStatement();
                                        st.executeUpdate(Query);
                                        JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
                                        tfTitulo.setText("");
                                        tfDirector.setText("");
                                        tfAño.setText("");
                                        tfClasificacion.setText("");
                                        tfDuracion.setText("");
                                        tfGenero.setText("");
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
                                        System.out.println(ex);
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Registro cancelado");
                                }

                            }
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void tfDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDuracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDuracionActionPerformed

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
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa (Cartelera - Registrar)");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cartelera.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Cartelera.class
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
            java.util.logging.Logger.getLogger(CarteleraRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarteleraRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarteleraRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarteleraRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarteleraRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCARTELERA;
    private javax.swing.JButton BTNHORARIO;
    private javax.swing.JButton BTNSALIR;
    private javax.swing.JButton BTNUSUARIO;
    private javax.swing.JButton BTNVENTA;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField tfAño;
    private javax.swing.JTextField tfClasificacion;
    private javax.swing.JTextField tfDirector;
    private javax.swing.JTextField tfDuracion;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfTitulo;
    // End of variables declaration//GEN-END:variables
}
