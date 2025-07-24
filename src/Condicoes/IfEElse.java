package Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        /*
        * IF e ELSE - condições
        * objetivo: passar o ninja de nivel de acordo com o numero de missoes
        *  */
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 4;

        if (numeroDeMissoes > 10) {
            System.out.println("Passa essa porra de nível");
        } else {
            System.out.println("não passa de nível");
        }
    }
}
