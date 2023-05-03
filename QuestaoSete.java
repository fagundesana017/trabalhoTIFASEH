import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);
        double totalValor = 0.00, desconto;
        char opcaoResposta;
        do {
            System.out.println("Digite o ano do veículo: ");
            int anoVeiculo = lerValor.nextInt();
            System.out.println("Digite o valor do veículo: ");
            double valorVeiculo = lerValor.nextDouble();

            if(anoVeiculo <= 2010){
                desconto = valorVeiculo * 0.12;
                System.out.println("O valor será de " +  desconto + " com deconto de 12%");
            }
            else {
                desconto = valorVeiculo * 0.07;
                System.out.println("O valor será de " +  desconto + " com deconto de 7%");
            }
            totalValor += desconto;

            System.out.println("Deseja continuar calculando desconto? (S - Sim ou N - Não)");
           opcaoResposta = lerValor.next().charAt(0);

        } while (opcaoResposta != 'N');
    }
}
