import java.util.Scanner;

public class QuestaoDe {
    public static void main(String[] args) {
        Scanner lerValor = new Scanner(System.in);
        int num;
        System.out.println("Descubra se o numero é perfeito:");
        num = lerValor.nextInt();
        numPefeito(num);
    }

    public static void numPefeito(int num){
        int soma =0;
        for(int i=1; i<num; i++){
            if(num % i ==0){
                soma += i;
            }
        }
        if(soma == num){
            System.out.println("O número é perfeito");
        }
        else
            System.out.println("O número não é perfeito");
    }
}
