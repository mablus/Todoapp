/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;



/**
 *
 * @author Usuario
 */
public class ProjectController {
        
        public void save(Project project) throws ClassNotFoundException{
                String sql = "INSERT INTO projects (name,"
                        + "descr,"
                        + "createdAt,"
                        + "updatedAt) VALUES(?,?,?,?)";
                
                Connection connection = null;
                PreparedStatement statement = null;
                
                try{
                    connection = ConnectionFactory.getConnection();
                    statement = connection.prepareStatement(sql);
                    
                    statement.setString(1, project.getName());
                    statement.setString(2, project.getDescr());
                    statement.setDate(3,new Date (project.getCreatedAt().getTime()));
                    statement.setDate(4,new Date (project.getUpdatedAt().getTime()));
                    statement.execute();
                    }catch(SQLException ex){
                    throw new RuntimeException("Erro ao salvar o Projeto."
                    +ex.getMessage(), ex);
                } finally{
                ConnectionFactory.closeConnection(connection, statement);
                }  
            
            
        }
        public void update(Project project) throws ClassNotFoundException {
                String sql = "UPDATE projects SET Name = ?, descr = ?,"
                        + "createdAt = ?, "
                        + "updatedAt=?,"
                        + " WHERE id = ?";
                
                        Connection connection = null;
                        PreparedStatement statement = null;
                        
                        
                try{
                        connection = ConnectionFactory.getConnection();
                        statement = connection.prepareStatement(sql);
                        
                        statement.setString(1, project.getName());
                        statement.setString(2, project.getDescr());
                        statement.setDate(3, new Date(project.getCreatedAt().getTime()));
                        statement.setDate(4, new Date(project.getUpdatedAt().getTime()));
                        statement.setInt(5, project.getId());
                        statement.execute();
                        
                }catch (SQLException ex){
                    throw new RuntimeException("Erro ao atualizar o projeto "+ ex.getMessage(),ex);

                }finally{
                    ConnectionFactory.closeConnection(connection, statement);
                }
        }
        public List<Project> getAll(){
                String sql = "SELECT * FROM projects";
                
                    List<Project> projects = new ArrayList<>();
                
                Connection connection = null;
                PreparedStatement statement = null;
                ResultSet resultSet = null; 
                
                    try{
                        connection = ConnectionFactory.getConnection();
                        statement = connection.prepareStatement(sql);
                        resultSet = statement.executeQuery();
                        
                        while(resultSet.next()){
                                
                                Project project = new Project();
                            
                            project.setName(resultSet.getString("name"));
                            project.setDescr(resultSet.getString("descr"));
                            project.setUpdatedAt(resultSet.getDate("updatedAt"));
                            project.setCreatedAt(resultSet.getDate("createdAt"));
                                
                        projects.add(project);
                        
                        }
                        
                        
                    }catch(Exception ex){
                        throw new RuntimeException("Erro ao inserir a tarefa."
                                + ex.getMessage(),ex);
                    }finally{
                        ConnectionFactory.closeConnection(connection,statement, resultSet);
                    }
                    return projects;
                }
         
                public void removeById(int idProject) throws ClassNotFoundException{
                    String sql = "DELETE FROM projects WHERE id = ?";
                    Connection connection = null;
                    PreparedStatement statement = null;
                    
                    try{
                    
                        connection = ConnectionFactory.getConnection();
                        statement =  connection.prepareStatement(sql);
                        statement.setInt(1, idProject);
                        statement.execute();
                    
                    }catch (SQLException ex){
                        throw new RuntimeException("Erro ao atualizar o projeto.",ex);
                    }finally{
                        ConnectionFactory.closeConnection(connection, statement);
                    }
                }

    public void removeById() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
