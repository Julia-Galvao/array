import java.util.Random;

public class exemplo2 {
    public static void main(String[] args) {
        Random rd = new Random();

        /* double aux = Math.random()*10;
        int valor = (int)aux;
        System.out.println(aux);
       */

        int x = rd.nextInt()%20;
        System.out.println(x);




    }
}
