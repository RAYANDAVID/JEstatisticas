import java.util.Arrays;

public class Estatisticas {

    private double[] dados;

    public Estatisticas(double[] dados) {
        this.dados = dados;
        Arrays.sort(this.dados);
    }

    public double calcularMedia() {
        double soma = 0;
        for (double valor : dados) {
            soma += valor;
        }
        return soma / dados.length;
    }

    public double calcularMediana() {
        int n = dados.length;
        if (n % 2 == 0) {
            return (dados[n / 2 - 1] + dados[n / 2]) / 2.0;
        } else {
            return dados[n / 2];
        }
    }

    public double calcularModa() {
        double moda = dados[0];
        int maxCount = 0;
        int count = 1;

        for (int i = 1; i < dados.length; i++) {
            if (dados[i] == dados[i - 1]) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    moda = dados[i - 1];
                }
                count = 1;
            }
        }

        // Verifica o último valor
        if (count > maxCount) {
            moda = dados[dados.length - 1];
        }

        return moda;
    }

    public double obterMaximo() {
        return dados[dados.length - 1];
    }

    public double obterMinimo() {
        return dados[0];
    }
}
