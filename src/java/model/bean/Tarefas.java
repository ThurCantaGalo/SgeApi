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
    private int id_tarefas, fk_id_turma;
    private String nome_tarefa, decricao;
    private Date data_entrega;

    public Tarefas() {
    }

    public Tarefas(int id_tarefas, int fk_id_turma, String nome_tarefa, String decricao, Date data_entrega) {
        this.id_tarefas = id_tarefas;
        this.fk_id_turma = fk_id_turma;
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

    public int getFk_id_turma() {
        return fk_id_turma;
    }

    public void setFk_id_turma(int fk_id_turma) {
        this.fk_id_turma = fk_id_turma;
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
