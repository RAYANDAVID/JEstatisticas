import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
       
        //Cara ou coroa
        //50% cara
        //50% coroa
        //Variável que receba a interação do jogo
        //Random
        //Switch
        //for, do while e Whilhe 

        String[] espacoAmostral = {"Cara","Coroa"};

        //sorteio
        Random random = new Random();

        //contadores para verificar a distribuição
        int contCara = 0;
        int contCoroa = 0;
        String mensagem ="Espaço amostral: {Cara, Coroa}\n"+
                        "Probabilidade de Cara: 50%\n"+ 
                        "Probabilidade de Coroa: 50%\n"+ 
                        "Deseja lançar a moeda?";             
        //loop de lançamento
        while (true) {
            //interação com usuário
            int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Lançando moedas",JOptionPane.YES_NO_OPTION);
            if (opcao!= JOptionPane.YES_OPTION) {
                
                //estatísticas
                String estatisticas = "Jogo finalizado!\n"+ 
                "Total de lançamentos: "+(contCara+contCoroa)+"\n"+
                "Caras:"+contCara+"\n"+
                "Coroa:"+contCoroa+"\n";
                JOptionPane.showMessageDialog(null, estatisticas,"Finalizando Jogo", JOptionPane.INFORMATION_MESSAGE);
                
                break;
            }
            int resultado = random.nextInt(2);//0-cara 1-coroa
            if (resultado == 0) {
                contCara++;
            }else{
                contCoroa++;
            }
            String saida = "Resultado do lançamento: "+espacoAmostral[resultado]+"\n(Índice gerado: "+resultado+")";
            JOptionPane.showMessageDialog(null, saida, "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
