/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Vista.BuscarCliente;
import Vista.Eliminar;
import Vista.RegistroClientes;
import Vista.Menu;
import Vista.Modificar;
import Vista.Opciones;
import Vista.RegistroEnfermera;
import Vista.RegistroMascotas;
import Vista.RegistroMedico;
import Vista.RegistroSecretaria;
import Vista.RegistroVacunas;
import Vista.Veterinaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author HECTOR
 */
public class ControladorOpciones implements ActionListener {
String Boton="";
    Menu Menu;
    Veterinaria Veterinaria;
    Opciones Opciones;
    RegistroClientes Clientes;
    RegistroEnfermera Enfermera;
    RegistroMedico Medico;
    RegistroMascotas Mascotas;
    RegistroSecretaria Secretaria;
    RegistroVacunas Vacunas;
    BuscarCliente B=new BuscarCliente();
    
    public void BT(String Boton){
    
        this.Boton=Boton;
    
    }
    public ControladorOpciones(Veterinaria Veterinaria, Menu Menu, Opciones Opciones, RegistroClientes Clientes, RegistroEnfermera Enfermera,RegistroMedico Medico,RegistroMascotas Mascotas,RegistroSecretaria Secretaria,RegistroVacunas Vacunas) {

        this.Menu = Menu;
        this.Opciones = Opciones;
        this.Veterinaria = Veterinaria;
        this.Enfermera = Enfermera;
        this.Clientes = Clientes;
        this.Medico = Medico;
        this.Secretaria = Secretaria;
        this.Mascotas = Mascotas;
        this.Vacunas = Vacunas;
        
        Opciones.Enfermera.addActionListener(this);
        Opciones.Mascota.addActionListener(this);
        Opciones.Vacunas.addActionListener(this);
        Opciones.Secretaria.addActionListener(this);
        Opciones.Medico.addActionListener(this);
        Opciones.Cliente.addActionListener(this);
        
        Opciones.Salir.addActionListener(this);
        Opciones.Regresar.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == Opciones.Enfermera) 
        {
            
           
            Opciones.setVisible(false);
            Veterinaria.add(Enfermera);
            Enfermera.setVisible(true);
              
        }
        if (ae.getSource() == Opciones.Mascota) {
            Opciones.setVisible(false);
            Veterinaria.add(Mascotas);
            Mascotas.setVisible(true);
        }
        
         if (ae.getSource() == Opciones.Medico) {
            Opciones.setVisible(false);
            Veterinaria.add(Medico);
            Medico.setVisible(true);
        }
          if (ae.getSource() == Opciones.Secretaria) {
            Opciones.setVisible(false);
            Veterinaria.add(Secretaria);
            Secretaria.setVisible(true);
        }
           if (ae.getSource() == Opciones.Vacunas) {
            Opciones.setVisible(false);
            Veterinaria.add(Vacunas);
            Vacunas.setVisible(true);
        }
        if (ae.getSource() == Opciones.Cliente) {
            
            if(Boton.equals("Insertar")){
            Opciones.setVisible(false);
            Veterinaria.add(Clientes);
            Clientes.setVisible(true);}
            else if(Boton.equals("Buscar")){
            
              Opciones.setVisible(false);
            Veterinaria.add(B);
             B.setVisible(true);
             B.ant(Opciones,Veterinaria);
            }
            else if(Boton.equals("Modificar")){
            Modificar Modificar=new Modificar();
              Opciones.setVisible(false);
            Veterinaria.add(Modificar);
             Modificar.setVisible(true);
             Modificar.ant(Opciones,Veterinaria);
            }
            else  if(Boton.equals("Eliminar")){
            Eliminar Eliminar=new Eliminar();
              Opciones.setVisible(false);
            Veterinaria.add(Eliminar);
             Eliminar.setVisible(true);
             Eliminar.ant(Opciones,Veterinaria);
            }
        }
        
        
        if (ae.getSource() == Opciones.Regresar) {
            Opciones.setVisible(false);
            Veterinaria.add(Menu);
            Menu.setVisible(true);
        }
        if (ae.getSource() == Opciones.Salir) {

            System.exit(0);
        }

    }
}
