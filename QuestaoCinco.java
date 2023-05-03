import java.util.Scanner;

public class QuestaoCinco {
    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = lerValor.nextInt();

        if(num > 10){
            System.out.println("O valor " + num + " é maior que 10");
        }
        else{
            System.out.println("O valor " + num + " é menor que 10");
        }
    }
}
