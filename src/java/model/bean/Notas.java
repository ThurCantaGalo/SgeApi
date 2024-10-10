/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class Notas {
    private int id_notas, fk_id_aluno, fk_id_tarefa;
    private float nota;

    public Notas() {
    }

    public Notas(int id_notas, int fk_id_aluno, int fk_id_tarefa, float nota) {
        this.id_notas = id_notas;
        this.fk_id_aluno = fk_id_aluno;
        this.fk_id_tarefa = fk_id_tarefa;
        this.nota = nota;
    }

    public int getId_notas() {
        return id_notas;
    }

    public void setId_notas(int id_notas) {
        this.id_notas = id_notas;
    }

    public int getFk_id_aluno() {
        return fk_id_aluno;
    }

    public void setFk_id_aluno(int fk_id_aluno) {
        this.fk_id_aluno = fk_id_aluno;
    }

    public int getFk_id_tarefa() {
        return fk_id_tarefa;
    }

    public void setFk_id_tarefa(int fk_id_tarefa) {
        this.fk_id_tarefa = fk_id_tarefa;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
    
}
