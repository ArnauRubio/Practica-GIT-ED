import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Inmueble> inmuebles = new ArrayList<>();
        char e;
        do {
            System.out.println("Indique la accion que desea realizar");
            System.out.println("""
                    1- Dar de alta un nuevo inmueble
                    2- Modificar un inmueble existente
                    3- Dar de baja un inmueble
                    4- salir""");
            e = br.readLine().charAt(0);
            switch (e) {
                case '1':
                    System.out.println("Cual es el nombre del propietario:");
                    String n = br.readLine();
                    System.out.println("Donde se ubica el inmueble?:");
                    String u = br.readLine();
                    System.out.println("Cuantos metros cuadrados tiene el inmueble?:");
                    double m = Double.parseDouble(br.readLine());
                    System.out.println("Cuantas habitaciones tiene el inmueble?:");
                    int h = Integer.parseInt(br.readLine());
                    System.out.println("Cual es el precio de venta de este inmueble?:");
                    double p = Double.parseDouble(br.readLine());
                    Inmueble n_inmueble = new Inmueble(n, u, m, h, p);
                    inmuebles.add(n_inmueble);
                    break;
                case '2':
                    for (int i = 0; i < inmuebles.size(); i++) {
                        System.out.println(i + ": " + inmuebles.get(i).getNombre());
                    }
                    System.out.println("Que inmueble vas a modificar?:");
                    int inmuebleSeleccionado = Integer.parseInt(br.readLine());

                    Inmueble borrar = inmuebles.get(inmuebleSeleccionado);
                    inmuebles.remove(borrar);

                    System.out.println("Cual es el nombre del propietario:");
                    String n2 = br.readLine();
                    System.out.println("Donde se ubica el inmueble?:");
                    String u2 = br.readLine();
                    System.out.println("Cuantos metros cuadrados tiene el inmueble?:");
                    double m2= Double.parseDouble(br.readLine());
                    System.out.println("Cuantas habitaciones tiene el inmueble?:");
                    int h2 = Integer.parseInt(br.readLine());
                    System.out.println("Cual es el precio de venta de este inmueble?:");
                    double p2 = Double.parseDouble(br.readLine());
                    Inmueble n_inmueble2 = new Inmueble(n2, u2, m2, h2, p2);
                    inmuebles.add(n_inmueble2);

                    break;
                case '3':
                    for (int i = 0; i < inmuebles.size(); i++) {
                        System.out.println(i + ": " + inmuebles.get(i).getNombre());
                    }
                    System.out.println("Que inmueble vas a dar de baja?:");
                    inmuebleSeleccionado = Integer.parseInt(br.readLine());
                    borrar = inmuebles.get(inmuebleSeleccionado);
                    inmuebles.remove(borrar);

                    break;
                case '4':
                    break;
                default:
                    System.out.println("Seleccione un numero del 1-4 para continuar");

            }
        } while (e != '4');


    }
}