package Condicoes;

import java.util.Scanner;

public class ScannersDoUsuario {
    public static void main(String[] args) {


        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite o nome do ninja");
        String nomeDoNinja = caixaDeTexto.nextLine();

        System.out.println("O nome do ninja é " + nomeDoNinja);

        System.out.println("Digite a idade do ninja");
        int idadeDoNinja = caixaDeTexto.nextInt();

        System.out.println("A idade do ninja é " + idadeDoNinja);

        if(idadeDoNinja >= 18) {
            System.out.println("Este ninja é maior de idade e já pode executar missões fora da aldeia");
        } else {
            System.out.println("este ninja é muito novo, tem que cumprir missões dentro da vila");
        }



        caixaDeTexto.close();
    }
}
