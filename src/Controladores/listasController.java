/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Lista;
import Vistas.frmIngreso;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
public class listasController implements ActionListener{
    Lista nuevaLista = new Lista();
    frmPrincipal VistaPrincipal;
    frmIngreso VistaIngreso;
    public DefaultTableModel TablaNodo = new DefaultTableModel();
     
    public listasController (frmPrincipal VistaPrincipal) {
    this.VistaPrincipal = VistaPrincipal;
    
    this.VistaPrincipal.btnIngresar.addActionListener(this);
    
    this.VistaPrincipal.setVisible(true);
        this.TablaNodo.addColumn("Numero");
        this.TablaNodo.addColumn("Nombre");
        this.TablaNodo.addColumn("Apellido");
        
        this.VistaIngreso.jtNodos.setModel(TablaNodo);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()== this.VistaPrincipal.btnIngresar) {
            this.VistaIngreso.btnNodoNew.addActionListener(this);
            
            this.VistaIngreso.setLocationRelativeTo(null);
            this.VistaIngreso.setVisible(true);
        }
    
            if(e.getSource()== this.VistaIngreso.btnNodoNew){
            this.nuevaLista.InsertarNodo(this.VistaIngreso.txtNumero.getText(),
                    this.VistaIngreso.txtNombre.getText(),
                    this.VistaIngreso.txtApellido.getText(),
            
            this.TablaNodo.addRow(new Object[ ]{this.nuevaLista.InsertarNodo(this.VistaIngreso.txtNumero.getText()),
                this.ModeloReparacion.ListaReparacion.get(0).getDescripcion(),
                this.ModeloReparacion.ListaReparacion.get(0).getTecnico(),
                this.ModeloReparacion.ListaReparacion.get(0).getFecha()});
        }
   
   }
       
}
