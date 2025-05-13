import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
       
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String endereco = JOptionPane.showInputDialog("Digite o endereço do cliente:");

       
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura do jardim (em metros):"));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do jardim (em metros):"));

        
        String tipoServico = JOptionPane.showInputDialog("Digite o tipo de serviço:");
        double valorServico = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do serviço (em R$):"));
        double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:"));

        
        Cliente cliente = new Cliente(nome, endereco);
        Jardim jardim = new Jardim(largura, comprimento);
        Servico servico = new Servico(tipoServico, valorServico);

        // Exibição das informações
        cliente.exibir();
        JOptionPane.showMessageDialog(null,"Nome: "+nome+ "\nEndereço: " +endereco+ "\nÁrea do jardim: " + jardim.CalcularArea() + " m²" +
                                                             "\nValor com desconto de " + percentualDesconto + "%: \nValor do Serviço R$ " + servico.aplicarDesconto(percentualDesconto));
    }
}
