package sqlI;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLITest2 {
    public void main(int x,String d,String y) {
        try {
            int u=x+1;
            System.out.println( d+"blabla");
            String id = getid(y);
            String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + UUID.randomUUID().toString() + "','" + id + "')";
            Statement statement = getJDBCConnection().createStatement();
            statement.execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        System.out.print("sdfdsf");
    }

    public String getid(String x){
        String id = x;
        return id;
    }

    Connection getJDBCConnection() {
        return null;
    }
}
