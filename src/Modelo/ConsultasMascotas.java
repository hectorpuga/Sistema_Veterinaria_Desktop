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
public class ConsultasMascotas extends Conexion{
    
    PreparedStatement ps;
    ResultSet rs;
    public boolean Insertar(AtributosMascotas Mascotas){
    Connection Conexion=getconnection();
    
    try{
    ps=Conexion.prepareStatement("insert into mascotas (Nombre,Enfermedad,Raza,Color,Peso,Estatura) values(?,?,?,?,?,?)");
    ps.setString(1,Mascotas.getNombre());
     ps.setString(2,Mascotas.getEnfermedad());
    ps.setString(3,Mascotas.getRaza());
    ps.setString(4,Mascotas.getColor());
    ps.setDouble(5,Mascotas.getPeso());
    ps.setDouble(6,Mascotas.getEstatura());

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
