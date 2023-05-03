import java.util.Scanner;
public class QuestaoTres{
    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);
        int c;

        System.out.println("Digite um valor: ");
        int a = lerValor.nextInt();

        System.out.println("Digite outro valor: ");
        int b = lerValor.nextInt();

        c = a;
        a = b;
        b = c;


        System.out.println("Valores: " + a + " e "+ b);

    }
}