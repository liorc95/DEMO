package sqlI;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class SQLITest1 {
    public void main(String ip) {
        try {
            Statement statement = getJDBCConnection().createStatement();
            String uuid = UUID.randomUUID().toString();
            String sql = "INSERT INTO banned_ip(id, ip) VALUE('" + uuid + "','" + ip + "')";
            statement.execute(sql);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }


   
    Connection getJDBCConnection() {
        return null;
    }
}
