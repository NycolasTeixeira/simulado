/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nycolas_teixeira
 */
public class Conexao {

    public static Connection conexao() {

        try {
            
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/saep_db", "postgres", "nycolas");
           
        } catch (SQLException e) {
            System.out.println("chegou");
            System.out.println(e);
        }

        return null;

    }

}
