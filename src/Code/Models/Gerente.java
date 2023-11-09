package Code.Models;

import java.util.UUID;


public class Gerente {
    private UUID id;
    private String nome;
    private String email;
    private String senha;

    public Gerente(String nome, String email, String senha) {
        this.id = UUID.randomUUID(); 
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Gerente(UUID id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    

    public UUID getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    
    
}
