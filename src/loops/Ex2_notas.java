package loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja invalido
e continue pedindo
ate que o usuario informe um valor valido.
 */
public class Ex2_notas {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida! Digite novamente: ");
            nota = scan.nextInt();
        }

    }

}
