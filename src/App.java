import javax.swing.JOptionPane;
import java.util.*;

public class App {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Olá jardim!");

        int totalJardins = 0;
        int jardinsGrandes = 0;
        int totalServicos = 0;
        double valorTotal = 0.0;

        double[] areasJardim = new double[100];
        double[] valoresServicos = new double[3];
        String[] nomesServicos = {"Manutenção Regular", "Paisagismo", "Irrigação Automática"};

        String nomeJardim, endereco, cont, escolhaServico = null;

        do {
            nomeJardim = JOptionPane.showInputDialog("Digite o nome do jardim:");
            endereco = JOptionPane.showInputDialog("Digite o endereço do jardim:");
            
            double largura = Double.parseDouble(JOptionPane.showInputDialog("Qual a largura do seu jardim (em metros):"));
            double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Qual o comprimento (em metros):"));
            double area = calcularArea(largura, comprimento);

            areasJardim[totalJardins] = area;
            totalJardins++;

            if (area > 100.0) {
                jardinsGrandes++;
            }

            exibirDadosCliente(nomeJardim, endereco, largura, comprimento, area);

            do {
                int op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Escolha um serviço para o jardim:\n1 - Manutenção Regular\n2 - Paisagismo\n3 - Irrigação Automática"));
                
                if (op >= 1 && op <= 3) {
                    double valorServico = (op == 1) ? 100 : (op == 2) ? 150 : 200;
                    valoresServicos[op - 1] += valorServico;
                    valorTotal += valorServico;
                    totalServicos++;

                    JOptionPane.showMessageDialog(null, "Serviço de " + nomesServicos[op - 1] + " escolhido.");
                } else {
                    JOptionPane.showMessageDialog(null, "Opção Inválida! Tente novamente.");
                    continue;
                }

                escolhaServico = JOptionPane.showInputDialog("Deseja escolher outro serviço para este jardim? (S/N)");
            } while (escolhaServico.equalsIgnoreCase("S"));

            cont = JOptionPane.showInputDialog("Deseja cadastrar outro jardim? (S/N)");
        } while (cont.equalsIgnoreCase("S"));

        // Ordenar serviços por valor (troca duplas)
        for (int i = 0; i < valoresServicos.length - 1; i++) {
            for (int j = i + 1; j < valoresServicos.length; j++) {
                if (valoresServicos[i] > valoresServicos[j]) {
                    double tempValor = valoresServicos[i];
                    valoresServicos[i] = valoresServicos[j];
                    valoresServicos[j] = tempValor;

                    String tempNome = nomesServicos[i];
                    nomesServicos[i] = nomesServicos[j];
                    nomesServicos[j] = tempNome;
                }
            }
        }

        double mediaArea = calcularMedia(areasJardim, totalJardins);

        // Moda da área
        Map<Double, Integer> frequencia = new HashMap<>();
        for (int i = 0; i < totalJardins; i++) {
            double area = areasJardim[i];
            frequencia.put(area, frequencia.getOrDefault(area, 0) + 1);
        }

        int maxFreq = Collections.max(frequencia.values());
        List<Double> modas = new ArrayList<>();
        for (Map.Entry<Double, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() == maxFreq) {
                modas.add(entry.getKey());
            }
        }

        String modaStr = (modas.size() == 1)
            ? "Moda da área dos jardins: " + modas.get(0) + " m²"
            : "Modas da área dos jardins: " + modas + " m² (empate)";

        // Desconto baseado em número de serviços
        double desconto = 0.0;
        if (totalServicos == 1) {
            desconto = valorTotal * 0.05;
        } else if (totalServicos == 2) {
            desconto = valorTotal * 0.10;
        } else if (totalServicos >= 3) {
            desconto = valorTotal * 0.15;
        }

        double valorComDesconto = valorTotal - desconto;

        StringBuilder servicosOrdenados = new StringBuilder("Serviços ordenados por valor:\n");
        for (int i = 0; i < nomesServicos.length; i++) {
            servicosOrdenados.append(nomesServicos[i])
                             .append(" - R$ ")
                             .append(valoresServicos[i])
                             .append("\n");
        }

        JOptionPane.showMessageDialog(null,
            "Total de jardins cadastrados: " + totalJardins +
            "\nTotal de jardins grandes: " + jardinsGrandes +
            "\nMédia da área dos jardins: " + String.format("%.2f", mediaArea) +
            "\n" + modaStr +
            "\nValor Total: R$ " + String.format("%.2f", valorTotal) +
            "\nDesconto: R$ " + String.format("%.2f", desconto) +
            "\nValor com Desconto: R$ " + String.format("%.2f", valorComDesconto) +
            "\n\n" + servicosOrdenados);

        JOptionPane.showMessageDialog(null, "Encerrando Sistema");
    }

    // Função para calcular área
    public static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }

    //Função para exibir dados do cliente
    public static void exibirDadosCliente(String nome, String endereco, double largura, double comprimento, double area) {
        JOptionPane.showMessageDialog(null,
            "Nome do Jardim: " + nome +
            "\nEndereço: " + endereco +
            "\nLargura: " + largura +
            "\nComprimento: " + comprimento +
            "\nÁrea do Jardim: " + area + " m²");
    }

    // Função para calcular média de áreas
    public static double calcularMedia(double[] vetor, int total) {
        double soma = 0;
        for (int i = 0; i < total; i++) {
            soma += vetor[i];
        }
        return soma / total;
    }
}
