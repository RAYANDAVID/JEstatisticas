public class Jardim {
    private double largura;
    private double comprimento;

    public Jardim(double largura, double comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double CalcularArea(){
        return largura * comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public double getComprimento(){
        return comprimento;
    }
}
