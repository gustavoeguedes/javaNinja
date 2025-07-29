package NivelBasico;

public class Array {
    public static void main(String[] args) {

        String[] ninjas = new String[3];

        ninjas[0] = "Naruto";
        ninjas[1] = "Sasuke";
        ninjas[2] = "Sakura";

        ninjas = new String[6];


        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("Ninja: " + ninjas[i]);
        }

    }
}
