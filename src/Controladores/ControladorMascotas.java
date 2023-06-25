/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.AtributosMascotas;
import Modelo.AtributosSecretaria;
import Modelo.ConsultasMascotas;
import Modelo.ConsultasSecretaria;
import Vista.Opciones;
import Vista.RegistroMascotas;
import Vista.RegistroSecretaria;
import Vista.Veterinaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author HECTOR
 */
public class ControladorMascotas implements ActionListener{

    
    
    RegistroMascotas Mascotas;
    Opciones Opciones;
    Veterinaria Veterinaria;
    AtributosMascotas AtributosMascotas;
    ConsultasMascotas ConsultasMascotas;

    public ControladorMascotas(RegistroMascotas Mascotas, Opciones Opciones, ConsultasMascotas ConsultasMascotas,AtributosMascotas AtributosMascotas,Veterinaria Veterinaria) {
        this.Mascotas = Mascotas;
        this.Opciones = Opciones;
        this.Veterinaria=Veterinaria;
        this.AtributosMascotas=AtributosMascotas;
        this.ConsultasMascotas = ConsultasMascotas;
        Mascotas.Insertar.addActionListener(this);
        Mascotas.Regresar.addActionListener(this);
      
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==Mascotas.Insertar){
        AtributosMascotas.setNombre(Mascotas.Nombre.getText());
        AtributosMascotas.setEnfermedad(Mascotas.Enfermedad.getText());
        AtributosMascotas.setRaza(Mascotas.Raza.getText());
        AtributosMascotas.setColor(Mascotas.Color.getText());
        AtributosMascotas.setPeso(Double.valueOf(Mascotas.Peso.getText()));
        AtributosMascotas.setEstatura(Double.valueOf(Mascotas.Estatura.getText()));
        
        if( ConsultasMascotas.Insertar(AtributosMascotas)){
        JOptionPane.showMessageDialog(null,"Registro Exitoso");
        }
       
       
    }
         if(ae.getSource()==Mascotas.Regresar){
        Mascotas.setVisible(false);
            Veterinaria.add(Opciones);
            Opciones.setVisible(true);
        }
    
}}
