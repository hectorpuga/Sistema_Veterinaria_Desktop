
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static final String URL="jdbc:mysql://localhost:3306/veterinaria2?serverTimezone=UTC&autoReconnect=true&useSSL=false";
    public static final String User="root";
    public static final String pass="hectorale";

    
     public Connection getconnection(){
    Connection conexion=null;
    
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    conexion=DriverManager.getConnection(URL,User,pass);
    
    }catch(Exception e){
        System.out.println("Error: "+e);
    
    }
    return conexion;
    }
}
