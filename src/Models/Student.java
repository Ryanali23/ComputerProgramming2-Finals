
package Models;

import DatabaseHelper.StudentDatabaseHelper;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Student extends StudentDatabaseHelper{
    public final int id;
    public final String firstName;
    public  final String lastName;
    public  final String gender; 
    public final String grade;
    public final String birthDay;
    
    
    
    public Student(){
        
        this.id = 0;
        this.firstName = " ";
         this.lastName = " ";
        this.gender = " "; 
        this.grade = " ";
        this.birthDay = " ";
        
        
    }
    public Student(String firstName,String lastName,String gender, String  grade, String birthDay){
         
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.grade = grade; 
        this.birthDay = birthDay;
        this.id = 0;
    }
     public Student(int id, String firstName,String lastName,String gender, String  grade, String birthDay){
        
         this.id = 0; 
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.grade = grade; 
        this.birthDay = birthDay;
        
    }
    
    
    
    @Override
    public void create(){
     String query = "INSERT INTO `students`(`studentFirstName`, `studentLastName`, `studentGender`, `studentGrade`, `Birthday`) VALUES "
                + "('" + this.firstName + "'," + "'"+  this.lastName + "','" + this.gender + "','" + this.grade + "','" + this.birthDay +"'"+")";
        try {
            Statement statement = getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Student Added");
            
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    @Override
     public void update(int id){
        String query = "UPDATE students SET studentFirstName= '" + this.firstName + "',studentLastname= '" + this.lastName + "',studentGender= '" + this.gender + "',studentGrade = '" + this.grade +  "',Birthday = '" + this.birthDay + "' Where studentId= '" + id + "'";
          try {
            Statement statement = getConnection().createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            System.err.println(e);
        }
        
     }   
  
    
}
