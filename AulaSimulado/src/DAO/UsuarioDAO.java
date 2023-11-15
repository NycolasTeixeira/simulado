/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import aulasimulado.Conexao;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author nycolas_teixeira
 */
public class UsuarioDAO {

    public Usuario buscarGerentePorEmail(String email) {
        String sql = "SELECT * FROM tabelaGerente WHERE email = ?";
        try (PreparedStatement stm = Conexao.CriaConexao().prepareStatement(sql)) {
            stm.setString(1, email);
            ResultSet result = stm.executeQuery();

            if (result.next()) {
                Integer id = result.getObject("id", Integer.class);
                String nome = result.getString("nome");
                String emailRetorno = result.getString("email");
                String senha = result.getString("senha");
                Usuario usuario = new Usuario(id,emailRetorno, senha, nome);
                      
               return usuario;
            }
        } catch (ClassNotFoundException | SQLException e ) {
          
        }
        return null;
    }
}
