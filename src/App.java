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

        String entrada = JOptionPane.showInputDialog("Digite os valores para estatísticas (separados por vírgula):");
        String[] partes = entrada.split(",");
        double[] valores = new double[partes.length];

        for (int i = 0; i < partes.length; i++) {
            valores[i] = Double.parseDouble(partes[i].trim());
        }

        Estatisticas est = new Estatisticas(valores);

        
        Cliente cliente = new Cliente(nome, endereco);
        Jardim jardim = new Jardim(largura, comprimento);
        Servico servico = new Servico(tipoServico, valorServico);

        
        cliente.exibir();
        JOptionPane.showMessageDialog(null,"Nome: "+nome+ "\nEndereço: " +endereco+ "\nÁrea do jardim: " + jardim.CalcularArea() + " m²" +
                                                             "\nValor com desconto de " + percentualDesconto + "%: \nValor do Serviço R$ " + servico.aplicarDesconto(percentualDesconto));
    

    String resultado = String.format(
        "Estatísticas:\nMédia: %.2f\nMediana: %.2f\nModa: %.2f\nMáximo: %.2f\nMínimo: %.2f",
        est.calcularMedia(),
        est.calcularMediana(),
        est.calcularModa(),
        est.obterMaximo(),
        est.obterMinimo()
    );
    JOptionPane.showMessageDialog(null, resultado);
    }
}
