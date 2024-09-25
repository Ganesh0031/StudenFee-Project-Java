
import java.sql.*;

public class Conne{
    Connection c;
    Statement s;
    public Conne(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost/mca","root","");
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}  