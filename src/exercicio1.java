
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        //Escreva um programa em Java que preencha um vetor de 10 posições com valores
        //fornecidos pelo usuário. Imprima no vídeo o maior e o menor valor armazenado.
        //Observação: maior valor inteiro é Integer.MAX_VALUE e o menor valor inteiro é
        //Integer.MIN_VALUE


        Scanner sc = new Scanner(System.in);
        int [ ] x = new int [5];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        //armazenar 5 valores recebidos pelo teclado
        for (int i = 0; i < 5 /* ou x. length*/; i++) {
            System.out.println("Valor:");
            x[i] = sc.nextInt();

            if (x[i] > maior) {
                maior = x[i];
            }

            if (x[i] < menor) {
                menor = x[i];
            }
        }

        System.out.println("maior valor" + maior);
        System.out.println("menor valor" + menor);



    }
}
