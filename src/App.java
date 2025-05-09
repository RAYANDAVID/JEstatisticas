import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Óla jardim!");
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Qual a largura do seus jardim (em metros): "));
        double comp = Double.parseDouble(JOptionPane.showInputDialog("Qual o comprimento(em metros): "));
        Double area = largura * comp;
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + "\nEndereço: " + endereco + "\nLargura: " + largura + "\nComprimento: " + comp
                        + "\nÁrea do jardim: " + area);

        if (area <= 50.0) {
            JOptionPane.showMessageDialog(null, "Jardim Pequeno");

        } else {
            JOptionPane.showMessageDialog(null, "Jardim Grande");
        }

        int totalServicos = 0;
        double valorTotal = 0.0;

        
        String cont = null;
        do {
            int op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Qual a opção de Serviço você quer?: \n1-Manutenção Regular \n2-Paisagismo \n3-Irrigação Automática"));

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
                    totalServicos++;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida! Tente novamente.");
                    continue; 
            }

            
            cont = JOptionPane.showInputDialog("Deseja escolher outro serviço? \nS-Sim ou N-Não");
        } while (cont.equalsIgnoreCase("S"));

       
        double desconto = 0.0;
        if (totalServicos == 1) {
            desconto = valorTotal * 0.05; // 5% de desconto
        } else if (totalServicos == 2) {
            desconto = valorTotal * 0.10; // 10% de desconto
        } else if (totalServicos >= 3) {
            desconto = valorTotal * 0.15; // 15% de desconto
        }

        double valorComDesconto = valorTotal - desconto;


        JOptionPane.showMessageDialog(null,
                "Total de serviços escolhidos: " + totalServicos + "\nValor Total: R$ " + valorTotal +
                        "\nDesconto: R$ " + desconto + "\nValor com Desconto: R$ " + valorComDesconto);

        JOptionPane.showMessageDialog(null, "Encerrando Sistema");
    }
}
