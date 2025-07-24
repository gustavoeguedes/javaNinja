package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * dados primitivos - int, double, float, char, boolean, short
        * objetivo da aula: Criar um ninja - Naruto
        *
        * */

        int idade = 16; // Valor maximo: 2 147 483 647
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = false;
        Long saldoBancario = 999999L; // Valor máximo: 9 223 272 036 854 775 807

        System.out.println(vivoOuMorto ? "TA vido" : "morreu"); // comando para mostrar  ao usuario
        System.out.println(saldoBancario);
        System.out.println("vivoOuMorto = " + vivoOuMorto);
    }
}


