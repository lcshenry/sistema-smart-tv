package smart;

import java.util.Locale;
 import java.util.Scanner;
public class Conta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        String firstName = "Lucas";
        String lastName = "Henrique";
        int actualYear = 2023;
        int birthday = 1999;
        int age = actualYear - birthday;

        //Forma diferente para printar nome na tela, porem sem interação;
        System.out.println("Me chamo" + " " + firstName + " " + lastName);
        System.out.println("Tenho" + " " + age + " " + "anos");

        /**
         * 1 -> import java.util.Locale;
         * 2 -> import java.util.Scanner;
         * 3 -> Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
         * 4 -> String "nome" = scanner.next();
         * 5 -> int "nome" = scanner.nextInt();
         * 6 -> double "nome" = scanner.nextDouble();
         */
        //print de forma interativa atraves do scanner
        System.out.println("Qual o seu nome? :");
        String name = scanner.next();
        System.out.println("Qual o seu sobrenome? :");
        String lastname = scanner.next();
        System.out.println("Qual a sua idade? :");
        int years = scanner.nextInt();
        System.out.println("Qual o ano de nascimento? :");
        int birth = scanner.nextInt();
        System.out.println("Tipo de double? :");
        double tipo = scanner.nextDouble();

    }
}