/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import Modelo.AtributosEnfermera;
import Modelo.ConsultasClientes;
import Modelo.ConsultasEnfermera;
import Vista.Opciones;
import Vista.RegistroEnfermera;
import Vista.Veterinaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorEnfermera implements ActionListener{

    
    
    RegistroEnfermera Enfermera;
    Opciones Opciones;
    Veterinaria Veterinaria;
    AtributosEnfermera AtributosEnfermera;
    ConsultasEnfermera ConsultasEnfermera;

    public ControladorEnfermera(RegistroEnfermera Enfermera, Opciones Opciones, ConsultasEnfermera ConsultasEnfermera,AtributosEnfermera AtributosEnfermera,Veterinaria Veterinaria) {
        this.Enfermera = Enfermera;
        this.Opciones = Opciones;
        this.Veterinaria=Veterinaria;
        this.AtributosEnfermera=AtributosEnfermera;
        this.ConsultasEnfermera = ConsultasEnfermera;
        Enfermera.Insertar.addActionListener(this);
        Enfermera.Regresar.addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==Enfermera.Insertar){
        AtributosEnfermera.setNombre(Enfermera.Nombre.getText());
        AtributosEnfermera.setApellidos(Enfermera.Apellidos.getText());
        AtributosEnfermera.setDireccion(Enfermera.Direccion.getText());
        AtributosEnfermera.setCorreo_Electronico(Enfermera.Correo.getText());
        AtributosEnfermera.setTelefono(Enfermera.Telefono.getText());
        AtributosEnfermera.setTurno(Enfermera.Turno.getText());
        AtributosEnfermera.setSueldo(Double.parseDouble(Enfermera.Salario.getText()));
        AtributosEnfermera.setCedula(Enfermera.Cedula.getText());
        if( ConsultasEnfermera.Insertar(AtributosEnfermera)){
        JOptionPane.showMessageDialog(null,"Registro Exitoso");
        }
       
       
    }
         if(ae.getSource()==Enfermera.Regresar){
        Enfermera.setVisible(false);
            Veterinaria.add(Opciones);
            Opciones.setVisible(true);
        }
    }
    
    
}
