/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class AtributosSecretaria {
    private int IdSecretaria;
private String Nombre;
private String Apellidos;
private String Direccion;
private String Telefono; 
private String Correo_Electronico;
private String Turno;
private double Sueldo;
private String AreaAdministrada;

    public int getIdSecretaria() {
        return IdSecretaria;
    }

    public void setIdSecretaria(int IdSecretaria) {
        this.IdSecretaria = IdSecretaria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getAreaAdministrada() {
        return AreaAdministrada;
    }

    public void setAreaAdministrada(String AreaAdministrada) {
        this.AreaAdministrada = AreaAdministrada;
    }


}
