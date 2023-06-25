/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.AtributosEnfermera;
import Modelo.AtributosSecretaria;
import Modelo.ConsultasEnfermera;
import Modelo.ConsultasSecretaria;
import Vista.Opciones;
import Vista.RegistroEnfermera;
import Vista.RegistroSecretaria;
import Vista.Veterinaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author HECTOR
 */
public class ControladorSecretaria implements ActionListener{

    
    
    RegistroSecretaria Secretaria;
    Opciones Opciones;
    Veterinaria Veterinaria;
    AtributosSecretaria AtributosSecretaria;
    ConsultasSecretaria ConsultasSecretaria;

    public ControladorSecretaria(RegistroSecretaria Secretaria, Opciones Opciones, ConsultasSecretaria ConsultasSecretaria,AtributosSecretaria AtributosSecretaria,Veterinaria Veterinaria) {
        this.Secretaria = Secretaria;
        this.Opciones = Opciones;
        this.Veterinaria=Veterinaria;
        this.AtributosSecretaria=AtributosSecretaria;
        this.ConsultasSecretaria = ConsultasSecretaria;
        Secretaria.Insertar.addActionListener(this);
        Secretaria.Regresar.addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==Secretaria.Insertar){
        AtributosSecretaria.setNombre(Secretaria.Nombre.getText());
        AtributosSecretaria.setApellidos(Secretaria.Apellidos.getText());
        AtributosSecretaria.setDireccion(Secretaria.Direccion.getText());
        AtributosSecretaria.setCorreo_Electronico(Secretaria.Correo.getText());
        AtributosSecretaria.setTelefono(Secretaria.Telefono.getText());
        AtributosSecretaria.setTurno(Secretaria.Turno.getText());
        AtributosSecretaria.setSueldo(Double.parseDouble(Secretaria.Salario.getText()));
        AtributosSecretaria.setAreaAdministrada(Secretaria.Area.getText());
        if( ConsultasSecretaria.Insertar(AtributosSecretaria)){
        JOptionPane.showMessageDialog(null,"Registro Exitoso");
        }
       
       
    }
         if(ae.getSource()==Secretaria.Regresar){
        Secretaria.setVisible(false);
            Veterinaria.add(Opciones);
            Opciones.setVisible(true);
        }
    }
    
}
