package loops;
import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores, o primeiro
representando o nome do aluno e o segundo representando sua idade.
(Pare inserindo o valor 0 no campo nome)
 */
public class Ex1_nomeIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameOf;
        int ageOf;

        while (true){
            System.out.println("Nome: ");
            String name = scan.next();
            if(name.equals("0")) break;

            System.out.println("Idade: ");
            int age = scan.nextInt();
        }

    }
}
