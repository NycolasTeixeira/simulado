/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Turma;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import utils.Conexao;

/**
 *
 * @author nycolas_teixeira
 */
public class turmaDAO {

    public static ArrayList<Turma> buscarTurmas(int id) {

        String sql = "SELECT * FROM turma WHERE id_professor = ?";
        ArrayList<Turma> turmas = new ArrayList<>();
        

        try (PreparedStatement stm = Conexao.conexao().prepareStatement(sql)) {
         stm.setInt(1, id);
         
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                String nome = rs.getString("nome");
                int numero = rs.getInt("numero_turma");
                turmas.add(new Turma(numero, nome));
            }
            
            return turmas;
        } catch (Exception e) {
            System.out.println(e);
        }
        return turmas;

    }



 public static boolean deletar (int numero) {

        String sql = "DELETE FROM turmas WHERE numero = ?";
        ArrayList<Turma> turmas = new ArrayList<>();
        

        try (PreparedStatement stm = Conexao.conexao().prepareStatement(sql)) {
         stm.setInt(1, numero);
         
            stm.executeUpdate();
            return true;
            
        
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;

    }





}
