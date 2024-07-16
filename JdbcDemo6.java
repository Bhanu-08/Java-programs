import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class DAO
{
    Connection con;//connection is an interface,con is an instance variable
    DAO() throws Exception,SQLException//we are throwing unreported exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");//Class is a pre-defined class existed in java.lang package
        System.err.println("driver loaded");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb1","root","Chinnu@91");//sql exception for wrong url
        //get connection is a static method in drivermanager class
        //DriverManager class available in java.sql package
        //getConnection method returns connection object and assignment operator 
    }
    void insert() throws SQLException,Exception
    {
        //Statement smt=con.createStatement();
        //int r=smt.executeUpdate("insert into emp1 values("+empno+",'"+ename+"')");
        //System.out.println("inserted "+r);
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter empno:\t");
        int empno=scan.nextInt();
        System.out.println("Enter ename:\t");
        String ename=scan.next();
        String cmd="insert into emp1 values("+empno+",'"+ename+"')";
        System.out.println(cmd);
        Statement smt=con.createStatement();
        int r=smt.executeUpdate(cmd);
        System.out.println(r+" rows inserted.. ");
    }
    void updateName(int empno,String ename) throws SQLException
    {
        String cmd="update emp1 set ename=? where empno=?";
        PreparedStatement psmt=con.prepareStatement(cmd);
        psmt.setString(1,ename);
        psmt.setInt(2,empno);
        int r=psmt.executeUpdate();
        System.err.println("name updated"+r);
    }
    void delete(int empno)throws Exception,SQLException
    {
        String cmd="delete from emp1 where empno=?";
        PreparedStatement psmt1=con.prepareStatement(cmd);
        psmt1.setInt(1,empno);
        int r=psmt1.executeUpdate();
        System.err.println("Row deleted");
    }
    void display()throws Exception,SQLException
    {
        String cmd="select * from emp1";
        Statement smt=con.createStatement();
        ResultSet rs=smt.executeQuery(cmd);
        while(rs.next())
        {
                System.out.printf("%-5d %-30s %n",rs.getInt("empno"),rs.getString("ename"));
        }
            //getResultSet(); returns the available ResultSet object
    }
}
public class JdbcDemo6 
{
    public static void main(String[] args) throws Exception,SQLException
    {
        DAO dao=new DAO();
        //dao.insert(9,"raja");
        //dao=1002;
        //dao has connection object;
        //dao.updateName(2,"Narendrak");
        //dao.delete(100);
        //dao.display();
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter your option:");
        do 
        {
            System.err.println("1.insert");
            System.err.println("2.update");
            System.err.println("3.delete");
            System.err.println("4.display");
            int opt=sc.nextInt();
            switch (opt) {
                case 1:
                        dao.insert();
                        break;
                case 2:
                        dao.updateName(7, "Dhoni");    
                        break;
                case 3:
                        dao.delete(10);
                        break;
                case 4:
                        dao.display();
                        break;
                default:
                        System.err.println("invalid input");
                        break;
            }
            System.err.println("Do you want to continue(1/0):");
            int r=sc.nextInt();
            if(r==0)
                break;
        } 
        while (true);
        System.err.println("completed");
    }
}
