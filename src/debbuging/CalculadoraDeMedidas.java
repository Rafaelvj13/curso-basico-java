package debbuging;

import java.util.Scanner;

public class CalculadoraDeMedidas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calcularMediaTurma(alunos, scan);

        System.out.printf("Média da turma: %.2f", media); // Formata a saída para duas casas decimais

        scan.close(); // Fecha o Scanner para liberar recursos
    }

    public static double calcularMediaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}

