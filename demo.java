


















package testing;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;
public class Test {
	
	
	
	
	public   void save2(Request req) {
		String ip = req.getParameter("ip");
        try  {
        	String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + ip + "','"+blop+"')";
        	getJDBCConnection().createStatement().execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
       System.out.print("sdfdsf");
    }
	
	
	
	
	
	
	
	Connection getJDBCConnection() {
		return null;
	}
}