/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica;

import producto.Producto;
import producto.ProductoA;


public class FabricaProductoA implements FabricaAbstracta {
    @Override
    public Producto crearProducto() {
        return new ProductoA();
    }
}


