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
        short numeroDeMissoes = 14;

        if (numeroDeMissoes >= 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
