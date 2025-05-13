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
   
Este projeto em Java tem como objetivo simular um sistema de cadastro e gerenciamento de serviços prestados a jardins residenciais. Ele foi desenvolvido de forma incremental, em diferentes níveis de complexidade, evoluindo desde operações básicas de entrada e saída até o uso de orientação a objetos, ordenação e busca de dados.

Cada etapa do projeto está organizada em branches, numeradas de `logica-aula7-ex1` até `logica-aula7-ex7`, representando os níveis de aprendizado e aplicação de estruturas da linguagem Java.

---

## Visão Geral por Nível

### Nível 1 – Entrada e Saída
- Mensagem de boas-vindas com `JOptionPane`.
- Entrada de dados do jardim (nome, endereço, largura e comprimento).
- Cálculo da área e exibição das informações.

### Nível 2 – Estrutura de Seleção
- Classificação do jardim como grande (área > 100 m²).
- Menu de seleção de serviços:
  - Manutenção Regular – R$100
  - Paisagismo – R$150
  - Irrigação Automática – R$200
- Validação de opções inválidas e cálculo do valor total dos serviços.

### Nível 3 – Estrutura de Repetição
- Cadastro de múltiplos jardins e serviços por jardim usando laços `do...while`.
- Cálculo da média das áreas e contagem de jardins grandes.

### Nível 4 – Vetores Básicos
- Armazenamento das áreas dos jardins em vetor.
- Cálculo da moda das áreas usando `HashMap` para contagem de frequência.

### Nível 5 – Vetores Compostos
- Uso de vetores paralelos para armazenar nome, área, tipo de serviço e valor de cada jardim.
- Geração de relatório completo com destaque para jardins grandes e soma total dos valores.

### Nível 6 – Vetor de Objetos
- Introdução à programação orientada a objetos com a classe `Jardim`.
- Armazenamento dos dados em vetor de objetos.
- Encapsulamento e organização dos dados via métodos e construtores.

### Nível 7 – Nível 7 - Relatórios e Gráficos
- Calculo de média, moda, mediana, máximo e mínimo.
---

## Objetivo 
Este projeto foi desenvolvido como prática de conceitos fundamentais de programação em Java, com foco na evolução gradativa da lógica de programação, uso de estruturas de dados e princípios de orientação a objetos.
