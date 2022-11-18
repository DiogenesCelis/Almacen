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
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Random r = new Random();
        int n = 0, n2 = 0, sw = 0, op, mn;
        Auto inventario[] = new Auto[1];
        vendedor empleados[] = new vendedor[1];
        ventas registroVenta[] = new ventas[1];

        //<editor-fold defaultstate="collapsed" desc="codigo">
        do {
            int sww = 0;
            do {
                //        <editor-fold defaultstate="collapsed" desc="Menu">
                String menu = (JOptionPane.showInputDialog(null, "Selecciona una opción", "Menú",
                        JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecciona una opción",
                            "1. Registrar autos", "2. Registrar autos automaticamente",
                            "3. Registrar vendedores", "4. Registrar vendedores automaticamente",
                            "5. Insertar venta y liquidar comisión", "6. Aplicar descuento",
                            "7. Aplicar descuento a todos", "8. Cantidad de autos disponibles",
                            "9. Cantidad de autos vendidos", "10. Cantidad y total de comision por vendedor", "11. Total venta y comisiones", "12. Salir"},
                        "Selecciona")).toString();
                menu = menu.substring(0, 2);
                System.out.println(menu);

                switch (menu) {

                    case "Se":
                        sww = 1;

                        break;

                    case "1.":
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

                    case "2.":
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
                            System.out.println("Estado: " + inventario[j].getEstado());
                            System.out.println("\n");
                        }
//</editor-fold>
                        sww = 1;
////                Auto.llenadoAutom();
                        break;

                    case "3.":
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
                    case "4.":
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
                            vendedor pj = new vendedor("", 1, 0);

                            pj.setNombre(nombres[r.nextInt(1 * 18)] + " " + inicial[r.nextInt(1 * 24)] + ". " + apellidos[r.nextInt(1 * 11)]);
                            pj.setIdentificacion(r.nextInt(1140899101));
                            empleados[i] = pj;

                        }
                        for (int j = 0; j < n2; j++) {
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
                    case "5.":

                        //<editor-fold defaultstate="collapsed" desc="Registrar Venta">
                        System.out.println("\033[35m**Registrar venta y comisión**");

                        System.out.println("Ingrese Placa del vehiculo");
                        String BsqPlaca = JOptionPane.showInputDialog("Ingrese placa del vehiculo");
                        System.out.println(BsqPlaca);
                        ventas venta = new ventas();
                        int posAuto = 0,
                         placaDisp = 0,
                         placaExis = 0;

                        for (int i = 0; i < n; i++) {

                            if (BsqPlaca == inventario[i].getPlaca()) {
//                                System.out.println("El vehiculo está disponible");

                                System.out.println("\033[32m**Vehiculo " + (i + 1) + "**");
                                System.out.println("Marca: " + inventario[i].getMarca());
                                System.out.println("Placa: " + inventario[i].getPlaca());
                                System.out.println("Color: " + inventario[i].getColor());
                                System.out.println("Kilometraje: " + inventario[i].getKilometraje() + "km");
                                System.out.println("Modelo: " + inventario[i].getModelo());
                                System.out.println("Precio: $" + inventario[i].getPrecio() + " Dlls");
                                System.out.println("\n");

                                posAuto = i;
                                placaExis = 1;
                            }

                        }

//                        if(placaExis==1){
                        if (inventario[posAuto].getEstado() == 'D') {
                            placaDisp = 1;
                        } else {
                            placaDisp = 0;
                            System.out.println("La placa no está disponible");
                        }
                        System.out.println(posAuto);
                        System.out.println(registroVenta[1]);
//                        System.out.println("Ingrese cedula del vendedor");
//                        int BsqCC = x.nextInt();
//                        System.out.println(BsqCC);

                        //<editor-fold defaultstate="collapsed" desc="registro venta">
//                        venta.setPlaca(BsqPlaca);
//                        venta.setCedula(posAuto);
//                        venta.setComision(posAuto);
//                        registroVenta[1]=venta;
//</editor-fold>
//</editor-fold>
                        sww = 1;

                        break;

                    case "6.":
                        
                        sww = 1;
                        break;

                    case "7.":

                        sww = 1;
                        break;

                    case "8.":

                        //<editor-fold defaultstate="collapsed" desc="Contar unidades disponibles">
                        int unidadesDisp = 0;
                        for (int i = 0; i < n; i++) {

                            if (inventario[i].getEstado() == 'D') {
                                unidadesDisp = unidadesDisp + 1;
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Existen " + unidadesDisp + " unidades disponibles", "Unidades en inventario", JOptionPane.INFORMATION_MESSAGE);
//</editor-fold>

                        sww = 1;
                        break;

                    case "9.":

                        sww = 1;
                        break;

                    case "10":
                        sww = 1;
                        break;

                    case "12":

                        JOptionPane.showMessageDialog(null, "      Muchas gracias por su tiempo", "Salida", -1);
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
}
