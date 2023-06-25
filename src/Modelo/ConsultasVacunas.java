/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HECTOR
 */
public class ConsultasVacunas extends Conexion{
    
    PreparedStatement ps;
    ResultSet rs;
    public boolean Insertar(AtributosVacunas Vacuna){
    Connection Conexion=getconnection();
    
    try{
    ps=Conexion.prepareStatement("insert into vacunas (Enfermedad,Cantidad,Fecha_Proxima) values(?,?,?)");
    ps.setString(1,Vacuna.getEnfermedad());
     ps.setInt(2,Vacuna.getCantidad());
    ps.setDate(3,Vacuna.getFecha());
    int Resultado=ps.executeUpdate();
    
    if(Resultado>0){
    return true;
    }
    else{
    
    return false;
    }
    
    }catch(Exception e){
        System.out.println("Error: "+e);
        return false;
    }
    finally{
    
    try{
    Conexion.close();
    }catch(Exception e){
        System.out.println("Error: "+e);
    }
    }
    
    
    }
    
}
