import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class DbCon1 
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.err.println("Driver is loaded");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb1?user=root&password=Chinnu@91");
        System.err.println("connection established");
        con.createStatement();
        Statement smt=con.createStatement();
        smt.execute("create table emp1(empno int primary key,ename varchar(20))");
        System.err.println("emp table is created");






    }
}
