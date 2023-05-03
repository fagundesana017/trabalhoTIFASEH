import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class QuestaoOnze {
    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = lerValor.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = lerValor.nextInt();

        System.out.println("Digite o ultimo numero: ");
        int num3 = lerValor.nextInt();

        valoresASC(num1, num2, num3);
    }

    public static void valoresASC(int num1, int num2, int num3){
        if (num1 < num2){
            if (num2 < num3) {
                System.out.println(num1 + "\n" + num2 + "\n" + num3);
            }
            else if (num1 < num3){
                System.out.println(num1 + "\n" + num3 + "\n" + num2);
            } else {
                System.out.println(num3 + "\n" + num1 + "\n" + num2);
            }
        } else if (num2 < num3) {
            if (num1 < num3){
                System.out.println(num2 + "\n" + num3 + "\n" + num1);
            } else
            {
                System.out.println(num2 + "\n" + num3 + "\n" + num1);
            }
        } else {
            System.out.println(num2 + "\n" + num3 + "\n" + num1);
        }
    }
}
