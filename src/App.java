import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("JStatístcs");
        //Aplicando Lógica de Programação (Aristoteles e George Boolean)
        Scanner leia = new Scanner(System.in);
        //Variável: é um espaço reservado na memoria do computador
        //Variável: serve para guardar valores
        //Variável: ela tem um tipo (texto, número, lógico...)
        /*
         * Ex-1: crie um algoritmo para o JStatitics que leia
         * a opção desejada:
         * "Qual o conjunto de dados utilizado: 1- populacional 2 - amostral"
         * o valor recebido deve ser inteiro.
         */
        /*int opcao; //declarei a variável
        System.out.println("\t # \t # \t JStatistics \t # \t # \t ");
        System.out.println("Qual o conjunto de dados utilizado: 1- populacional 2- amostral");
        opcao = leia.nextInt();
        System.out.println(opcao);*/


        int opcao;
        JOptionPane.showMessageDialog(null, "O jogo da Estastística: JStatistics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o jogo? \nEscolha a estrategia: \n1- Populacional  \n2- Amostral"));
        JOptionPane.showMessageDialog(null,"Você escolheu: "+ opcao, "JStatistics", JOptionPane.DEFAULT_OPTION);


        /*
         * Ex-2
         * Você deve criar um menu perguntando para o usuario:
         * Que tipo de variavel ele deseja cadastrar:
         * 1-Quantitativa
         * 2-Qualitativa
         * 
         * O menu deve ter as quebras de linha conforme o texto acima.
         * tudo deve ser feito em apenas um System.out.println()
         * Mostre a opção escolhida ( o número lido)
         */
        //int opcao1;

         /*System.out.println("----------------------JStatistic------------------------");
         System.out.println("Que tipo de variavel você deseja cadastrar: 1- Quantitativa ou 2- Qualitativa");
         opcao1 = leia.nextInt();
         if (opcao1 <= 1) {
            System.out.println("1-Quantitativa");
            
         } else {
            System.out.println("2-Qualitativa"); 
        }*/


         String opcaoVariavel = JOptionPane.showInputDialog(null, "Que tipo de variável ele deseja cadastrar:\n 1-Quantitativa \n 2-Qualitativa");
         int opVariavel = Integer.parseInt(opcaoVariavel);
         JOptionPane.showMessageDialog(null, "Sua escolha foi: "+ opcaoVariavel, "JStatistics", JOptionPane.INFORMATION_MESSAGE);

    }
}
