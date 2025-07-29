package Desafios;

import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {

        int NUMERO_MAX = 3;
        String[] ninjas = new String[NUMERO_MAX];
        int ninjasCadastrados = 0;

        int opcao;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha uma opção");
            System.out.println("1 - cadastrar ninja");
            System.out.println("2 - listar ninjas");
            System.out.println("3 - encerrar programa");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    if(ninjasCadastrados >= NUMERO_MAX) {
                        System.out.println("numero máximo atingido");
                        break;
                    }
                    System.out.println("digite o nome do ninja:");
                    String ninja = scanner.nextLine();
                    ninjas[ninjasCadastrados] = ninja;
                    ninjasCadastrados++;
                    System.out.println("Ninja: " + ninja + " cadastrado com sucesso!");
                    break;
                case 2:
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null) {
                            break;
                        }
                        int ninjaNumero = i + 1;
                        System.out.println(ninjaNumero + " - " + ninjas[i]);

                    }
                    break;
                case 3:
                    System.out.println("encerrando a aplicação");
                    scanner.close();
                    break;
                default:
                    System.out.println("insira uma opção válida");
            }
        }while (opcao != 3);
    }
}
