/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vista.Menu;
import Vista.Opciones;
import Vista.Veterinaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HECTOR
 */
public class ControladorMenu implements ActionListener {
    Menu Menu;
    Veterinaria Veterinaria;
    Opciones Opciones;
    ControladorOpciones p;
    public ControladorMenu(Menu Menu, Veterinaria Veterinaria,Opciones Opciones,ControladorOpciones p){
this.Menu=Menu;
this.p=p;
this.Opciones=Opciones;
this.Veterinaria=Veterinaria;
Menu.Insertar.addActionListener(this);
Menu.Buscar.addActionListener(this);
Menu.Insertar.addActionListener(this);
Menu.Modificar.addActionListener(this);
Menu.Eliminar.addActionListener(this);
Menu.Salir.addActionListener(this);
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==Menu.Insertar){
        
          Menu.setVisible(false);
          Veterinaria.add(Opciones);
          Opciones.setVisible(true);   
          p.BT("Insertar");
    }
          if(ae.getSource()==Menu.Buscar){
        
          Menu.setVisible(false);
          Veterinaria.add(Opciones);
          Opciones.setVisible(true);
          p.BT("Buscar");
          
    }
              if(ae.getSource()==Menu.Modificar){
        
          Menu.setVisible(false);
          Veterinaria.add(Opciones);
          Opciones.setVisible(true);    
           p.BT("Modificar");
    }
                  if(ae.getSource()==Menu.Eliminar){
        
          Menu.setVisible(false);
          Veterinaria.add(Opciones);
          Opciones.setVisible(true);  
           p.BT("Eliminar");
    }
                      if(ae.getSource()==Menu.Salir){
        
         System.exit(0);
    }
    
    }
}
