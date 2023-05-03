import java.util.Scanner;
public class Questaodois {
    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);
        double totalSalario;

        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = lerValor.next();

        System.out.println("Digite seu salário fixo: ");
        double salarioFixo = lerValor.nextDouble();

        System.out.println("Digite seu total de vendas: ");
        double totalVendas = lerValor.nextDouble();

        totalSalario =  salarioFixo + totalVendas * 0.15;

        System.out.printf("O vendedor "  + nomeVendedor + " tem o salário fixo de " + salarioFixo + " e seu salário no fim do mês é de " + totalSalario);

    }
}