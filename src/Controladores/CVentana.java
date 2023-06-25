/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vista.Veterinaria;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HECTOR
 */
public class CVentana implements ActionListener{

    private Veterinaria Veterinaria;
    public CVentana (Veterinaria Veterinaria){
    
    this.Veterinaria=Veterinaria;
    Veterinaria.Cerrar.addActionListener(this);
    Veterinaria.Minimizar.addActionListener(this);
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==Veterinaria.Cerrar){
    System.exit(0);
    }
    if(ae.getSource()==Veterinaria.Minimizar){
    Veterinaria.setExtendedState(ICONIFIED);
    }
    
    }
    
}
