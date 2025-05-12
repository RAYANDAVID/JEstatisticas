import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        JOptionPane.showMessageDialog(null, "Óla jardim!");

        double totalArea = 0.0;
        int totalJardins = 0;
        int jardinsGrandes = 0;
        int totalServicos = 0;
        double valorTotal = 0.0;

        double[] areasJardim = new double[100];


        String nome, endereco, cont, nomeJardim;
        do {
            nomeJardim = JOptionPane.showInputDialog("Digite o nome do jardim: ");
            endereco = JOptionPane.showInputDialog("Digite o endereço do jardim: ");
            double largura = Double.parseDouble(JOptionPane.showInputDialog("Qual a largura do seu jardim (em metros): "));
            double comp = Double.parseDouble(JOptionPane.showInputDialog("Qual o comprimento (em metros): "));
            double area = largura * comp;

            areasJardim[totalJardins] = area;
            totalArea += area;
            totalJardins++;

            if (area > 100.0) {
                jardinsGrandes++;
            }

            JOptionPane.showMessageDialog(null,
                    "Nome do Jardim: " + nomeJardim + "\nEndereço: " + endereco + "\nLargura: " + largura + 
                    "\nComprimento: " + comp + "\nÁrea do Jardim: " + area);

            String escolhaServico = null;
            do {
                int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um serviço para o jardim: \n1-Manutenção Regular \n2-Paisagismo \n3-Irrigação Automática"));

                switch (op) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Serviço de Manutenção Regular escolhido.");
                        valorTotal += 100;  
                        totalServicos++;
                        break;

                    case 2:
                        JOptionPane.showMessageDialog(null, "Serviço de Paisagismo escolhido.");
                        valorTotal += 150;  
                        totalServicos++;
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "Serviço de Irrigação Automática escolhido.");
                        valorTotal += 200; 
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida! Tente novamente.");
                        continue;  
                }

                escolhaServico = JOptionPane.showInputDialog("Deseja escolher outro serviço para este jardim? \nS-Sim ou N-Não");
            } while (escolhaServico.equalsIgnoreCase("S"));


            cont = JOptionPane.showInputDialog("Deseja cadastrar outro jardim? \nS-Sim ou N-Não");
        } while (cont.equalsIgnoreCase("S"));

        double mediaArea = totalArea / totalJardins;

        double desconto = 0.0;
        if (totalServicos == 1) {
            desconto = valorTotal * 0.05;  // 5% de desconto
        } else if (totalServicos == 2) {
            desconto = valorTotal * 0.10;  // 10% de desconto
        } else if (totalServicos >= 3) {
            desconto = valorTotal * 0.15;  // 15% de desconto
        }

        //Moda
        Map<Double, Integer> frequencia = new HashMap<>();
        for(int i = 0; i < totalJardins; i++) {
            double area = areasJardim[i];
            frequencia.put(areasJardim[i], frequencia.getOrDefault(areasJardim[i], 0) + 1);
        }

        int macfreq = Collections.max(frequencia.values());
        
        List<Double> modas = new ArrayList<>();
        for (Map.Entry<Double, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() == macfreq) {
                modas.add(entry.getKey());
            }
        }
        String modaStr = modas.size() == 1 ?  "Moda da área dos jardins: " + modas.get(0) : "Modas da área dos jardins: " + modas + " m² (empate)";    

        double valorComDesconto = valorTotal - desconto;

        JOptionPane.showMessageDialog(null,
                "Total de jardins cadastrados: " + totalJardins + "\nTotal de jardins grandes: " + jardinsGrandes +
                "\nMédia da área dos jardins: " + mediaArea + "\n" + modaStr + "\nTotal de serviços escolhidos: " + totalServicos +
                "\nValor Total: R$ " + valorTotal + "\nDesconto: R$ " + desconto + "\nValor com Desconto: R$ " + valorComDesconto);

        JOptionPane.showMessageDialog(null, "Encerrando Sistema");
    }
}
