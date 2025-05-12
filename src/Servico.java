public class Servico {
    private String nome;
    private double preco;

    public Servico(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public double aplicarDesconto(double percental){
        return preco - (preco * percental / 100);
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }
}
