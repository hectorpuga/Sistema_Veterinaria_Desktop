/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HECTOR
 */
public class BuscarCliente extends javax.swing.JPanel {
 Opciones Opciones;
 Veterinaria Veterinaria;
    
    PreparedStatement ps;
        ResultSet rs;
    /**
     * Creates new form BuscarCliente
     */
    public BuscarCliente() {
        initComponents();
        this.setBounds(0, 0, 800, 510);
    }
public void ant(Opciones Opciones, Veterinaria Veterinaria){

   this.Opciones=Opciones;
   this.Veterinaria=Veterinaria;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        CargarTabla = new javax.swing.JButton();
        Buscar = new javax.swing.JTextField();
        Accion = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombre", "Apellidos", "Direccion", "Telefono", "Correo Electronico", "Descuento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        CargarTabla.setOpaque(false);
        CargarTabla.setBorderPainted(false);
        CargarTabla.setContentAreaFilled(false);
        CargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarTablaActionPerformed(evt);
            }
        });

        Buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Buscar.setOpaque(false);
        Buscar.setBorder(null);

        Accion.setOpaque(false);
        Accion.setBorderPainted(false);
        Accion.setContentAreaFilled(false);
        Accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccionActionPerformed(evt);
            }
        });

        Regresar.setOpaque(false);
        Regresar.setBorderPainted(false);
        Regresar.setContentAreaFilled(false);
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Accion, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(CargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Accion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarTablaActionPerformed
        DefaultTableModel ModeloTabla=new DefaultTableModel();
        Tabla.setModel(ModeloTabla);
        
          
         
        try{
            Conexion Con=new Conexion();
            Connection Conexion=Con.getconnection();
            ps=Conexion.prepareStatement("select * from cliente ");
            rs=ps.executeQuery();  
            ModeloTabla.addColumn("IdCliente");
            ModeloTabla.addColumn("Nombre");
            ModeloTabla.addColumn("Apellido");
            ModeloTabla.addColumn("Direccion");
             ModeloTabla.addColumn("Telefono");
              ModeloTabla.addColumn("Correo_Electronico");
               ModeloTabla.addColumn("Descuento");
            ResultSetMetaData RSMD=rs.getMetaData();
            int CantidadColumnas=RSMD.getColumnCount();
            
            int Anchos[]={50,50,50,50,50,100,50};
            
            for (int i = 0; i < CantidadColumnas; i++) {
                Tabla.getColumnModel().getColumn(i).setPreferredWidth(Anchos[i]);
            }
            while(rs.next()){
            Object fila[]=new Object[CantidadColumnas];
                for (int i = 0; i < CantidadColumnas; i++) {
                    fila[i]=rs.getObject((i+1));
                }
                ModeloTabla.addRow(fila);
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_CargarTablaActionPerformed

    private void AccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccionActionPerformed
     
        
        
        
        
         DefaultTableModel ModeloTabla=new DefaultTableModel();
        Tabla.setModel(ModeloTabla);
          String Campo=Buscar.getText();
          String where="";
          
          if(!"".equals(Campo)){
          where="where IdCliente='"+Campo+"'";
          }
          else{
          JOptionPane.showMessageDialog(this,"Por favor digite un Id");
          }
        try{
            Conexion Con=new Conexion();
            Connection Conexion=Con.getconnection();
            ps=Conexion.prepareStatement("select IdCliente,Nombre,Apellidos,Direccion,Telefono,Correo_Electronico,Descuento from cliente "+where);
            rs=ps.executeQuery();  
            ModeloTabla.addColumn("IdCliente");
            ModeloTabla.addColumn("Nombre");
            ModeloTabla.addColumn("Apellido");
            ModeloTabla.addColumn("Direccion");
             ModeloTabla.addColumn("Telefono");
              ModeloTabla.addColumn("Correo_Electronico");
               ModeloTabla.addColumn("Descuento");
            ResultSetMetaData RSMD=rs.getMetaData();
            int CantidadColumnas=RSMD.getColumnCount();
            
            int Anchos[]={50,50,50,50,50,80,50};
            
            for (int i = 0; i < CantidadColumnas; i++) {
                Tabla.getColumnModel().getColumn(i).setPreferredWidth(Anchos[i]);
            }
            while(rs.next()){
            Object fila[]=new Object[CantidadColumnas];
                for (int i = 0; i < CantidadColumnas; i++) {
                    fila[i]=rs.getObject((i+1));
                }
                ModeloTabla.addRow(fila);
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
    }//GEN-LAST:event_AccionActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
     
              this.setVisible(false);
            Veterinaria.add(Opciones);
             Opciones.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed
@Override
    public void paintComponent(Graphics g)
    {
        Dimension Tam=getSize();
        ImageIcon Imagen=new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/Buscar.jpg")).getImage());
        g.drawImage(Imagen.getImage(),0,0,Tam.width,Tam.height,null);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Accion;
    public javax.swing.JTextField Buscar;
    public javax.swing.JButton CargarTabla;
    public javax.swing.JButton Regresar;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
