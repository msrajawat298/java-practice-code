import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayAllRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/goodyear","root","123");
        Statement smt=cn.createStatement();
        String q="Select * from employees";
        ResultSet rs=smt.executeQuery(q);
        if(rs.next())
        {do {
        System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5));	
        	
        }while(rs.next());
        	
        	
        }
        else
        {System.out.println("Record Not Found");}
		}catch(Exception e)
		{
		System.out.println(e);	
		}
	}

}
