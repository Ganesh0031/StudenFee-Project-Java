import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class demo1 {
    demo1(){
        Connection c;
        Statement s;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql://localhost/college","root","");
            s=c.createStatement();
            System.out.println("connection.ok!");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new demo1();
    }
}
