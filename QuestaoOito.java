import java.util.Scanner;

public class QuestaoOito {
    public static void main(String[] args) {

        Scanner lerValor = new Scanner(System.in);
        int numCategoria;

        String[] categoriasSeguro = {
                "Categoria 1 - 17 a 20 anos - Grupo de risco baixo",
                "Categoria 2 - 17 a 20 anos - Grupo de risco médio",
                "Categoria 3 - 17 a 20 anos - Grupo de risco alto",
                "Categoria 2 - 21 a 24 anos - Grupo de risco baixo",
                "Categoria 3 - 21 a 24 anos - Grupo de risco médio",
                "Categoria 4 - 21 a 24 anos - Grupo de risco alto",
                "Categoria 3 - 25 a 34 anos - Grupo de risco baixo",
                "Categoria 4 - 25 a 34 anos - Grupo de risco médio",
                "Categoria 5 - 25 a 34 anos - Grupo de risco alto",
                "Categoria 4 - 35 a 64 anos - Grupo de risco baixo",
                "Categoria 5 - 35 a 64 anos - Grupo de risco médio",
                "Categoria 6 - 35 a 64 anos - Grupo de risco alto",
                "Categoria 7 - 65 a 70 anos - Grupo de risco baixo",
                "Categoria 8 - 65 a 70 anos - Grupo de risco médio",
                "Categoria 9 - 65 a 70 anos - Grupo de risco alto",
        };

        System.out.print("Digite o nome: ");
        String nome = lerValor.nextLine();

        System.out.print("Digite a idade: ");
        int idade = lerValor.nextInt();

        System.out.print("Digite o grupo de risco (1-Baixo, 2-Médio, 3-Alto): ");
        int grupoRisco = lerValor.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("A idade não está na faixa necessária.");
            return;
        }

        if (idade >= 17 && idade <= 20) {
            numCategoria = (grupoRisco - 1) * 3;
        } else if (idade >= 21 && idade <= 24) {
            numCategoria = (grupoRisco - 1) * 3 + 1;
        } else if (idade >= 25 && idade <= 34) {
            numCategoria = 6;
        } else if (idade >= 35 && idade <= 64) {
            numCategoria = 7;
        } else {
            numCategoria = 8;
        }

        System.out.println("Nome do pretendente: " + nome);
        System.out.println("Idade do pretendente: " + idade);
        System.out.println("Categoria do pretendente: " + categoriasSeguro[numCategoria]);
    }
}
