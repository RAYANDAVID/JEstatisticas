Sistema de Serviços para Jardins
Este projeto em Java simula o cadastro de jardins, calcula suas áreas, permite a seleção de serviços e fornece estatísticas finais. Utiliza a biblioteca JOptionPane para interação com o usuário e aplica conceitos de entrada/saída, estruturas de controle, vetores, estatísticas e desconto por fidelidade.

Estrutura do Projeto
#Nível 1 – Entrada e Saída
-Mensagem de Boas-Vindas

JOptionPane.showMessageDialog(null, "Óla jardim!");

Exibe uma saudação ao usuário ao iniciar o sistema.

-Cadastro de Cliente

Recebe nomeJardim e endereço via JOptionPane.showInputDialog.

-Cálculo da Área

Recebe largura e comprimento, calcula área = largura \* comprimento.

#Nível 2 – Estrutura de Seleção
-Classificação do Jardim

Jardins com área > 100 m² são considerados grandes.

Contador jardinsGrandes é incrementado conforme necessário.

Escolha do Tipo de Serviço (switch/case)

1: Manutenção Regular (R$100)

2: Paisagismo (R$150)

3: Irrigação Automática (R$200)

Serviços são somados ao total (valorTotal e totalServicos).

-Desconto por Fidelidade

Aplicado com base no número total de serviços:

1 serviço → 5%

2 serviços → 10%

3 ou mais → 15%

#Nível 3 – Estrutura de Repetição
Cadastro de Múltiplos Serviços

Laço do...while permite adicionar mais de um serviço por jardim.

Média da Área

mediaArea = totalArea / totalJardins.

Contagem de Jardins Grandes

Verificado dentro do cadastro de jardins com if (area > 100.0).

#Nível 4 – Vetores Básicos
Armazenamento das Áreas

Vetor areasJardim[100] guarda as áreas de cada jardim.

-Cálculo da Moda

Um Map<Double, Integer> conta as ocorrências de cada área.

A moda é o valor mais frequente.

Pode haver empate (mais de uma moda).
