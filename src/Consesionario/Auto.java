package Consesionario;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author diogenes.celis
 */
public class Auto {

    //atributos
    private String Placa;
    private String marca;
    private int modelo;
    private int precio;
    private String color;
    private int kilometraje;
    private char estado;
    
    private int dct=0;
    private static int dctGlobal = 10;

    public Auto(String Placa, String marca, int modelo, int precio, String color, int kilometraje, char estado) {
        this.Placa = Placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }
    //<editor-fold defaultstate="collapsed" desc="Get & Set">

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public int getDct() {
        return dct;
    }

    public void setDct(int dct) {
        this.dct = dct;
    }

    public static int getDctGlobal() {
        return dctGlobal;
    }

    public static void setDctGlobal(int dctGlobal) {
        Auto.dctGlobal = dctGlobal;
    }
   
    
    
    
//</editor-fold>
    
    //metodos
    public int descuentoUnitario() {
        return dct;
    }

    public static void descuentoGlobal() {
        Auto.dctGlobal = 10;
    }

    public static void llenadoAutom() {
        Scanner x = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Ingrese cantidad de autos a registrar");
        int n = x.nextInt();

        Auto vent[] = new Auto[n];
        String color[] = {"Negro", "Blanco", "Azul", "Gris", "Plata", "Rojo"};
        String marca[] = {"Peugeot", "Mercedez Benz", "Fiat", "Alfa Romeo", "Audi"};
        String placa[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for (int i = 0; i < n; i++) {

            Auto auto = new Auto("", "", 0, 0, "", 0, 'D');

            auto.setMarca(marca[r.nextInt(1 * 5)]);
            auto.setPlaca((placa[r.nextInt(1 * 25)] + placa[r.nextInt(1 * 25)] + placa[r.nextInt(1 * 25)] + +r.nextInt(10 * 100)));
            auto.setColor(color[r.nextInt(1 * 6)]);
            auto.setKilometraje(r.nextInt(1000));
            auto.setModelo(r.nextInt(2021, 2023));
            auto.setPrecio(r.nextInt(100000, 10000000));
            vent[i] = auto;

        }

        for (int j = 0; j < n; j++) {
            System.out.println("**Vehiculo " + (j + 1) + "**");
            System.out.println("Marca: " + vent[j].getMarca());
            System.out.println("Placa: " + vent[j].getPlaca());
            System.out.println("Color: " + vent[j].getColor());
            System.out.println("Kilometraje: " + vent[j].getKilometraje() + "km");
            System.out.println("Modelo: " + vent[j].getModelo());
            System.out.println("Precio: $" + vent[j].getPrecio() + " Dlls");
            System.out.println("\n");
        }
        
    }
}
