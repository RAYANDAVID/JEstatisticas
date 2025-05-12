import javax.swing.JOptionPane;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Óla jardim!");

        double totalArea = 0.0;
        int totalJardins = 0;
        int jardinsGrandes = 0;
        int totalServicos = 0;
        double valorTotal = 0.0;

        double[] areasJardim = new double[100];
        double[] valoresServicos = new double[3]; // Vetor para armazenar os valores dos serviços
        String[] nomesServicos = { "Manutenção Regular", "Paisagismo", "Irrigação Automática" };

        String nomeJardim, endereco, cont, escolhaServico = null;
        do {
            nomeJardim = JOptionPane.showInputDialog("Digite o nome do jardim: ");
            endereco = JOptionPane.showInputDialog("Digite o endereço do jardim: ");

            double largura = Double.parseDouble(JOptionPane.showInputDialog("Qual a largura do seu jardim (em metros): "));
            double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Qual o comprimento (em metros): "));

            // Chamando a função para calcular a área
            double area = calcularArea(largura, comprimento);


            areasJardim[totalJardins] = area;
            totalArea += area;
            totalJardins++;

            if (area > 100.0) {
                jardinsGrandes++;
            }

            JOptionPane.showMessageDialog(null,
                    "Nome do Jardim: " + nomeJardim + "\nEndereço: " + endereco + "\nLargura: " + largura +
                            "\nComprimento: " + comprimento + "\nÁrea do Jardim: " + area);

            // Armazenando os valores dos serviços escolhidos
            do {
                int op = Integer.parseInt(JOptionPane.showInputDialog(
                        "Escolha um serviço para o jardim: \n1-Manutenção Regular \n2-Paisagismo \n3-Irrigação Automática"));
                switch (op) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Serviço de Manutenção Regular escolhido.");
                        valoresServicos[0] += 100;
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Serviço de Paisagismo escolhido.");
                        valoresServicos[1] += 150;
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Serviço de Irrigação Automática escolhido.");
                        valoresServicos[2] += 200;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida! Tente novamente.");
                        continue;
                }

                escolhaServico = JOptionPane
                        .showInputDialog("Deseja escolher outro serviço para este jardim? \nS-Sim ou N-Não");
            } while (escolhaServico.equalsIgnoreCase("S"));

            cont = JOptionPane.showInputDialog("Deseja cadastrar outro jardim? \nS-Sim ou N-Não");
        } while (cont.equalsIgnoreCase("S"));

        // Ordenando os serviços
        for (int i = 0; i < valoresServicos.length - 1; i++) {
            for (int j = i + 1; j < valoresServicos.length; j++) {
                if (valoresServicos[i] > valoresServicos[j]) {
                    // Trocar os valores dos serviços
                    double tempValor = valoresServicos[i];
                    valoresServicos[i] = valoresServicos[j];
                    valoresServicos[j] = tempValor;
                    // Trocar os nomes dos serviços correspondentes
                    String tempNome = nomesServicos[i];
                    nomesServicos[i] = nomesServicos[j];
                    nomesServicos[j] = tempNome;
                }
            }
        }

        double mediaArea = totalArea / totalJardins;

        // Cálculo da Moda das Áreas dos Jardins
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

        String modaStr;
        if (modas.size() == 1) {
            modaStr = "Moda da área dos jardins: " + modas.get(0) + " m²";
        } else {
            modaStr = "Modas da área dos jardins: " + modas + " m² (empate)";
        }

        double desconto = 0.0;
        if (totalServicos == 1) {
            desconto = valorTotal * 0.05; // 5% de desconto
        } else if (totalServicos == 2) {
            desconto = valorTotal * 0.10; // 10% de desconto
        } else if (totalServicos >= 3) {
            desconto = valorTotal * 0.15; // 15% de desconto
        }

        double valorComDesconto = valorTotal - desconto;

        // Exibindo os serviços ordenados por valor
        StringBuilder servicosOrdenados = new StringBuilder("Serviços ordenados por valor (crescentes):\n");
        for (int i = 0; i < valoresServicos.length; i++) {
            servicosOrdenados.append(nomesServicos[i] + " - R$ " + valoresServicos[i] + "\n");
        }

        JOptionPane.showMessageDialog(null,
                "Total de jardins cadastrados: " + totalJardins + "\nTotal de jardins grandes: " + jardinsGrandes +
                        "\nMédia da área dos jardins: " + mediaArea + "\n" + modaStr +
                        "\nValor Total: R$ " + valorTotal + "\nDesconto: R$ " + desconto + "\nValor com Desconto: R$ "
                        + valorComDesconto +
                        "\n\n" + servicosOrdenados.toString());

        JOptionPane.showMessageDialog(null, "Encerrando Sistema");
    }

    // Função para calcular a área do jardim
    public static double calcularArea(double largura, double comprimento) {
        return largura * comprimento;
    }
}