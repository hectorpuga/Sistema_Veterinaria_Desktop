
package Controladores;

import Modelo.AtributosClientes;
import Modelo.ConsultasClientes;
import Vista.Opciones;
import Vista.RegistroClientes;
import Vista.Veterinaria;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;



public class ControladorClientes implements ActionListener {

    RegistroClientes Clientes;
    Opciones Opciones;
    Veterinaria Veterinaria;
    AtributosClientes AtributosClientes;
    ConsultasClientes ConsultasClientes;

    public ControladorClientes(RegistroClientes Clientes, Opciones Opciones, ConsultasClientes ConsultasClientes,AtributosClientes AtributosClientes,Veterinaria Veterinaria) {
        this.Clientes = Clientes;
        this.Opciones = Opciones;
        this.Veterinaria=Veterinaria;
        this.AtributosClientes=AtributosClientes;
        this.ConsultasClientes = ConsultasClientes;
        Clientes.Insertar.addActionListener(this);
        Clientes.Regresar.addActionListener(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==Clientes.Insertar){
        AtributosClientes.setNombre(Clientes.Nombre.getText());
        AtributosClientes.setApellidos(Clientes.Apellidos.getText());
        AtributosClientes.setDireccion(Clientes.Direccion.getText());
        AtributosClientes.setCorreo_Electronico(Clientes.Correo.getText());
        AtributosClientes.setTelefono(Clientes.Telefono.getText());
        AtributosClientes.setDescuento(Double.parseDouble(Clientes.Descuento.getText()));
        if( ConsultasClientes.Insertar(AtributosClientes)){
        JOptionPane.showMessageDialog(null,"Registro Exitoso");
        }
       
       
    }
         if(ae.getSource()==Clientes.Regresar){
        Clientes.setVisible(false);
            Veterinaria.add(Opciones);
            Opciones.setVisible(true);
        }
    }
}
