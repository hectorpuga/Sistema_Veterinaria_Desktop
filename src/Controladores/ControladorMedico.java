/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.AtributosEnfermera;
import Modelo.AtributosMedico;
import Modelo.ConsultasEnfermera;
import Modelo.ConsultasMedicos;
import Vista.Opciones;
import Vista.RegistroEnfermera;
import Vista.RegistroMedico;
import Vista.Veterinaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author HECTOR
 */
public class ControladorMedico implements ActionListener{

    
    
    RegistroMedico Medico;
    Opciones Opciones;
    Veterinaria Veterinaria;
    AtributosMedico AtributosMedico;
    ConsultasMedicos ConsultasMedicos;

    public ControladorMedico(RegistroMedico Medico, Opciones Opciones, ConsultasMedicos ConsultasMedicos,AtributosMedico AtributosMedicos,Veterinaria Veterinaria) {
        this.Medico = Medico;
        this.Opciones = Opciones;
        this.Veterinaria=Veterinaria;
        this.AtributosMedico=AtributosMedicos;
        this.ConsultasMedicos = ConsultasMedicos;
        Medico.Insertar.addActionListener(this);
        Medico.Regresar.addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==Medico.Insertar){
        AtributosMedico.setNombre(Medico.Nombre.getText());
        AtributosMedico.setApellidos(Medico.Apellidos.getText());
        AtributosMedico.setDireccion(Medico.Direccion.getText());
        AtributosMedico.setCorreo_Electronico(Medico.Correo.getText());
        AtributosMedico.setTelefono(Medico.Telefono.getText());
        AtributosMedico.setTurno(Medico.Turno.getText());
        AtributosMedico.setSueldo(Double.parseDouble(Medico.Salario.getText()));
        AtributosMedico.setCedula(Medico.Cedula.getText());
        if( ConsultasMedicos.Insertar(AtributosMedico)){
        JOptionPane.showMessageDialog(null,"Registro Exitoso");
        }
       
       
    }
         if(ae.getSource()==Medico.Regresar){
        Medico.setVisible(false);
            Veterinaria.add(Opciones);
            Opciones.setVisible(true);
        }
    }
    
    
}
