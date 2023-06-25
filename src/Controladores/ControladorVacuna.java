/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.AtributosMedico;
import Modelo.AtributosVacunas;
import Modelo.ConsultasMedicos;
import Modelo.ConsultasVacunas;
import Vista.Opciones;
import Vista.RegistroMedico;
import Vista.RegistroVacunas;
import Vista.Veterinaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author HECTOR
 */
public class ControladorVacuna implements ActionListener{

    
    
    RegistroVacunas Vacuna;
    Opciones Opciones;
    Veterinaria Veterinaria;
    AtributosVacunas AtributosVacunas;
    ConsultasVacunas ConsultasVacunas;

    public ControladorVacuna(RegistroVacunas Vacuna, Opciones Opciones, ConsultasVacunas ConsultasVacunas,AtributosVacunas AtributosVacunas,Veterinaria Veterinaria) {
        this.Vacuna = Vacuna;
        this.Opciones = Opciones;
        this.Veterinaria=Veterinaria;
        this.AtributosVacunas=AtributosVacunas;
        this.ConsultasVacunas = ConsultasVacunas;
        Vacuna.Insertar.addActionListener(this);
        Vacuna.Regresar.addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==Vacuna.Insertar){
        AtributosVacunas.setEnfermedad(Vacuna.Enfermedad.getText());
        AtributosVacunas.setCantidad(Integer.parseInt(Vacuna.Cantidad.getText()));
        AtributosVacunas.setFecha(Date.valueOf(Vacuna.Fecha.getText()));
       
      
        if( ConsultasVacunas.Insertar(AtributosVacunas)){
        JOptionPane.showMessageDialog(null,"Registro Exitoso");
        }
       
       
    }
         if(ae.getSource()==Vacuna.Regresar){
        Vacuna.setVisible(false);
            Veterinaria.add(Opciones);
            Opciones.setVisible(true);
        }
    }
    
    
    
  
}