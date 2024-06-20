/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Windows 11
 */
public class CadastroClientes {
    
    private String nome;
    private String cpf;
    private String cel;
    private String email;
    private String aulas;
    private double peso;
    private double altura;

    public CadastroClientes(String nome, String cpf, String cel, String email, String aulas, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.cel = cel;
        this.email = email;
        this.aulas = aulas;
        this.peso = peso;
        this.altura = altura;
    }

    public CadastroClientes(String nome, String cpf, String cel, String aulas) {
        this.nome = nome;
        this.cpf = cpf;
        this.cel = cel;
        this.aulas = aulas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAulas() {
        return aulas;
    }

    public void setAulas(String aulas) {
        this.aulas = aulas;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
