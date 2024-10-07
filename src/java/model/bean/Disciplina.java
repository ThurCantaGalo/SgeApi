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
public class Disciplina {
    private int id_disciplina;
    private Area area;
    private String nome_disciplina;

    public Disciplina() {
    }

    public Disciplina(int id_disciplina, Area area, String nome_disciplina) {
        this.id_disciplina = id_disciplina;
        this.area = area;
        this.nome_disciplina = nome_disciplina;
    }

    public int getId_disciplina() {
        return id_disciplina;
    }

    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }

    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    
    
    
}
