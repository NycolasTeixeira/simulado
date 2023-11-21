/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nycolas_teixeira
 */
public class Turma {
   private int numero;
    private String nome;

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public Turma(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }
}
