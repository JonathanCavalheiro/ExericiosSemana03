package ExercicioLista3;

import java.util.*;

public class ExercicioMedias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Double> notas = new ArrayList<>();
        int quantidadeNotas;
        int opcaoUsuario;
        int opcaoMenu2;
        int totalNotas = 0;
        double notaUsuario =0;
        double somatorio = 0;

            System.out.println("Informe a quantidade de notas: ");
                totalNotas = input.nextInt();

        do{
            System.out.println("\n1 - Adicionar nota\n2 - Calcular M�dia\n3 - Sair");
                opcaoUsuario = input.nextInt();
        switch (opcaoUsuario){
            case 1:
                System.out.println("Informe a nota:");

                notaUsuario = input.nextDouble();
                notas.add(notaUsuario);
                somatorio += notaUsuario;
            break;
            case 2:
                System.out.println("1 - M�dia parcial\n2 - M�dia Completa");
                    opcaoMenu2 = input.nextInt();
                    switch (opcaoMenu2){
                        case 1:
                            if (notas.isEmpty()){
                                System.out.println("N�o � poss�vel calcular notas com arquivo de notas vazio!!!!");
                            } else {
                               double mediaParcial = somatorio/totalNotas;
                                System.out.println("A m�dia parcial do aluno � "+mediaParcial);
                            }
                        case 2:
                            if (notas.size() == totalNotas) {
                                double mediaFinal = somatorio/notas.size();
                                System.out.println("M�dia final do aluno � "+mediaFinal);
                            } else{
                                System.out.println("Informe o n�mero total de notas para " +
                                        "obter o c�lculo");
                            }
                            }


        }
        } while (opcaoUsuario != 3);
        }
    }


