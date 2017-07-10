import java.util.ArrayList;

/**
 * Created by XavRuiz on 7/9/2017.
 */
public class Tienda {

    private String NomGerente;
    private String DirTienda;
    private String Anio;

    private ArrayList<Tienda> tienda = new ArrayList<>();

    public Tienda (){

    }

    public Tienda(String nomGerente, String dirTienda, String anio, ArrayList<Tienda> tienda) {
        NomGerente = nomGerente;
        DirTienda = dirTienda;
        Anio = anio;
        this.tienda = tienda;
    }

    public String getNomGerente() {
        return NomGerente;
    }

    public void setNomGerente(String nomGerente) {
        NomGerente = nomGerente;
    }

    public String getDirTienda() {
        return DirTienda;
    }

    public void setDirTienda(String dirTienda) {
        DirTienda = dirTienda;
    }

    public String getAnio() {
        return Anio;
    }

    public void setAnio(String anio) {
        Anio = anio;
    }

    public ArrayList<Tienda> getTienda() {
        return tienda;
    }

    public void setTienda(ArrayList<Tienda> tienda) {
        this.tienda = tienda;
    }
}
