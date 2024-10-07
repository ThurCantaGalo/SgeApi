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
public class Area {
    
    private int area_id;
    private String nome_area, descricao;

    public Area() {
    }

    public Area(int area_id, String nome_area, String descricao) {
        this.area_id = area_id;
        this.nome_area = nome_area;
        this.descricao = descricao;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getNome_area() {
        return nome_area;
    }

    public void setNome_area(String nome_area) {
        this.nome_area = nome_area;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
