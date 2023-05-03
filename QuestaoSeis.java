import java.util.Scanner;

public class QuestaoSeis {
    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);
        int countMulher = 0;
        int countHomem = 0;

        for(int i = 1; i <=3;  i++){
            System.out.println("Digite o nome: ");
            String nome = lerValor.nextLine();


            System.out.println("Digite o sexo Mulher(F - Feminino) ou Homem(M - Masculino): ");
            char sexo = lerValor.nextLine().charAt(0);

            if(sexo == 'F') {
                System.out.println(nome + " é mulher");
                countMulher++;
            }

            else if (sexo == 'M') {
                System.out.println(nome + " é homem");
                countHomem++;
            }

            else {
                System.out.println("Algo deu errado, tente novamente!");
                i--;
            }

        }
        System.out.println("Quantidades de mulheres é de " + countMulher);
        System.out.println("Quantidade de homens é de " + countHomem);

    }
}
