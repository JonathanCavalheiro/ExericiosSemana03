package ExercicioLista3;

import java.util.Scanner;

public class ExPatinhos {
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int patinho;


System.out.println("Digite o número de patinhos: ");
    patinho = input.nextInt();

    int count = patinho;

while (patinho>=1) {
        System.out.println(patinho+ " patinho" + "foram passear\n" +
                "Além das montanhas\n" +
                "Para brincar\n" +
                "A mamãe gritou: Quá, quá, quá, quá, Mas só\n " +
                (patinho-1) + " patinhos voltaram de lá.");
        patinho--;
    }

    {

        System.out.println("A mamãe patinha foi procurar\n" +
                "Além das montanhas\n" +
                "Na beira do mar\n" +
                "A mamãe gritou: Quá, quá, quá, quá\n" +
                "E os " + (count--)+ " patinhos voltaram de lá.");
        count--;
    }
}
}

