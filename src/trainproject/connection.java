
package trainproject;
import java.sql.*;

public class connection {
     static final String user="root";
     static final String pass="";
     static final String uri="jdbc:mysql://localhost/trainproject";
     
    public static Connection connect()
    {
        Connection con=null;
     try{
     con=DriverManager.getConnection(uri,user,pass);
      return con;   
     }
     catch(Exception ex){System.out.println(ex.getMessage());  
     return null;}
   
    }

}
