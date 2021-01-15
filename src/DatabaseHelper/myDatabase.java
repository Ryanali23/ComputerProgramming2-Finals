package DatabaseHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RYAN
 */
public class myDatabase {
    private Connection connection;
    
    
    public myDatabase(){
      try{
         Class.forName("com.mysql.cj.jdbc.Driver");  
         connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","");
         System.out.print("Success");
      }
      catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
      }
    }
    public Connection getConnection(){
        return this.connection;
    }
}
