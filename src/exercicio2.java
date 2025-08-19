
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        //Escreva um programa em Java que preencha um vetor de 10 posições com
        // valores fornecidos pelo usuário. Imprima no vídeo a quantidade de
        // números pares e ímpares digitados.

        Scanner sc = new Scanner(System.in);
        int [ ] x = new int [5];


        //armazenar 5 valores recebidos pelo teclado

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um valor:");
            x[i] = sc.nextInt();


        }

    }
}
