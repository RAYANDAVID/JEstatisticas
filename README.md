
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

### Nível 7 – Relatórios e Gráficos
- Calculo de média, moda, mediana, máximo e mínimo.

---

## Tecnologias Utilizadas
- Java (versão 17)
- `JOptionPane` para interação com o usuário
- Estruturas de controle, vetores, `HashMap`, orientação a objetos, ordenação e busca
- `Visual Studio` como editor de código

---

## Objetivo 
Este projeto foi desenvolvido como prática de conceitos fundamentais de programação em Java, com foco na evolução gradativa da lógica de programação, uso de estruturas de dados e princípios de orientação a objetos.
