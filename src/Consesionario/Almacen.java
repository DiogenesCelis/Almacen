package Consesionario;

import java.text.Format;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author diogenes.celis
 */
public class Almacen {

    /**
     * @param args the command line arguments
     */
    public static Auto ajjas[];

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Random r = new Random();
        int n=0,n2=0, sw = 0, op, mn;
        Auto inventario[];
        vendedor empleados[];
        
        //<editor-fold defaultstate="collapsed" desc="codigo">
        do {
            int sww = 0;
            do {
                //        <editor-fold defaultstate="collapsed" desc="Menu">
                String menu = (JOptionPane.showInputDialog(null, "Selecciona una opción", "Menú",
                        JOptionPane.PLAIN_MESSAGE, null, new Object[]{"--------------------------",
                            "1. Registrar autos", "2. Registrar autos automaticamente",
                            "3. Registrar vendedores", "4. Registrar vendedores automaticamente",
                            "5. Insertar venta y liquidar comisión", "6. Salir"},
                        "Selecciona")).toString();
                menu = menu.substring(0, 1);
                
                switch (menu) {
                    case "1":
                        //<editor-fold defaultstate="collapsed" desc="Llenado vehiculo">
                        System.out.println("\033[35m**Llenado de vehiculo**");
                        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de autos a registrar"));
                        System.out.println("Ingrese cantidad de vehiculos en inventario a registrar");
//                n = x.nextInt();
                        System.out.println(n);
                        inventario = new Auto[n];
                        for (int i = 0; i < n; i++) {
                            
                            System.out.println("\033[32mVehiculo " + (i + 1));
                            Auto auto1 = new Auto("", "", 2, 3, "", 1, 'D');
                            String marca = (JOptionPane.showInputDialog(null, "Selecione la marca del auto:  " + (i + 1), "Autos disponibles",
                                    JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecciona", "Peugeot", "Fiat", "Alfa Romeo", "Audi", "Kia", "Ford", "Mercedes Benz", "BMW"},
                                    "Selecciona")).toString();
                            System.out.println("Ingrese marca del vehiculo");
                            auto1.setMarca(marca);
                            System.out.println(marca);
                            
                            //
                            String placa = JOptionPane.showInputDialog("Ingrese placa del vehiculo").toUpperCase();
                            System.out.println("Ingrese placa del vehiculo");
                            auto1.setPlaca(placa);
                            System.out.println(placa);
                            //
                            String color = (JOptionPane.showInputDialog(null, "Selecione el color del auto:  " + (i + 1), "Colores disponibles",
                                    JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecciona", "Gris", "Azul", "Negro", "Rojo", "Plateado", "Blanco"},
                                    "Selecciona")).toString();
                            System.out.println("Ingrese color del vehiculo");
                            auto1.setColor(color);
                            System.out.println(color);
                            //
                            System.out.println("Ingrese modelo del vehiculo");
                            String mod = JOptionPane.showInputDialog(null, "Igrese el modelo del auto:  " + (i + 1), "Modelos disponibles",
                                    JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecciona", "2010",
                                        "2011", "2012", "2013", "2014", "2016", "2017", "2018", "2019", "2020",
                                        "2021", "2022", "2023"},
                                    "Selecciona").toString();
                            int modelo = Integer.parseInt(mod);
                            auto1.setModelo(modelo);
                            System.out.println(modelo);
//

System.out.println("Ingrese kilometraje del vehiculo");
int kilometraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese kilometraje"));
auto1.setKilometraje(kilometraje);
System.out.println(kilometraje + "KM");
//

System.out.println("Ingrese precio del vehiculo");
int precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio del vehiculo"));
auto1.setPrecio(precio);
System.out.println("$" + precio);
System.out.println("\n");

inventario[i] = auto1;
                        }
                        
//</editor-fold>
                        sww = 1;
                        break;
                        
                    case "2":
                        //<editor-fold defaultstate="collapsed" desc="LLenado automatico vehiculo">
                        System.out.println("\033[35m**Llenado de vehiculo automatico**");
                        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de autos a registrar"));
                        System.out.println("Ingrese cantidad de autos a registrar");
//                n = x.nextInt();
                        System.out.println(n);
                        
                        inventario = new Auto[n];
                        String color[] = {"Negro", "Blanco", "Azul", "Gris", "Plata", "Rojo"};
                        String marca[] = {"Peugeot", "Mercedez Benz", "Fiat", "Alfa Romeo", "Audi"};
                        String placa[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                        
                        for (int i = 0; i < n; i++) {
                            op = r.nextInt(1, 5);
                            Auto auto = new Auto("", "", 2, 3, "", op, 'D');
                            
                            auto.setMarca(marca[r.nextInt(1 * 5)]);
                            auto.setPlaca((placa[r.nextInt(1 * 25)] + placa[r.nextInt(1 * 25)] + placa[r.nextInt(1 * 25)] + +r.nextInt(10 * 100)));
                            auto.setColor(color[r.nextInt(1 * 6)]);
                            auto.setKilometraje(r.nextInt(1000));
                            auto.setModelo(r.nextInt(2021, 2023));
                            auto.setPrecio(r.nextInt(1000, 10000));
                            inventario[i] = auto;
                            
                        }
                        for (int j = 0; j < n; j++) {
                            JOptionPane.showMessageDialog(null, "**Vehiculo " + (j + 1) + "**", "Vehiculos Registrados Automaticamente", 1);
                            JOptionPane.showMessageDialog(null, "Marca: " + inventario[j].getMarca()
                                    + "\nPlaca: " + inventario[j].getPlaca() + "\nColor: " + inventario[j].getColor()
                                    + "\nKilometraje: " + inventario[j].getKilometraje() + "km"
                                            + "\nModelo: " + inventario[j].getModelo()
                                    + "\nPrecio: $" + inventario[j].getPrecio() + " Dlls",
                                    "Vehiculos Registrados Automaticamente", 1);
                            
                            System.out.println("\033[32m**Vehiculo " + (j + 1) + "**");
                            System.out.println("Marca: " + inventario[j].getMarca());
                            System.out.println("Placa: " + inventario[j].getPlaca());
                            System.out.println("Color: " + inventario[j].getColor());
                            System.out.println("Kilometraje: " + inventario[j].getKilometraje() + "km");
                            System.out.println("Modelo: " + inventario[j].getModelo());
                            System.out.println("Precio: $" + inventario[j].getPrecio() + " Dlls");
                            System.out.println("\n");
                        }
//</editor-fold>
                        sww = 1;
////                Auto.llenadoAutom();
                        break;
                        
                    case "3":
                        //<editor-fold defaultstate="collapsed" desc="Llenado Empleados">
                        System.out.println("\033[35m**Llenado de empleados**");
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de vendedores a registrar"));
                        System.out.println("Ingrese cantidad de vendedores a registrar");
                        //                n = x.nextInt();
                        System.out.println(n2);
                        empleados = new vendedor[n2];
                        
                        for (int i = 0; i < n2; i++) {
                            vendedor pj = new vendedor("", 0, 0);
                            
                            System.out.println("Ingrese nombre del vendedor");
                            String nombre = JOptionPane.showInputDialog("Nombre");
                            pj.setNombre(nombre);
                            System.out.println(nombre);
                            //
                            
                            System.out.println("Ingrese identidicacion del vendedor");
                            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Identificacion"));
                            pj.setIdentificacion(cedula);
                            System.out.println(cedula);
                            
                            empleados[i] = pj;
                        }
                        //</editor-fold>
                        sww = 1;
                        break;
                    case "4":
                        //<editor-fold defaultstate="collapsed" desc="Llenado empleados automatico">
                        System.out.println("\033[35m**Llenado de empleados automatico**");
                        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de empleados a registrar"));
                        System.out.println("Ingrese cantidad de empleados a registrar");
//                n = x.nextInt();
                        System.out.println(n2);
                        
                        empleados = new vendedor[n2];
                        String nombres[] = {"Adolfo", "Pedro", "David", "Juan", "Nelson", "Andres", "Camila", "Andrea", "Jhon", "Brian", "Katarina", "Samira", "Ekko", "Morgana", "Aphelios", "Kyle", "Ivern", "Gabriel"};
                        String apellidos[] = {"Celis", "García", "Arrieta", "Soto", "Goméz", "Zapata", "Osorio", "Capera", "De la Rosa", "Matinez", "Roca"};
                        String inicial[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
                        
                        for (int i = 0; i < n2; i++) {
                            op = r.nextInt(1, 5);
                            vendedor pj = new vendedor("", i, 0);
                            
                            pj.setNombre(nombres[r.nextInt(1 * 18)] + " " + inicial[r.nextInt(1 * 24)] + ". " + apellidos[r.nextInt(1 * 11)]);
                            pj.setIdentificacion(r.nextInt(1140899101));
                            empleados[i] = pj;
                            
                        }
                        for (int j = 0; j < n; j++) {
                            JOptionPane.showMessageDialog(null, "**Empleado " + (j + 1) + "**", "Vendedores Registrados Automaticamente", 1);
                            JOptionPane.showMessageDialog(null, "Nombre: " + empleados[j].getNombre()
                                    + "\nCedula: " + empleados[j].getIdentificacion(),
                                    "Vendedores Registrados Automaticamente", 1);
                            
                            System.out.println("\033[32m**Vendedor " + (j + 1) + "**");
                            System.out.println("Nombre: " + empleados[j].getNombre());
                            System.out.println("Cedula: " + empleados[j].getIdentificacion());
                            
                            System.out.println("\n");
                        }
//</editor-fold>
                        sww = 1;
                        break;
                    case "5":
                        
                        //<editor-fold defaultstate="collapsed" desc="Registrar Venta">
                        System.out.println("\033[35m**Registrar venta y comisión**");
                        
                        
                        System.out.println("Ingrese Placa del vehiculo");
                        String BsqPlaca = x.nextLine();
                        System.out.println(BsqPlaca);
                        
                        System.out.println("Ingrese cedula del vendedor");
                        int BsqCC = x.nextInt();
                        System.out.println(BsqCC);
                        
                        
                        for (int i = 0; i < n2; i++) {
//                            System.out.println(inventario[i].getPlaca());

                        }
//</editor-fold>
                        sww = 1;
                        
                        break;
                        
                    case "6":
                        System.out.println("\033[35m**Salir**");
                        System.out.println("Muchas gracias por su tiempo");
                        sww = 1;
                        sw = 1;
                        
                        break;
                    default:
                        throw new AssertionError();
                        
                }
                
//</editor-fold>
            } while (sww == 0);
            
        } while (sw == 0);
//</editor-fold>

    }
//    2da carga
}
