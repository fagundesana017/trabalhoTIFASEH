import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);
        double consumoMedio;

        System.out.println("Digite a distancia total percorrida: ");
        double distanciaPercorrida = lerValor.nextDouble();

        System.out.println("Digite total de combustivel gasto: ");
        double totalGasto = lerValor.nextDouble();

        consumoMedio =  distanciaPercorrida / totalGasto;

        System.out.printf("Consumo medio do automovel = " + consumoMedio);

    }
}