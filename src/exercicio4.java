import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        System.out.println("Por favor, insira a temperatura média de cada mês do ano passado:");

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura de " + nomesMeses[i] + ": ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
        }

        double somaTemperaturas = 0;
        for (double temp : temperaturas) {
            somaTemperaturas += temp;
        }

        double mediaAnual = somaTemperaturas / 12;
        System.out.printf("\nMédia anual das temperaturas: %.2f°C\n", mediaAnual);

        System.out.println("\nTemperaturas acima da média anual:");
        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > mediaAnual) {
                System.out.printf("%s: %.2f°C\n", nomesMeses[i], temperaturas.get(i));
            }
        }

        scanner.close();
    }
}
