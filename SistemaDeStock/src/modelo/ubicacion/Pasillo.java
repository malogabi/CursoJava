package modelo.ubicacion;

/**
 *
 * @author gonzalo
 */
public class Pasillo extends Ubicacion {

    private int id;
    private String nombre;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pasillo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void addGalponDatosPreCargados() {
        int[] idArray = new int[]{0, 1, 2, 3, 4};
        String[] nombreArray = new String[]{"", "", "", "", ""};

        int id = 0;
        String nombreGalpon = new String();
        for (int i = 0; i < 4; i++) {
            id = idArray[i];
            nombreGalpon = nombreArray[i];
            Galpon g = new Galpon(id, nombreGalpon);
            this.add(g);
        }
    }

}
