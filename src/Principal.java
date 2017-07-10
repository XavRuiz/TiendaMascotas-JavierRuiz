import java.util.Scanner;

/**
 * Created by XavRuiz on 7/9/2017.
 */
public class Principal {

    public static void main (String [] args) throws Exception {

        Scanner sn = new Scanner(System.in);
        Tienda tienda = new Tienda();

        System.out.println("Ingrese el nombre del gerente");
        Tienda.setNomGerente(sn.next());


    }

}
