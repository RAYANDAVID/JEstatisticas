Sistema de Serviços para Jardins – Projeto Java

Este repositório apresenta um sistema em Java para cadastro e gerenciamento de serviços prestados a jardins. O projeto está dividido em branches por níveis de complexidade, do mais simples ao mais avançado. Abaixo estão descritos os níveis de implementação, do Nível 1 ao Nível 7, com suas respectivas funcionalidades.

### Estrutura por Branch

### logica-aula7-ex1 – Nível 1: Entrada e Saída
Funcionalidades:

    Mensagem de boas-vindas com JOptionPane.

    Entrada de dados básicos: nome, endereço, largura e comprimento do jardim.

    Cálculo da área: area = largura * comprimento.

    Exibição dos dados inseridos.

### logica-aula7-ex2 – Nível 2: Estrutura de Seleção
Funcionalidades:

    Classificação de jardim como grande se área > 100 m².

    Menu com escolha de tipo de serviço:

        1: Manutenção Regular – R$100

        2: Paisagismo – R$150

        3: Irrigação Automática – R$200

    Validação de opções inválidas.

    Acúmulo do valor total dos serviços.

### logica-aula7-ex3 – Nível 3: Estrutura de Repetição
Funcionalidades:

    Cadastro de múltiplos jardins com do...while.

    Cadastro de vários serviços por jardim.

    Cálculo da média da área dos jardins.

    Contagem de jardins grandes ao longo das iterações.

### logica-aula7-ex4 – Nível 4: Vetores Básicos
Funcionalidades:

    Armazenamento das áreas dos jardins em vetor.

    Cálculo da moda (área mais frequente) usando HashMap.

    Tratamento de moda única ou múltipla.

    Exibição do resultado final com as áreas mais comuns.

### logica-aula7-ex5 – Nível 5: Vetores Compostos
Funcionalidades:

    Armazenamento de dados dos jardins em vetores paralelos (nome, área, tipo de serviço, valor).

    Relatório detalhado de todos os jardins cadastrados.

    Exibição dos jardins classificados como grandes.

    Soma total do valor arrecadado com os serviços.

### logica-aula7-ex6 – Nível 6 - Funções e Procedimentos com OO
Funcionalidades:

    Criação de uma classe Jardim para representar os dados do jardim.

    Uso de vetor de objetos para armazenar múltiplos jardins.

    Organização dos dados orientada a objetos (encapsulamento, construtores).

    Geração de relatório com base nos objetos cadastrados.

### logica-aula7-ex7 – Nível 7 - Relatórios e Gráficos
Funcionalidades:

   Calculo de média, moda, mediana, máximo e mínimo.
   