import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        int qtd;
        double total = 0.0;
        double maiorSalario = 0;
        int posicao = 0;

        System.out.println("Informe a quantidade de funcioanários: ");
        qtd = sc.nextInt();

        String [] nome = new String [qtd];
        double [] salario = new double[qtd];

        //entrada de dados
        for (int i = 0; i < qtd; i++){
            System.out.print("Informe o nome do funcionário: ");
            nome [i] = sc.next();

            System.out.print("Informe o salário do Sr(a) " + nome[i] + " --> ");
            salario[i] = sc.nextDouble();
            System.out.println();

            total = total + salario[i];

            if (salario[i] > maiorSalario){
                maiorSalario = salario[i];
                posicao = i;
            }

        }
        System.out.println("Total da folha de pagamento: R$ " + df.format(total));
        System.out.println("Média salarial: R$ " + df.format(total/qtd));
        System.out.println("Fucionário com o maior salário: " +nome[posicao]);





    }
}
