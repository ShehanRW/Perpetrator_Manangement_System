package database_controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    
    private static DatabaseConnection dbInstance;
    
    Connection connection;

    private String url = "jdbc:mysql://localhost:3306/perpetratordb";
    private String user = "root";
    private String password = "";
    
    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected...!");
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DatabaseConnection getDbConnection(){
        if(dbInstance == null){
            dbInstance = new DatabaseConnection();
        }
        return dbInstance;
    }
    
    public String getLoginDetails(String query){
        String username = null;
        String password = null;
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                username = resultSet.getString("userName");
                password = resultSet.getString("adminPassword");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return username+password;
        
    }
    
}
