import java.util.ArrayList;
import java.util.List;

public class Inmueble {
    String nombre;
    String ubicacion;
    double metros;
    int habitaciones;
    double precio;

    Inmueble inmueble;

    public Inmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public Inmueble(String nombre, String ubicacion, double metros, int habitaciones, double precio) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.metros = metros;
        this.habitaciones = habitaciones;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "nombre='" + nombre + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", metros=" + metros +
                ", habitaciones=" + habitaciones +
                ", precio=" + precio +
                '}';
    }
}
