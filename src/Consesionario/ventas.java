
package Consesionario;

import java.util.Scanner;

/**
 *
 * @author diogenes.celis
 */
public class ventas {
    private int cedula;
    private String placa;
    private int comision;
    private char estado;

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
    
    public int getComision() {
        return comision;
    }
    
    public void setComision(int comision) {
        this.comision = comision;
    }
    
    public char getEstado() {
        return estado;
    }
    
    public void setEstado(char estado) {
        this.estado = estado;
    }
//</editor-fold>
    
    public static void registrarVenta(){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        ventas ventas[]=new ventas[n];
        
        
    }
    
    
}
