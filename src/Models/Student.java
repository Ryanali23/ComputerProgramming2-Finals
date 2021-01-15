
package Models;

import DatabaseHelper.StudentDatabaseHelper;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Student extends StudentDatabaseHelper{
    private final String firstName;
    private final String lastName;
    private final String gender; 
    private final String grade;
    private final String yearEnrolled;
    
    public Student(String firstName,String lastName,String gender, String  grade, String yearEnrolled){
         
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.grade = grade; 
        this.yearEnrolled = yearEnrolled;
        
    }
    
    
    @Override
    public void create(){
     String query = "INSERT INTO `students`(`studentFirstName`, `studentLastName`, `studentGender`, `studentGrade`, `yearEnrolled`) VALUES "
                + "('" + this.firstName + "'," + "'"+  this.lastName + "','" + this.gender + "','" + this.grade + "','" + this.yearEnrolled +"'"+")";
        System.out.println(query);
        try {
            Statement statement = getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"student added");
            
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    
}
