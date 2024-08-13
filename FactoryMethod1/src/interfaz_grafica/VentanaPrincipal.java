/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz_grafica;

import fabrica.FabricaAbstracta;
import fabrica.FabricaProductoA;
import fabrica.FabricaProductoB;
import producto.Producto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JComboBox<String> comboBox;
    private JButton btnMostrar;
    
    public VentanaPrincipal() {
        setTitle("Patrón Factory Method");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        comboBox = new JComboBox<>(new String[]{"Producto A", "Producto B"});
        comboBox.setBounds(50, 30, 200, 25);
        add(comboBox);
        
        btnMostrar = new JButton("Mostrar");
        btnMostrar.setBounds(100, 70, 100, 25);
        add(btnMostrar);
        
        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FabricaAbstracta fabrica = null;
                Producto producto = null;
                
                String seleccion = (String) comboBox.getSelectedItem();
                
                if ("Producto A".equals(seleccion)) {
                    fabrica = new FabricaProductoA();
                } else if ("Producto B".equals(seleccion)) {
                    fabrica = new FabricaProductoB();
                }
                
                if (fabrica != null) {
                    producto = fabrica.crearProducto();
                    producto.mostrarDescripcion();
                    JOptionPane.showMessageDialog(null, seleccion + " creado.");
                }
            }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}

