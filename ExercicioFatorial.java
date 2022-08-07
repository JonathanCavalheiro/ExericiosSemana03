package ExercicioLista3;

import java.util.Scanner;

public class ExercicioFatorial {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);


        double nrFatorial;
        int i = 1;
        double fatorial = 1;

        System.out.println("Informe um número parar cacular o fatorial: ");
            nrFatorial = input.nextDouble();

        while (i<= nrFatorial) {
            fatorial = fatorial *i;
            i++;
        }
        System.out.println("O fatorial de "+nrFatorial+ " é " +fatorial);
    }
}
