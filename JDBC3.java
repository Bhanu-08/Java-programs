
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC3 
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.err.println("Driver is loaded");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb1","root","Chinnu@91");
        System.err.println("connection established");
        Statement smt=con.createStatement();
        boolean b=smt.execute("select * from emp1;");
        if(b)
        {
            ResultSet rs=smt.getResultSet();
        }
        System.err.println("Insertion successful...."+b);
    }
    
}
