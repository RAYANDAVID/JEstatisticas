import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Óla jardim!");
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Qual a largura do seus jardim (em metros): "));
        double comp = Double.parseDouble(JOptionPane.showInputDialog("Qual o comprimento(em metros): "));
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + "\nEndereço: " + endereco + "\nLargura: " + largura + "\nComprimento: " + comp);
        Double area = largura * comp;
        JOptionPane.showMessageDialog(null, "Área do jardim: " + area);
    }

}
