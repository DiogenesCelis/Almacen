/*
 * Click https://github.com/DiogenesCelis/Almacen para descargar el repositorio en GitHub
 *
 */

package Consesionario;

import java.util.Scanner;

/**
 *
 * @author diogenes.celis
 */
public class ventas {
    
    private int cedula;
    private String placa;
    private int precio;
    private int comision;

    //<editor-fold defaultstate="collapsed" desc="Get & Set">
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

//</editor-fold>
    
//  metodos  
    public static void registrarVenta() {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        ventas ventas[] = new ventas[n];
    }

}
