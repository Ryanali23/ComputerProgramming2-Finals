
package DatabaseHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;



public class StudentDatabaseHelper extends myDatabase implements CRUD{
    
    @Override
    public void create(){
        
     
    }

    @Override
    public ResultSet read(){

    String query = "SELECT  `studentFirstName` as `First name`, `studentLastName` as `Last name`, `studentGender` as `Gender`, `studentGrade` as `Grade`, `Birthday` FROM `students`";
         try{
            
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
         
           return resultSet;
                
        }
        catch(SQLException e){
            System.err.println(e);
        }
        
        return null;
    }
    @Override
     public void update(int id){
        
    }
    @Override
     public void delete(int id){
        String query = "DELETE FROM students where studentId ='" + id + "'";
        try {
            Statement statement = getConnection().createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            System.err.println(e);
        }
        
    }
     
     
    public ResultSet readGradeYearLevel(){
    
        String query = "SELECT DISTINCT studentGrade from students";
        try{
        
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            return resultSet;
        }
        catch(SQLException e){
        }
        return null;
    }
    public ResultSet readStudentsByGrade(String grade){
        
         String query = "SELECT * from students where studentGrade= '" + grade + "'" ;
        try{
        
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            return resultSet;
        }
        catch(SQLException e){
        }
        return null;
        
    }
    public ResultSet readOne(int id){
             String query = "SELECT * from students where studentId= '" + id + "'" ;
        try{
        
            Statement statement = getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            
            return resultSet;
        }
        catch(SQLException e){
        }
        return null;
        
    
    }
}
