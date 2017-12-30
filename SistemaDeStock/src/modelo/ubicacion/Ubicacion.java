/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.ubicacion;

import java.util.ArrayList;

/**
 *
 * @author gonzalo
 */
public abstract class Ubicacion {
    private int id;
    private String nombre;
    protected ArrayList<Ubicacion> ubicacion = new ArrayList<Ubicacion>();
    
    public void add(Ubicacion u){
        this.ubicacion.add(u);
    }
}
