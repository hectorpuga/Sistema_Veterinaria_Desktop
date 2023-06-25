/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.CifrarContraseña;
import Modelo.SQLUsuario;
import Modelo.Usuario;
import Vista.Menu;
import Vista.Veterinaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author HECTOR
 */
public class CIniciarSesion implements ActionListener {

    Usuario Usuarios;
    SQLUsuario SQLUsuario;
    Veterinaria Veterinaria;
    Menu Menu;
    public CIniciarSesion(Veterinaria Veterinaria,Usuario Usuario,SQLUsuario SQLUsuario,Menu Menu){
    this.Veterinaria=Veterinaria;
    this.Usuarios=Usuario;
    this.SQLUsuario=SQLUsuario;
    this.Menu=Menu;
    
    Veterinaria.Registrar.addActionListener(this);
    Veterinaria.Iniciar.addActionListener(this);
            
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

         if(ae.getSource()==Veterinaria.Iniciar){
     SQLUsuario SQLUsuario=new SQLUsuario();
     Date date=new Date();
     DateFormat FechaHora=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     String Contraseña=new String(Veterinaria.Contraseña.getPassword());
     
     if(Veterinaria.Usuario.getText().equals("") || Veterinaria.Contraseña.equals("")){
     JOptionPane.showMessageDialog(Veterinaria,"Por Favor Rellene Todos Los Campos");
     }
     else{
     String NuevaContraseña=CifrarContraseña.md5(Contraseña);
     Usuarios.setNombreUsuario(Veterinaria.Usuario.getText());
     Usuarios.setContraseña(NuevaContraseña);
     Usuarios.setUltima_Sesion(FechaHora.format(date));
     
     if(SQLUsuario.IniciarSesion(Usuarios)){
    
     Veterinaria.jPanel1.setVisible(false);
     Veterinaria.add(Menu);
     Menu.setVisible(true);
    
     // Inicio.Iniciar=null;
     //this.dispose();
     //Programa Programa=new Programa(Usuario);
     //Programa.setVisible(true);
     }
     else{
     JOptionPane.showMessageDialog(null,"Datos Incorrectos");
     
     }
     }}
    }
    
}
