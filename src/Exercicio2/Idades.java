package Exercicio2;

import java.util.Scanner;
public class Idades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();

        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        System.out.println("Digite a idade da terceira pessoa: ");
        int idade3 = sc.nextInt();

        System.out.println("Digite a idade da quarta pessoa: ");
        int idade4 = sc.nextInt();

        System.out.println("Digite a idade da quinta pessoa: ");
        int idade5 = sc.nextInt();

        //Pessoa mais nova
        if (idade1 < idade2 && idade1 < idade3 && idade1 < idade4 && idade1 < idade5) {
            System.out.println("A pessoa mais nova tem: " + idade1 + " anos");

        }
        else if (idade2 < idade1 && idade2 < idade3 && idade2 < idade4 && idade2 < idade5) {
            System.out.println("A pessoa mais nova tem: " + idade2 + " anos");

        }

        else if (idade3 < idade1 && idade3 < idade2 && idade3 < idade4 && idade3 < idade5) {
            System.out.println("A pessoa mais nova tem " + idade3 + " anos");
        }

        else if(idade4 < idade1 && idade4 < idade2 && idade4 < idade3 && idade4 < idade5){
            System.out.println("A pessoa mais nova tem " + idade4 + " anos");
        }

        else if(idade5 < idade1 && idade5 < idade2 && idade5 < idade3 && idade5 < idade4){
            System.out.println("A pessoa mais nova tem " + idade5 + " anos");
        }

        //Pessoa mais velha
        if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4 && idade1 > idade5) {
            System.out.println("A pessoa mais velha tem: " + idade1 + " anos");
        }

        else if (idade2 > idade1 && idade2 > idade3 && idade2 > idade4 && idade2 > idade5) {
            System.out.println("A pessoa mais velha tem: " + idade2 + " anos");

        }

        else if (idade3 > idade1 && idade3 > idade2 && idade3 > idade4 && idade3 > idade5) {
            System.out.println("A pessoa mais velha tem: " + idade3 + " anos");

        }

        else if (idade4 > idade1 && idade4 > idade2 && idade4 > idade3 && idade4 > idade5) {
            System.out.println("A pessoa mais velha tem: " + idade3 + " anos");

        }

        else if (idade5 > idade1 && idade5 > idade2 && idade5 > idade3 && idade5 > idade4) {
            System.out.println("A pessoa mais velha tem: " + idade3 + " anos");

        }

        //Média de idade
        int mediaDeIdade = (idade1+idade2+idade3+idade4+idade5)/5;
        System.out.println("A média de idade é: " + mediaDeIdade);
    }
}