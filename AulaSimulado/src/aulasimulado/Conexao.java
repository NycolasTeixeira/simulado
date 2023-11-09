/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulasimulado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexao {
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "senai";
    private static final String URL = "jdbc:postgresql://localhost:5432/tabelaGerente";
 
    private static Connection conexao;
    
    public static Connection CriaConexao(){
        if(conexao == null){
            try {
                Class.forName(DRIVER);
                conexao = DriverManager.getConnection(URL,USUARIO, SENHA);
                System.out.println("Conexao foi feita com sucesso");
            } catch (Exception e) {
                System.out.println("problema");
            }
        }
        return conexao;
    }
}
  /*     public void insereConta() {
        String sql = "INSERT INTO conta (id, numero, saldo, tipo, pessoa_id, senha) VALUES (?, ?, ?, CAST (? as tipo_conta), ?, ?)";
     

        try {
            PreparedStatement stm = this.conexao.prepareStatement(sql);
            stm.setObject(1, conta.getId());
            stm.setInt(2, conta.getNumero());
            stm.setDouble(3, conta.getSaldo());
          

            stm.executeUpdate();
        } catch (SQLException error) {
            System.out.println(error);
        }
    }
}
*/