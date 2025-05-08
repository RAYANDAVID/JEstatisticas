import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Classe é um conjunto de objetos
        //Nosso objetivo nesse código é entender a diferença
        //entre o método com o tipo void e método com o tipo String

        Mamifero m1 = new Mamifero();//objeto
        m1.setNomeCientifico("Bos Taurus");//atribuindo valor ao objeto
        Mamifero m2 = new Mamifero();
        m2.setNomeCientifico("Macropus");
        Mamifero m3 = new Mamifero();
        m3.setNomeCientifico("Lamantins");
        JOptionPane.showMessageDialog(null, "Nome Cientifico: "+m1.getNomeCientifico()+"\n"+m2.getNomeCientifico()+"\n"+m3.getNomeCientifico());//Mostra o resultado do valor atribuido ao objeto
        
    }

}
