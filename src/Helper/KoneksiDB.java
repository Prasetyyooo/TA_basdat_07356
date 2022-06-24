package Helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDB {
    public static Connection dbConnection(){
        Connection conn = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_sewabuku";
        String username = "root";
        String password = "";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
        } catch (Exception e){
            System.out.println(e);
        }

        return conn;
    }
}
