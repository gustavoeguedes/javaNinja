package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
//    tudo que for digitado aqui dentro com o comando PSVM vai ser compilado pelo java

       /*
       * dados não primitivos: String, Array, Class, enum
       * objetivo: criar um ninja e atribuir um método a ele
       * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // vai colocar tudo em capslock
        System.out.println("Esse texto esta em capslock: " + nomeUpperCase);
        System.out.println("Esse texto normal: " + nome);
    }
}
