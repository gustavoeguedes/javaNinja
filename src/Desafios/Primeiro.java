package Desafios;

public class Primeiro {

    public static void main(String[] args) {
        String nomeNinja1 = "Naruto";
        String nomeNinja2 = "Sasuke";
        String nomeNinja3 = "Sakura";

        String aldeiaNinja1 = "Aldeida da folha";
        String aldeiaNinja2 = "Aldeida da folha";
        String aldeiaNinja3 = "Aldeida da folha";

        int idadeNinja1 = 16;
        int idadeNinja2 = 16;
        int idadeNinja3 = 14;

        char missaoNinja1 = 'S';
        char missaoNinja2 = 'A';
        char missaoNinja3 = 'D';

        boolean missaoConcluidaNinja1;
        boolean missaoConcluidaNinja2;
        boolean missaoConcluidaNinja3;

        if( idadeNinja1 < 15 && (missaoNinja1 != 'D' || missaoNinja1 != 'C')  ) {
            missaoConcluidaNinja1 = false;

        } else {
            missaoConcluidaNinja1 = true;
        }

        if( idadeNinja2 < 15 && (missaoNinja2 != 'D' || missaoNinja2 != 'C')  ) {
            missaoConcluidaNinja2 = false;

        } else {
            missaoConcluidaNinja2 = true;
        }

        if( idadeNinja3 < 15 && (missaoNinja3 != 'D' || missaoNinja3 != 'C')  ) {
            missaoConcluidaNinja3 = false;

        } else {
            missaoConcluidaNinja3 = true;
        }

        System.out.println("Nome: " + nomeNinja1  );
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Concluiu a missão? " + (missaoConcluidaNinja1 ? "sim" : "não"));
        System.out.println("_______________________________");
        System.out.println("Nome: " + nomeNinja2  );
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Concluiu a missão? " + (missaoConcluidaNinja2 ? "sim" : "não"));
        System.out.println("_______________________________");
        System.out.println("Nome: " + nomeNinja3  );
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Concluiu a missão? " + (missaoConcluidaNinja3 ? "sim" : "não"));
        System.out.println("_______________________________");
    }


}
