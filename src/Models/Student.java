
package Models;

import DatabaseHelper.StudentDatabaseHelper;


public class Student extends  StudentDatabaseHelper{
    private String firstName;
    private String lastName;
    private String gender; 
    private String grade;
    private String yearEnrolled;
    
    public Student(String firstName,String lastName,String gender, String  grade, String yearEnrolled){
         
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.grade = grade; 
        this.yearEnrolled = yearEnrolled;
        
    }
    
}
