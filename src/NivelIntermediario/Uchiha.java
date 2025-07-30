package NivelIntermediario;

public class Uchiha extends Ninja {
    String habilidadeEspecial;
    public Uchiha(String nome, int idade,String missao,String nivelDificuldade,String statusMissao, String habilidadeEspecial) {

        super(nome, idade, missao, nivelDificuldade, statusMissao);
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("A habilidade especial é " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        this.mostrarHabilidadeEspecial();
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }
}
