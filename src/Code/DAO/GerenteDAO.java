package Code.DAO;

import Code.Models.Gerente;
import Code.Utils.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;
import javax.swing.JOptionPane;


public class GerenteDAO {
    
    public Gerente buscarGerentePorEmail(String email){
        String sql = "SELECT * FROM gerente WHERE email = ?";
        
        try (PreparedStatement stmt = Conexao.criaConexao().prepareStatement(sql)){
            stmt.setString(1, email);
            ResultSet result = stmt.executeQuery();
            
            if(result.next()){
                UUID id = result.getObject("id", UUID.class);
                String nome = result.getString("nome");
                String emailB = result.getString("email");
                String senha = result.getString("senha");
                Gerente gerente = new Gerente(id, nome, emailB, senha);
                
                return gerente;
            }
        } catch (SQLException erro) {
            JOptionPane.showConfirmDialog(null, "Erro ao buscar!");
        }
        return null;
    }
}