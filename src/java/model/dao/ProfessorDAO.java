/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.Area;
import model.bean.Disciplina;
import model.bean.Professores;

/**
 *
 * @author Senai
 */
public class ProfessorDAO {
    public List <Professores> listarProfessor(){
    List <Professores> professores = new ArrayList();
    try{
    Connection conexao = Conexao.conectar();
    PreparedStatement stmt = null; 
    ResultSet rs = null;
    
    stmt = conexao.prepareStatement("SELECT * FROM professor");
    rs = stmt.executeQuery();
    
    while(rs.next()){
    Professores prof = new Professores();
    
    prof.setId_professor(rs.getInt("id_professor"));
    prof.setNome(rs.getString("nome"));
    prof.setSobrenome(rs.getString("sobrenome"));
    prof.setCpf(rs.getString("cpf"));
    prof.setImagem(rs.getString("imagem"));
    prof.setDisciplina(new DisciplinaDAO().lerDisciplinasProfessores(rs.getInt("id_professor")));
   professores.add(prof);
    }
    }catch(SQLException e){
    e.printStackTrace();
    }
    return professores;
    }
}
