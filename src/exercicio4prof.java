import java.util.Scanner;

public class exercicio4prof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        double[] temperatura = new double[mes.length];
        double media = 0;

        //entrada das temperaturas
        for(int i = 0; i < temperatura.length; i++) {
            System.out.print("temperatura de " + mes[i] + " -->");
            temperatura[i] = sc.nextDouble();
            media = media + temperatura[i];
        }
        //calculo media

        media = media / mes.length;
        System.out.print("temperatura media anual: " + media);

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] >media) {
                System.out.println(mes[i] + " --> " + temperatura[i]);
            }
        }
    }
}
