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

/**
 *
 * @author Senai
 */
public class DisciplinaDAO {
    public List <Disciplina> lerDisciplinas(){
      List<Disciplina> lista = new ArrayList();
      try{
        Connection conexao = Conexao.conectar(); 
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        stmt = conexao.prepareStatement("SELECT * FROM disciplina AS dis INNER JOIN area ON dis.area = area.id_area;");
        
        rs = stmt.executeQuery();
        
        while(rs.next()){
             Disciplina dis = new Disciplina();
             dis.setId_disciplina(rs.getInt("id_disciplina"));
             dis.setNome_disciplina(rs.getString("nome_disciplina"));
             
             Area area = new Area();
             area.setArea_id(rs.getInt("id_area"));
             area.setNome_area(rs.getString("nome_area"));
             area.setDescricao(rs.getString("descricao_area"));
             dis.setArea(area);
             lista.add(dis);
        }
      }catch(SQLException e){
      e.printStackTrace();
      }
    return(lista);
    }
}
