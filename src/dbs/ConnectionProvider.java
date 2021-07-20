package dbs;

import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/hospitaldbs?useUnicode=true&characterEncoding=UTF-8", "root", "root");
            return con;
        }catch(Exception e){
            return null;
        }
    }
}    
