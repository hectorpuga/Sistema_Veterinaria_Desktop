
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLUsuario {
  
    public boolean Registrar(Usuario Usuario){
    Conexion Con=new Conexion();
    PreparedStatement ps=null;
    try{
    Connection Conexion=Con.getconnection();
    ps=Conexion.prepareStatement("Insert into Usuarios (NombreUsuario,Contraseña,Nombre,Correo,IdTipo_Usuario)values(?,?,?,?,?)");
    ps.setString(1,Usuario.getNombreUsuario());
    ps.setString(2, Usuario.getContraseña());
    ps.setString(3, Usuario.getNombre());
    ps.setString(4, Usuario.getCorreo());
    ps.setInt(5,Usuario.getIdTipo_Usuario());
    ps.executeUpdate();
    return true;
    }catch(Exception e){
        System.out.println("Error: "+e);
    return false;
    }
    }
    
    public int Verificar(String Usuario){
    Conexion Con=new Conexion();
    PreparedStatement ps=null;
    ResultSet rs=null;
    try{
    Connection Conexion=Con.getconnection();
    ps=Conexion.prepareStatement("select count(id) from Usuarios where NombreUsuario=?");
    ps.setString(1,Usuario);
  rs=ps.executeQuery();
    if(rs.next()){
    
    return rs.getInt(1);
    }
    return 1;
    }catch(Exception e){
        System.out.println("Error: "+e);
    return 1;
    }
    
    
}

public boolean ComprobarEmail(String Email){
    Pattern Patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		         + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    
    Matcher matcher=Patron.matcher(Email);
    return matcher.find();
    
}

  public boolean IniciarSesion(Usuario Usuario){
    Conexion Con=new Conexion();
    PreparedStatement ps=null;
    ResultSet rs=null;
    try{
    Connection Conexion=Con.getconnection();
    
    ps=Conexion.prepareStatement("select U.id,U.NombreUsuario,U.Contraseña,U.Nombre,U.IdTipo_Usuario,T.Nombre from Usuarios as U inner join Tipo_Usuario as T on U.IdTipo_Usuario= T.id where NombreUsuario=?");
    ps.setString(1,Usuario.getNombreUsuario());
  rs=ps.executeQuery();
  

  
    if(rs.next()){
    
    if(Usuario.getContraseña().equals(rs.getString("Contraseña"))){
        
        ps=Conexion.prepareStatement("update usuarios set Ultima_Sesion=? where Id=?");
        ps.setString(1,Usuario.getUltima_Sesion());
        ps.setInt(2,rs.getInt("Id"));
        ps.executeUpdate();
    Usuario.setId(rs.getInt("U.Id"));
    Usuario.setNombre(rs.getString("U.Nombre"));
    Usuario.setIdTipo_Usuario(rs.getInt("U.IdTipo_Usuario"));
    Usuario.setNombrRol(rs.getString("T.Nombre"));
    
    return true;
    }
    else{
    return false;
    }
    }
    else{
    return false;
    }

    }catch(Exception e){
        System.out.println("Error: "+e);
    return false;
    }
    
    
}
}