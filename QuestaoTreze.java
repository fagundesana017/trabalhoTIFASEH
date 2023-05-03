import java.util.Scanner;

public class QuestaoTreze {

    String nome;
    int matricula;
    double media;
    double nota1 = 0.00;
    double nota2 = 0.00;
    double trabalho = 0.00;

    public static void main(String[] args) {
        QuestaoTreze aluno = new QuestaoTreze(123, "Léo", 8, 1, 5);
        System.out.println("Aluno " + aluno + aluno.resultado());
    }

    public QuestaoTreze(int matricula, String nome, double nota1, double nota2, double trabalho){
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }

    public double media() {
        media = ((nota1 * 2.5) + (nota2 * 2.5) + (trabalho * 2)) / (2 + 2.5);
        System.out.println("Média final do aluno  é " + media);

        return media;
    }

    public double resultado() {
        double notaFinal = media();

        if (notaFinal < 2.5 && notaFinal >= 5){
            return 0;
        }
        else {
            return 10 - notaFinal;
        }
    }



}
