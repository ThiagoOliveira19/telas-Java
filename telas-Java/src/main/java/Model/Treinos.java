/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Windows 11
 */
public class Treinos {
    
    private String nome_cliente;
    private String id_cliente;
    private String data_treino;
    private String descricao_treino;
    private String instrutor;
    private String objetivo;
    private String equipamentos;
    private String observações;

    public Treinos(String nome_cliente, String id_cliente, String data_treino, String objetivo, String equipamentos) {
        this.nome_cliente = nome_cliente;
        this.id_cliente = id_cliente;
        this.data_treino = data_treino;
        this.objetivo = objetivo;
        this.equipamentos = equipamentos;
    }

    public Treinos(String nome_cliente, String id_cliente, String data_treino, String descricao_treino, String instrutor, String objetivo, String equipamentos, String observações) {
        this.nome_cliente = nome_cliente;
        this.id_cliente = id_cliente;
        this.data_treino = data_treino;
        this.descricao_treino = descricao_treino;
        this.instrutor = instrutor;
        this.objetivo = objetivo;
        this.equipamentos = equipamentos;
        this.observações = observações;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getData_treino() {
        return data_treino;
    }

    public void setData_treino(String data_treino) {
        this.data_treino = data_treino;
    }

    public String getDescricao_treino() {
        return descricao_treino;
    }

    public void setDescricao_treino(String descricao_treino) {
        this.descricao_treino = descricao_treino;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }

    public String getObservações() {
        return observações;
    }

    public void setObservações(String observações) {
        this.observações = observações;
    }
    
    
    
    
    
}
