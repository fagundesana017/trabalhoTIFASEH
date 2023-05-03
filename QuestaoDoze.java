import java.util.Scanner;

public class QuestaoDoze {
    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int x = lerValor.nextInt();

        System.out.println("Digite um numero elevado");
        int z = lerValor.nextInt();
        valorElevado(x, z);
    }

    public static void valorElevado(int x, int z){

        double resultado = Math.pow(x, z);
       System.out.println("O resultado é " + resultado);
    }
}

