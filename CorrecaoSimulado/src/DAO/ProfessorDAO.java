/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Professor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.Conexao;

/**
 *
 * @author nycolas_teixeira
 */
public class ProfessorDAO {
    
    public static Professor buscarporEmail(String email) {
        
        String sql = "SELECT * FROM professor WHERE email = ?";
        try (PreparedStatement stm = Conexao.conexao().prepareStatement(sql)) {
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                
                return new Professor(id, nome, email, senha);
                
            }
            
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
        
        return null;
        
    }
    
}
