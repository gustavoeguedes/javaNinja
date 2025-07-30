package NivelIntermediario;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;

    public Ninja(String nome, int idade,String missao,String nivelDificuldade,String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("missao = " + missao);
        System.out.println("nivelDificuldade = " + nivelDificuldade);
        System.out.println("statusMissao = " + statusMissao);
    }
}
