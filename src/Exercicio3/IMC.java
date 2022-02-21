package Exercicio3;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso da primeira pessoa: ");
        int peso1 = sc.nextInt();
        System.out.println("Digite a altura da primera pessoa: ");
        double altura1 = sc.nextDouble();

        System.out.println("Digite o peso da segunda pessoa: ");
        int peso2 = sc.nextInt();
        System.out.println("Digite a altura da segunda pessoa: ");
        double altura2 = sc.nextDouble();

        System.out.println("Digite o peso da terceira pessoa: ");
        int peso3 = sc.nextInt();
        System.out.println("Digite a altura da terceira pessoa: ");
        double altura3 = sc.nextDouble();

        System.out.println("Digite o peso da quarta pessoa: ");
        int peso4 = sc.nextInt();
        System.out.println("Digite a altura da quarta pessoa: ");
        double altura4 = sc.nextDouble();

        System.out.println("Digite o peso da quinta pessoa: ");
        int peso5 = sc.nextInt();
        System.out.println("Digite a altura da quinta pessoa: ");
        double altura5 = sc.nextDouble();

        double imcPessoa1 = peso1 / (altura1 * altura1);
        System.out.println();
        double imcPessoa2 = peso2 / (altura2 * altura2);
        double imcPessoa3 = peso3 / (altura3 * altura3);
        double imcPessoa4 = peso4 / (altura4 * altura4);
        double imcPessoa5 = peso5 / (altura5 * altura5);
    }
}
