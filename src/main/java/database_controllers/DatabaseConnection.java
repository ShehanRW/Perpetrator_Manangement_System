package database_controllers;

import DataObjects.Admins;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;


/* This class creates the database connection and let the access
to the database called perpetratordb and control the access using
methods with the database
*/

public class DatabaseConnection {
    
    private static DatabaseConnection dbInstance;
    
    private Connection connection;

    private String url = "jdbc:mysql://localhost:3306/perpetratordb";
    private String user = "root";
    private String password = "";
    
    private String username = null;
    
    // access blocked constructor to make sure without instancing multiple times    
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
    
    // calling for connection method
    public static DatabaseConnection getDbConnection(){
        if(dbInstance == null){
            dbInstance = new DatabaseConnection();
        }
        return dbInstance;
    }
    
    // method for access to make login
    public String getLoginDetails(String username){
        String adminPassword = "";
        String query = "SELECT userName, adminPassword FROM admins WHERE userName = ?";
        
        try(PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                adminPassword = resultSet.getString("adminPassword");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            showMessageDialog(null, "Access denied..!");
        }
        
        return adminPassword;
        
    }
    
    // method to access admin details
    public Admins getAdminDetails(){
        
        String query = "SELECT * FROM admins WHERE userName = ?";
        Admins admins = new Admins();
        
        try(PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                String adUsername = username;
                String adminName = resultSet.getString("adminName");
                String adminType = resultSet.getString("adminType");
                String position = resultSet.getString("position");

                admins = new Admins(username, adminName, position, adminType);
                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return admins;
    }
    
    // method for add the admin
    public void addNewAdmin(String username, String adminName, String position, String adminType, String password){
        String query = "INSERT INTO admins (userName, adminPassword, adminName, position, adminType)" + "VALUES(?, ?, ?, ?, ?)";
        Admins admins = new Admins();
        
        try(PreparedStatement preparedStmt = connection.prepareStatement(query);){
        
            preparedStmt.setString(1, username);
            preparedStmt.setString(2, password);
            preparedStmt.setString(3, adminName);
            preparedStmt.setString(4, position);
            preparedStmt.setString(5, adminType);
            
            preparedStmt.execute();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    } 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
}
