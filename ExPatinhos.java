package ExercicioLista3;

import java.util.Scanner;

public class ExPatinhos {
    public static void main(String [] args){

    Scanner input = new Scanner(System.in);

    int patinho;


System.out.println("Digite o n�mero de patinhos: ");
    patinho = input.nextInt();

    int count = patinho;

while (patinho>=1) {
        System.out.println(patinho+ " patinho" + "foram passear\n" +
                "Al�m das montanhas\n" +
                "Para brincar\n" +
                "A mam�e gritou: Qu�, qu�, qu�, qu�, Mas s�\n " +
                (patinho-1) + " patinhos voltaram de l�.");
        patinho--;
    }

    {

        System.out.println("A mam�e patinha foi procurar\n" +
                "Al�m das montanhas\n" +
                "Na beira do mar\n" +
                "A mam�e gritou: Qu�, qu�, qu�, qu�\n" +
                "E os " + (count--)+ " patinhos voltaram de l�.");
        count--;
    }
}
}

