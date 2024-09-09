/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_bridge;

/**
 *
 * @author jorge malaver
 */

import Implementador_Color.Amarillo;
import Implementador_Color.Rojo;
import Implementador_Color.Azul;
import Implementador_Talla.Talla_L;
import Implementador_Talla.Talla_S;
import Implementador_Talla.Talla_M;
import Abstraccion.*;

public class Practica_Bridge {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Abstract_prenda[] prendas =new Abstract_prenda[3];
        prendas[0]= new Chaqueta(new Rojo(), new Talla_M());
        prendas[1] = new Buzo(new Azul(), new Talla_M());
        prendas[2] = new Pantalon(new Amarillo(), new Talla_M());
        
        
        
        for( Abstract_prenda obj : prendas){
            obj.prenda();
        }
        
    }
    
}
