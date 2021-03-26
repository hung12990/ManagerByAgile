/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managebyagile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.net.*;
public class CreatConnection {
    public static Connection getMyConnection() throws  Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection=DriverManager.getConnection("jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=agile","sa","123456");
        return connection;
    }
}
