import java.util.ArrayList;

/**
 * Created by XavRuiz on 7/5/2017.
 */
public class Mascota {

    private String TipoAnimal;
    private String Raza;
    private int edad;

    private ArrayList<Mascota> mascotas = new ArrayList<>();

    public Mascota (){

    }

    public Mascota(String tipoAnimal, String raza, int edad, ArrayList<Mascota> mascotas) {
        TipoAnimal = tipoAnimal;
        Raza = raza;
        this.edad = edad;
        this.mascotas = mascotas;
    }

    public String getTipoAnimal() {
        return TipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        TipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
