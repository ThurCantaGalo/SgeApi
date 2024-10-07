/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.sql.Date;

/**
 *
 * @author Senai
 */
public class Tarefas {
    private int id_tarefas, id_disciplina;
    private String nome_tarefa, decricao;
    private Date data_entrega;

    public Tarefas() {
    }

    public Tarefas(int id_tarefas, int id_disciplina, String nome_tarefa, String decricao, Date data_entrega) {
        this.id_tarefas = id_tarefas;
        this.id_disciplina = id_disciplina;
        this.nome_tarefa = nome_tarefa;
        this.decricao = decricao;
        this.data_entrega = data_entrega;
    }

    public int getId_tarefas() {
        return id_tarefas;
    }

    public void setId_tarefas(int id_tarefas) {
        this.id_tarefas = id_tarefas;
    }

    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public String getNome_tarefa() {
        return nome_tarefa;
    }

    public void setNome_tarefa(String nome_tarefa) {
        this.nome_tarefa = nome_tarefa;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Date getData_entrega() {
        return data_entrega;
    }

    public void setData_entrega(Date data_entrega) {
        this.data_entrega = data_entrega;
    }
    
    
}
