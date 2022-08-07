package ExercicioLista3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class S04Agenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> telefones = new HashSet<>();
        int quantidadeNumeros = 5;
        int opcaoUsuario = 0;

        do {
            System.out.println("\n1 - Cadastrar Telefone\n2 - Listar telefone\n3 - Sair");
            opcaoUsuario = scanner.nextInt();
            switch(opcaoUsuario) {
                case 1:
                    System.out.println("Informe o número de telefone:");
                    String numeroTelefone = scanner.next();
                    if(telefones.size() < quantidadeNumeros) {
                        telefones.add(numeroTelefone);
                        System.out.printf("Telefone salvo com sucesso!");
                        System.out.printf("Ainda restam "
                                + (quantidadeNumeros-telefones.size())+ " para armazenar.");
                    } else {
                        System.out.println("Não há espaço em memória");
                    }
                    break;
                case 2:
                    telefones.forEach(tel -> {
                        System.out.println(tel);
                    });
                    break;
            }
        }while(opcaoUsuario != 3);

    }
}
