package model;

public class Usuario {

    private Integer id;
    private String email;
    private String senha;
    private String nome;

    public Usuario(String email, String senha, String nome) {
        this.id = (int) Math.random();
        this.email = email;
        this.senha = senha;
        this.nome = nome;
    }

    public Usuario(Integer id, String email, String senha, String nome) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

}
