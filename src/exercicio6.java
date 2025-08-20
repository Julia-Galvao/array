import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total;
        boolean especial = true;

        System.out.print("Total: ");
        total = sc.nextInt();

        int [] x = new int[total];

        for (int i = 0; i <x.length; i++) {
            System.out.println("valor --> ");
            x[i] = sc.nextInt();
        }

        for (int  i = 0; i < x.length-1; i++){
            if(x[i] % 2 == x[i + 1] % 2) {
                especial = false;
                break;
            }
        }
        if (especial){
            System.out.println("Array especial");
        }
        else {
            System.out.println("Array não especial");
        }
    }
}
