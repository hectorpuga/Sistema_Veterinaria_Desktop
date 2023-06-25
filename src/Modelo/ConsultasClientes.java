
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultasClientes extends Conexion{
    
    PreparedStatement ps;
    ResultSet rs;
    public boolean Insertar(AtributosClientes Clientes){
    Connection Conexion=getconnection();
    
    try{
    ps=Conexion.prepareStatement("insert into cliente (Nombre,Apellidos,Direccion,Telefono,Correo_Electronico,Descuento) values(?,?,?,?,?,?)");
    ps.setString(1,Clientes.getNombre());
     ps.setString(2,Clientes.getApellidos());
    ps.setString(3,Clientes.getDireccion());
    ps.setString(4,Clientes.getTelefono());
    ps.setString(5,Clientes.getCorreo_Electronico());
    ps.setDouble(6,Clientes.getDescuento());
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
    
    
     /* public boolean Buscar(cli Persona){
    Connection Conexion=getconnection();
    
    try{
    ps=Conexion.prepareStatement("select * from persona where Clave=?");
 ps.setString(1,Persona.getClave());
 
 rs=ps.executeQuery();
 
 if(rs.next()){
     Persona.setIdPersona(rs.getInt("IdPersona"));
     Persona.setClave(rs.getString("Clave"));
     Persona.setNombre(rs.getString("Nombre"));
     Persona.setDomicilio(rs.getString("Domicilio"));
     Persona.setCelular(rs.getString("Celular"));
     Persona.setCorreo(rs.getString("Correo_Electronico"));
     Persona.setFecha(rs.getDate("Fecha_Nacimiento"));
     Persona.setGenero(rs.getString("Genero"));
     

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
    
    
    
public boolean Modificar(Persona Persona){
    Connection Conexion=getconnection();
    
    try{
    ps=Conexion.prepareStatement("update persona set Clave=?,Nombre=?,Domicilio=?,Celular=?,Correo_Electronico=?,Fecha_Nacimiento=?,Genero=? where IdPersona=?");
    ps.setString(1,Persona.getClave());
    ps.setString(2,Persona.getNombre());
    ps.setString(3,Persona.getDomicilio());
    ps.setString(4,Persona.getCelular());
    ps.setString(5,Persona.getCorreo());
    ps.setDate(6,Persona.getFecha());
    ps.setString(7,Persona.getGenero());
    ps.setInt(8,Persona.getIdPersona());
    
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
    
    public boolean Eliminar(Persona Persona){
    Connection Conexion=getconnection();
    
    try{
    ps=Conexion.prepareStatement("delete from persona where IdPersona=?");
    ps.setInt(1,Persona.getIdPersona());
    
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
    */
    
    
    
    
    
}
