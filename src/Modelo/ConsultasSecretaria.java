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
public class ConsultasSecretaria extends Conexion{
    
    PreparedStatement ps;
    ResultSet rs;
    public boolean Insertar(AtributosSecretaria Secreataria){
    Connection Conexion=getconnection();
    
    try{
    ps=Conexion.prepareStatement("insert into secretaria (Nombre,Apellidos,Direccion,Telefono,Correo_Electronico,Turno,Sueldo,Area_Administrada) values(?,?,?,?,?,?,?,?)");
    ps.setString(1,Secreataria.getNombre());
     ps.setString(2,Secreataria.getApellidos());
    ps.setString(3,Secreataria.getDireccion());
    ps.setString(4,Secreataria.getTelefono());
    ps.setString(5,Secreataria.getCorreo_Electronico());
    ps.setString(6,Secreataria.getTurno());
    ps.setDouble(7,Secreataria.getSueldo());
    ps.setString(8, Secreataria.getAreaAdministrada());
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
