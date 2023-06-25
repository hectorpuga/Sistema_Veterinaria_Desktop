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
public class ConsultasMedicos extends Conexion{
    
    PreparedStatement ps;
    ResultSet rs;
    public boolean Insertar(AtributosMedico Medico){
    Connection Conexion=getconnection();
    
    try{
    ps=Conexion.prepareStatement("insert into medico (Nombre,Apellidos,Direccion,Telefono,Correo_Electronico,Turno,Sueldo,NCedula_Medica) values(?,?,?,?,?,?,?,?)");
    ps.setString(1,Medico.getNombre());
     ps.setString(2,Medico.getApellidos());
    ps.setString(3,Medico.getDireccion());
    ps.setString(4,Medico.getTelefono());
    ps.setString(5,Medico.getCorreo_Electronico());
    ps.setString(6,Medico.getTurno());
    ps.setDouble(7,Medico.getSueldo());
    ps.setString(8, Medico.getCedula());
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
