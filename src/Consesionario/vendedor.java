/*
 * Click https://github.com/DiogenesCelis/Almacen para descargar el repositorio en GitHub
 *
 */

package Consesionario;

/**
 *
 * @author diogenes.celis
 */
public class vendedor {
        private String nombre;
    private int identificacion;
    private int numVentas;
    private int comision;



    public vendedor(String nombre, int identificacion, int comision) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.comision = comision;
        this.numVentas=0;
    }
    
    //<editor-fold defaultstate="collapsed" desc="Get & Set">
    public String getNombre() {
        return nombre;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getIdentificacion() {
        return identificacion;
    }
    
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    
    public int getComision() {
        return comision;
    }
    
    public void setComision(int comision) {
        this.comision = comision;
    }
//</editor-fold>
    
    
}
