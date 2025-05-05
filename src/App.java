import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula3- Switch e Loops");
        //O switch é uma estrutura de seleção múltipla
        //um if mais organizado
        //Escolha
            //Caso
        //Para resolver listas ou constantes.
            //Menu
                //opção1
                //opção2
        

        /*Como funciona os loops */
        //while -teste no inicio
        //for -while compacto
        //do while -teste no final
        /*
         * inicio = 1
         * condição <=5
         * incremento/decremento i=i+1
         */
        /*int contador = 1;
        while (contador<3) {
            JOptionPane.showMessageDialog(null,"Viva o Senai");
            contador = contador+1;
            int i = 1;
            while (i<=5) {
                System.out.println(i);
                i++;
            }
        }
        for(int cont=1;cont<=10;cont++){
            System.out.println(cont);
        }
        String sair;
        do{
            sair = JOptionPane.showInputDialog("Digite Sair: S ou N");

        }while (sair.equalsIgnoreCase("N")); {
            
        }*/



        /*
         * Ajustar os bugs lógicos do código menu estatístico
         * 
         * crie um loop (do while)
         * Para deixar o menu com opções do usuário escolher
         * uma nova opção ou sair
         * O usuário que vai decidir a hora de sair.
         */

         String cont;
         do{
        int op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n1-Estatísca Descritiva \n2-Probabilidade \n3-Modelos probabilísticos"));
            
                if(op != 4){
                    switch (op) {
                        case 1:
                            JOptionPane.showMessageDialog(null,"Estatísca Descritiva");
                            break;
            
                            case 2:
                            JOptionPane.showMessageDialog(null,"Probabilidade");
                            break;
            
                            case 3:
                            JOptionPane.showMessageDialog(null,"Modelos probabilísticos");
                            break;
                    
                        default:
                        JOptionPane.showMessageDialog(null,"Opção Inválida!");
                            break;
                    }    
                }else{
                    JOptionPane.showMessageDialog(null, "Encerrando Sistema");
                }
                
                cont = JOptionPane.showInputDialog("Deseja continuar? \nS-Sim ou N-Não");
            }while (cont.equalsIgnoreCase("S")); {
                
            }
    }
}


