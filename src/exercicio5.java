import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total,aux;

        System.out.print("Total: ");
        total = sc.nextInt();

        int [] x = new int[total];

        //entrada de dados
        for(int i = 0; i < x.length; i++) {
            System.out.println("Valor: ");
            x[i] = sc.nextInt();
        }

        // antes da inversão

        System.out.println("\nDados antes da inversão: ");
        for(int i = 0; i <x.length; i++) {
            System.out.print(x[i]+ " ");
        }

        // inversão
        for(int i = 0; i < x.length/2; i++) {
            aux = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = aux;
        }

        System.out.println("\nDados depois da inversão: ");
        for(int i = 0; i <x.length; i++) {
            System.out.print(x[i]+ " ");
        }
    }
}
