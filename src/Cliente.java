import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String endereco;

    public Cliente (String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void exibir(){
        JOptionPane.showMessageDialog(null,"Cliente: "+nome);
        JOptionPane.showMessageDialog(null,"Endereço: "+endereco);
    }

    public String getNome(){
        return nome;
    }

    public String getEndereco(){
        return endereco;
    }

}
