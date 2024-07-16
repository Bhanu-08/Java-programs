import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class Insert
{
	public static void main(String args[]) throws Exception
	{
        	Class.forName("com.mysql.cj.jdbc.Driver");
		System.err.println("Driver is loaded");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gecdb1","root","Chinnu@91");
		System.out.println("Connection is established");
		Statement smt=con.createStatement();
		boolean flag=smt.execute("insert into emp1 values(2,'Nari')");
		System.err.println("Insertion successful"+flag);
	}
}
