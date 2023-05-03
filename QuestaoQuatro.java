import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args){
        Scanner lerValor = new Scanner(System.in);

        System.out.println("Digite o valor depositado: ");
        double valorDeposito = lerValor.nextDouble();

        System.out.println("Escolha a opção que infoma o tipo de rendimento:");
        System.out.println("1. Poupança em 0.90% ao mês");
        System.out.println("2. CDB em 1,1% ao 9mês");
        System.out.println("3. Previdência privada 1,3% ao mês");
        int opcao = lerValor.nextInt();

        double rendimento = 0.00;
        double rendimentoTotal = valorDeposito;

        switch (opcao){
            case 1:
                rendimento = valorDeposito * 0.009;
                for(int i = 1; i <=12; i++){
                    rendimentoTotal += rendimento;
                }
                break;
            case 2:
                rendimento = valorDeposito * 0.011;
                for(int i = 1; i <=12; i++) {
                    rendimentoTotal += rendimento;
                }
                break;
            case 3:
                rendimento = valorDeposito * 0.013;
                for(int i = 1; i <=12; i++) {
                    rendimentoTotal += rendimento;
                }
                break;
            default:
                System.out.println("Ops! Escolha outra opção.");
                break;

        }
        System.out.println("O rendimento do próximo mês é de: " + rendimento);
        System.out.println("O rendimento após 12 meses é de: " + rendimentoTotal);
    }
}
