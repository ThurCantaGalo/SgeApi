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
public class Turmas {
    private int id_turma, fk_id_professordisciplina;
    private String nome_turma;

    public Turmas() {
    }

    public Turmas(int id_turma, int fk_id_professordisciplina, String nome_turma) {
        this.id_turma = id_turma;
        this.fk_id_professordisciplina = fk_id_professordisciplina;
        this.nome_turma = nome_turma;
    }

    public int getId_turma() {
        return id_turma;
    }

    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }

    public int getFk_id_professordisciplina() {
        return fk_id_professordisciplina;
    }

    public void setFk_id_professordisciplina(int fk_id_professordisciplina) {
        this.fk_id_professordisciplina = fk_id_professordisciplina;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }
    
    
}
