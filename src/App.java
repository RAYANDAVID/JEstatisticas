import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //if 
        //if else
        //switch
        //ternário ? :

        int op= Integer.parseInt(JOptionPane.showInputDialog("Qual o resultado de uma população? \n1- Parâmetro \n2- Estatística"));
        if (op == 1) {
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        
        }else if(op == 2){
            JOptionPane.showMessageDialog(null,"Resposta errada", "JStatistics", JOptionPane.ERROR_MESSAGE);
        
        }else{
            JOptionPane.showMessageDialog(null, "Resposta invalida");
        }

        //Exercícios
        //Exercicios (para cada pergunta crie um if)

        // Considerando os números 30,50,80,90 Digite o valor da média aritmética simples?//
        //gabarito: 62,5

        /*double ari = Double.parseDouble(JOptionPane.showInputDialog("Considerando os números 30,50,80,90 Digite o valor da média aritmética simples? \n 1- 65,8 \n 2-65,2 \n 3- 62,5 \n4- 63,4 "));
        if (ari ==3) {
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        }else{
            JOptionPane.showMessageDialog(null,"Resposta errada", "JStatistics", JOptionPane.ERROR_MESSAGE);
        }

        // Considerando os valores 10,40,50,80,10.  Digite qual é a moda?
        //gabarito: 10

        int med= Integer.parseInt(JOptionPane.showInputDialog("Considerando os valores 10,40,50,80,10.  Digite qual é a moda? \n1- 10 \n2- 30 \n3- 50 \n4- 80"));
        if (med == 1) {
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        
        }else{
            JOptionPane.showMessageDialog(null,"Resposta errada", "JStatistics", JOptionPane.ERROR_MESSAGE);
        }


        //Qual a medida de tendência central que mostra o centro da amostra//
        //mediana

        int nome = Integer.parseInt(JOptionPane.showInputDialog("Qual a medida de tendência central que mostra o centro da amostra? \n1- Medida \n2- Media \n3- Mediana \n4- Nenhuma"));
        if (nome == 3) {
            JOptionPane.showMessageDialog(null,"Certa Resposta");

        } else {
            
            JOptionPane.showMessageDialog(null,"Resposta errada", "JStatistics", JOptionPane.ERROR_MESSAGE);
        }*/

        /* Considerando os números 30,50,80,90 Digite o valor da média aritmética simples?  */
        //gabarito: 62,5

        double media = Double.parseDouble(JOptionPane.showInputDialog("Considerando os números 30,50,80,90 \nDigite o valor da média aritmética simples?"));
        if (media ==62.5) {
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        }else{
            JOptionPane.showMessageDialog(null,"Resposta errada", "JStatistics", JOptionPane.ERROR_MESSAGE);
        }

        /* Considerando os valores 10,40,50,80,10.  Digite qual é a moda?*/
        //gabarito: 10

        int med= Integer.parseInt(JOptionPane.showInputDialog("Considerando os valores 10,40,50,80,10.  Digite qual é a moda?"));
        if (med == 10) {
            JOptionPane.showMessageDialog(null,"Certa Resposta");
        
        }else{
            JOptionPane.showMessageDialog(null,"Resposta errada", "JStatistics", JOptionPane.ERROR_MESSAGE);
        }


         /*Qual a medida de tendência central que mostra o centro da amostra*/
        //mediana

        String nome = JOptionPane.showInputDialog("Qual a medida de tendência central que mostra o centro da amostra");
        if (nome.equalsIgnoreCase ("mediana")) {
            JOptionPane.showMessageDialog(null,"Certa Resposta");

        } else {
            
            JOptionPane.showMessageDialog(null,"Resposta errada", "JStatistics", JOptionPane.ERROR_MESSAGE);
        }
    }
}
