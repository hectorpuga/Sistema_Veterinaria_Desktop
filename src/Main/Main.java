/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controladores.CIniciarSesion;
import Controladores.CVentana;
import Controladores.ControladorClientes;
import Controladores.ControladorEnfermera;
import Controladores.ControladorMascotas;
import Controladores.ControladorMedico;
import Controladores.ControladorMenu;
import Controladores.ControladorOpciones;
import Controladores.ControladorSecretaria;
import Controladores.ControladorVacuna;
import Modelo.AtributosClientes;
import Modelo.AtributosEnfermera;
import Modelo.AtributosMascotas;
import Modelo.AtributosMedico;
import Modelo.AtributosSecretaria;
import Modelo.AtributosVacunas;
import Modelo.ConsultasClientes;
import Modelo.ConsultasEnfermera;
import Modelo.ConsultasMascotas;
import Modelo.ConsultasMedicos;
import Modelo.ConsultasSecretaria;
import Modelo.ConsultasVacunas;
import Modelo.SQLUsuario;
import Modelo.Usuario;
import Vista.RegistroClientes;
import Vista.Menu;
import Vista.Opciones;
import Vista.RegistroEnfermera;
import Vista.RegistroMascotas;
import Vista.RegistroMedico;
import Vista.RegistroSecretaria;
import Vista.RegistroVacunas;
import Vista.Veterinaria;

public class Main {
    public static void main(String[] args) {
       Veterinaria Veterinaria=new Veterinaria();
      
       Veterinaria.setVisible(true);
       CVentana Ventana=new CVentana(Veterinaria);
       SQLUsuario SQLUsuario=new SQLUsuario();
       Usuario Usuario=new Usuario();
       Menu Menu=new Menu();
       Opciones Opciones=new Opciones();
       CIniciarSesion Iniciar=new CIniciarSesion(Veterinaria,Usuario,SQLUsuario,Menu);
     
      
        RegistroClientes Clientes=new RegistroClientes();
        RegistroEnfermera Enfermera=new RegistroEnfermera();
        RegistroMedico Medico=new RegistroMedico();
        RegistroMascotas Mascotas=new RegistroMascotas();
        RegistroSecretaria Secretaria=new RegistroSecretaria();
        RegistroVacunas Vacunas=new RegistroVacunas();
        ControladorOpciones C_Opciones=new ControladorOpciones(Veterinaria,Menu,Opciones,Clientes,Enfermera,Medico,Mascotas,Secretaria,Vacunas);
      
        ControladorMenu C_Menu=new ControladorMenu(Menu,Veterinaria,Opciones,C_Opciones);
        AtributosClientes AtributosClientes=new AtributosClientes();
        ConsultasClientes ConsultasClientes=new ConsultasClientes();
        ControladorClientes ControladorClientes=new ControladorClientes(Clientes, Opciones, ConsultasClientes, AtributosClientes, Veterinaria);
        
        AtributosEnfermera AtributosEnfermera=new AtributosEnfermera();
        ConsultasEnfermera ConsultasEnfermera=new ConsultasEnfermera();
        ControladorEnfermera ControladorEnfermera=new ControladorEnfermera(Enfermera, Opciones, ConsultasEnfermera, AtributosEnfermera, Veterinaria);
    
        AtributosMedico AtributosMedico=new AtributosMedico();
        ConsultasMedicos ConsultasMedicos=new ConsultasMedicos();
        ControladorMedico ControladorMedico=new ControladorMedico(Medico, Opciones, ConsultasMedicos, AtributosMedico, Veterinaria);
        
        
        AtributosSecretaria AtributosSecretaria=new AtributosSecretaria();
        ConsultasSecretaria ConsultasSecretaria=new ConsultasSecretaria();
        ControladorSecretaria ControladorSecretaria=new ControladorSecretaria(Secretaria, Opciones, ConsultasSecretaria, AtributosSecretaria, Veterinaria);
        
        
        AtributosMascotas AtributosMascotas=new AtributosMascotas();
        ConsultasMascotas ConsultasMascotas=new ConsultasMascotas();
        ControladorMascotas ControladorMascotas=new ControladorMascotas(Mascotas, Opciones, ConsultasMascotas, AtributosMascotas, Veterinaria);
        
        AtributosVacunas AtributosVacunas=new AtributosVacunas();
        ConsultasVacunas ConsultasVacunas=new ConsultasVacunas();
        ControladorVacuna ControladorVacuna=new ControladorVacuna(Vacunas, Opciones, ConsultasVacunas, AtributosVacunas, Veterinaria);
        
        
        
        
        
        
        
    
    } 
}
