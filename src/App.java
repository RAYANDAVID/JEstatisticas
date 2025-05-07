import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Eercicio" + //
        
        "Faça como eu fiz\r\n" + //
        "\r\n" + //
        "Criar um jogo de lançar dados similar ao jogo do cara ou coroa.\r\n" + //
        "==============================================================\r\n" +//
        "Estudar, pesquisar e escolher um dos métodos estatísticos\r\n" + //
        "\r\n" + //
        "Bonus+\r\n" + //
        "\r\n" + //
        "-P.(A) - calculo simples\r\n" + //
        "-Teorema de Bayes. avançado");


        int[] total_lancamentos = {1,2,3,4,5,6};
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;
        String mensagem ="Quer lançar o dado?";
        //sorteio

        Random random = new Random();
                
        //loop de lançamento
        while (true) {  
            int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Lançando dado",JOptionPane.YES_NO_OPTION);
            if (opcao!= JOptionPane.YES_OPTION) {
                
                //estatísticas
                String estatisticas = "Jogo finalizado!" + "\nTotal de lançamentos: "+(cont1+cont2+cont3+cont4+cont5+cont6)+
                "\nLado 1: "+cont1+
                "\nLado 2: "+cont2+
                "\nLado 3: "+cont3+ 
                "\nLado 4: "+cont4+ 
                "\nLado 5: "+cont5+ 
                "\nLado 6: "+cont6;
                JOptionPane.showMessageDialog(null, estatisticas,"Finalizando Jogo", JOptionPane.INFORMATION_MESSAGE);
                
                break;
            }
            int resultado = random.nextInt(6);
            switch (resultado) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                 case 5:
                    cont5++;
                    break;
                case 6:
                    cont6++;
                    break;
            }
            String saida = "Resultado do lançamento: "+total_lancamentos[resultado];
            JOptionPane.showMessageDialog(null, saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
