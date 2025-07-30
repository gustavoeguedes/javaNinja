package NivelIntermediario;

public class Uzumaki extends Ninja{
    Uzumaki(String nome, int idade,String missao, String nivelDificuldade, String status) {
        super(nome, idade, missao, nivelDificuldade, status);
    }

    public void descricao() {
        System.out.println("tem muito chakara");
    }
}
