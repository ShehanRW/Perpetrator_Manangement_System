package database_controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    
    private static DatabaseConnection dbInstance;

    private String url = "jdbc:mysql://localhost:3306/perpetratordb";
    private String user = "root";
    private String password = "";
    
    private DatabaseConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connetction = DriverManager.getConnection(url, user, password);
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
    
    public void getAllData(){
        
    }
    
}
