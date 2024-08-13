
package fabrica;

import producto.Producto;
import producto.ProductoB;

public class FabricaProductoB implements FabricaAbstracta {
    @Override
    public Producto crearProducto() {
        return new ProductoB();
    }
}
