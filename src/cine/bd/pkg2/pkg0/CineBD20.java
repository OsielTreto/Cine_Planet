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
public class CineBD20 {

    Connection conex = null;
    private static Connection Conexion;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CineBD20 cine = new CineBD20();

        Menu menu = new Menu();
        //cine.MySQLConnection();

        menu.setVisible(true);

    }

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

}
