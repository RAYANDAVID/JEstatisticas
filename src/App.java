public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Jardim jardim = new Jardim(5.0, 10.0);
        Servico servico = new Servico("Manutenção", 200.0);

        cliente.exibir();
        System.out.println("Área do jardim: " + jardim.CalcularArea() + " m²");
        System.out.println("Valor com desconto de 10%: R$ " + servico.aplicarDesconto(10));
    }
}
