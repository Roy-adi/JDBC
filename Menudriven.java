import java.sql.Connection ;
import java.sql . PreparedStatement ;
import java.sql . ResultSet ;
import java.sql.SQLException ;
import java.sql.Statement ;
import java.util.Scanner ;
public class Menudriven {
Scanner s = new Scanner ( System.in ) ;
int Id , Age , Salary ;
String Name , City ;
// saving employee details in database
public void saveMenudriven ( ) throws SQLException {
System.out.println("enter the employee id");                        
Id = s.nextInt ( ) ;
System.out.println ( " Enter Employee Name : " ) ;
System.out.println ( " Enter Employee Age : " ) ;
System.out.println ( " Enter Employee City : " ) ;
System.out.println ( " Enter Employee Salary : " ) ;
Salary s.nextInt ( ) ;
Connection conn = Helper.con ( ) ;
PreparedStatement s1 = conn.prepareStatement ( " insert into Menudriven values ( ? , ? , ? , ? , ? ) " ) ;
Names.next ( ) ;
Ages.nextInt ( ) ;
City = s.next ( ) ;
sl.setInt ( 1 , Id ) ;
sl.setString ( 2 , Name ) ;
sl.setInt ( 3 , Age ) ;
sl.setString ( 4 , City ) ;
sl.setInt ( 5 , Salary ) ;
sl.executeUpdate ( ) ;
}
// fetching employee details in database ( display )
public void fetchMenudriven ( ) throws SQLException {
Connection conn = Helper.con ( ) ;
Statement st = conn.createStatement ( ) ;
ResultSet rs = st.executeQuery ( " select * from Menudriven " ) ;
while ( rs.next ( ) ) {
System.out.println ( rs.getInt ( 1 ) + " " + rs.getString ( 2 ) + " " + rs.getInt ( 3 ) + " " + rs.getString ( 4 ) + ""+rs.getInt(5);
}
}
// updating employee details in database
public void updateMenudriven ( ) throws SQLException {
	Connection conn = Helper.con ( ) ;
	Statement st = conn.createStatement ( ) ;
	System.out.println ( " Enter Employee City : " ) ;
	Citys.nextLine ( ) ;
	st.executeUpdate ( " update Menudriven set City" + City + " ¹ + where Id = " + Id ) ;
	// deleting employee details in database
	public void deleteMenudriven ( ) throws SQLException {
	Connection conn = Helper.con ( ) ;
	Statement st = conn.createStatement ( ) ;
	System.out.println ( " Enter employee Id : " ) ;
	Id = s.nextInt ( ) ;
	st.executeUpdate ( " Delete from Menudriven where Id = " + Id ) ;
	}
	}
}
