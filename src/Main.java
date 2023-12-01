import java.util.ArrayList;
import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("2020","fazer","blue");
        Carro carro1 = new Carro("2023","bros125","Red");
        Carro carro2 = new Carro("2023","bros125","Red");
        CarroEletrico carroEletrico = new CarroEletrico("2156", "mis","black","50");
        ArrayList<Carro> listarCarro = new ArrayList<>();
        LinkedList<Carro> linkCarro = new LinkedList<>();

        listarCarro.add(carro);
        listarCarro.add(carro1);
        listarCarro.add(carroEletrico);
        linkCarro.add(carro);
        linkCarro.add(carro1);
        linkCarro.add(carroEletrico);

        for (Carro carros: linkCarro) {
            System.out.println(carros);

        }
        for (Carro carros: listarCarro ) {

            System.out.println(carros);

        }

        System.out.println(carroEletrico);
        System.out.println(carro.recarregarBateria());
        System.out.println(carroEletrico.recarregarBateria());

        System.out.println(carro1.equals(carro2));
        System.out.println(carro1.hashCode());
        System.out.println(carro2.hashCode());
        }
}
