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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Task;
import util.ConnectionFactory;
/**
 *
 * @author Usuario
 */
public class TaskController {
    
    public void save(Task task) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO tasks (idProject,"
                + "name,"
                + "descr,"
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updatedAt) VALUES(?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement = null; 
        
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescr());
            statement.setBoolean(4, task.isIsCompleted());
            statement.setString(5, task.getNotes());
            statement.setDate(6,new Date (task.getDeadline().getTime()));
            statement.setDate(7,new Date (task.getCreatedAt().getTime()));
            statement.setDate(8,new Date (task.getUpdatedAt().getTime()));
            statement.execute();
            }catch(SQLException ex){
             throw new SQLException("Erro ao deletar a tarefa."
             +ex.getMessage(), ex);
        } finally{
        ConnectionFactory.closeConnection(connection, statement);
        }  
    
    }
    
    public void update(Task task){
        String sql = "UPDATE tasks SET idProject= ?, Name = ?, descr = ?,"
                + "notes = ?,"
                + "deadline = ?,"
                + "completed = ? "
                + "createdAt = ?, "
                + "updatedAt=?,"
                + " WHERE id = ?";
        
                Connection connection = null;
                PreparedStatement statement = null;
                
                
         try{
                connection = ConnectionFactory.getConnection();
                statement = connection.prepareStatement(sql);
                statement.setInt(1, task.getIdProject());
                statement.setString(1, task.getName());
                statement.setString(2, task.getDescr());
                statement.setString(3, task.getDescr());
                statement.setString(4, task.getNotes());
                statement.setBoolean(5, task.isIsCompleted());
                statement.setDate(6, new Date(task.getDeadline().getTime()));
                statement.setDate(7, new Date(task.getCreatedAt().getTime()));
                statement.setDate(8, new Date(task.getUpdatedAt().getTime()));
                statement.setInt(9, task.getId());
                statement.execute();
                
         }catch (Exception ex){
             throw new RuntimeException("Erro ao atualizar a tarefa."
                     + ex.getMessage(),ex);

             
         }

    }
    
    public void removeById(int taskId) {
        String sql = "DELETE FROM tasks WHERE id = ?";
        Connection connection = null;
        PreparedStatement statement = null;
        
        try{
        
            connection = ConnectionFactory.getConnection();
            statement =  connection.prepareStatement(sql);
            statement.setInt(1, taskId);
            statement.execute();
        
        }catch (SQLException ex){
              throw new RuntimeException("Erro ao atualizar a tarefa."+ ex.getMessage(),ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TaskController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public List<Task> getAll(int idProject){
        String sql = "SELECT * FROM tasks WHERE idProject = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null; 
        
        List<Task> tasks = new ArrayList<>();
        
            try{
                connection = ConnectionFactory.getConnection();
                statement = connection.prepareStatement(sql);
                statement.setInt(1,idProject);
                resultSet = statement.executeQuery();
                
                while(resultSet.next()){
                        
                        Task task = new Task();
                        task.setId(resultSet.getInt("id"));
                        task.setIdProject(resultSet.getInt("idProject"));
                        task.setName(resultSet.getString("name"));
                        task.setDescr(resultSet.getString("descr"));
                        task.setNotes(resultSet.getString("notes"));
                        task.setIsCompleted(resultSet.getBoolean("completed"));
                        task.setDeadline(resultSet.getDate("deadline"));
                        task.setUpdatedAt(resultSet.getDate("updatedAt"));
                        task.setCreatedAt(resultSet.getDate("createdAt"));
                        
                tasks.add(task);
                
                }
                
                
            }catch(Exception ex){
                throw new RuntimeException("Erro ao inserir a tarefa."
                        + ex.getMessage(),ex);
            }finally{
                ConnectionFactory.closeConnection(connection,statement, resultSet);
            }
        //lista de tarefas criadas
        return tasks;    
    }
}
