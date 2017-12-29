/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadestock.ejemplos;

import sistemadestock.baseDatos.SQLitle;
import sistemadestock.ejemplos.modelo.Marca;

/**
 *
 * @author mariano
 */
public class GestorMarca {
    private Marca marca;
    
    public GestorMarca(){
        marca = new Marca();
    }
    
    public void setNombreMarca(String nombreMarca) {
        marca.setNombre(nombreMarca);
    }
    
    public void save(){
        SQLitle.createNewDatabase("");
        SQLitle.configureSessionFactory().openSession().save(marca);
    }
    
}
