
package Modelo;

public class Usuario {
   private int Id;
   private String NombreUsuario;
   private String Contraseña;
   private String Nombre;
   private String Correo;
   private String Ultima_Sesion;
   private int IdTipo_Usuario;
   private String NombrRol;

    public String getNombrRol() {
        return NombrRol;
    }

    public void setNombrRol(String NombrRol) {
        this.NombrRol = NombrRol;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getUltima_Sesion() {
        return Ultima_Sesion;
    }

    public void setUltima_Sesion(String Ultima_Sesion) {
        this.Ultima_Sesion = Ultima_Sesion;
    }

    public int getIdTipo_Usuario() {
        return IdTipo_Usuario;
    }

    public void setIdTipo_Usuario(int IdTipo_Usuario) {
        this.IdTipo_Usuario = IdTipo_Usuario;
    }
   
}
