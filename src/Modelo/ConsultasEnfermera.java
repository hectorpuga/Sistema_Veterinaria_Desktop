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
public class ConsultasEnfermera extends Conexion{
    
    PreparedStatement ps;
    ResultSet rs;
    public boolean Insertar(AtributosEnfermera Enfermera){
    Connection Conexion=getconnection();
    
    try{
    ps=Conexion.prepareStatement("insert into enfermera (Nombre,Apellidos,Direccion,Telefono,Correo_Electronico,Turno,Sueldo,NCedula_Enfermeria) values(?,?,?,?,?,?,?,?)");
    ps.setString(1,Enfermera.getNombre());
     ps.setString(2,Enfermera.getApellidos());
    ps.setString(3,Enfermera.getDireccion());
    ps.setString(4,Enfermera.getTelefono());
    ps.setString(5,Enfermera.getCorreo_Electronico());
    ps.setString(6,Enfermera.getTurno());
    ps.setDouble(7,Enfermera.getSueldo());
    ps.setString(8, Enfermera.getCedula());
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
