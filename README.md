#  Sistema de Serviços para Jardins – Projeto Java

Este repositório apresenta um sistema em Java para cadastro e gerenciamento de serviços prestados a jardins. O projeto está dividido em branches por níveis de complexidade, do mais simples ao mais avançado. Abaixo estão descritos os níveis até o **Nível 4**, com explicações detalhadas de cada passo implementado.

---

##  Estrutura por Branch (até o Nível 4)

---

###  `logica-aula7-ex1` – Nível 1: Entrada e Saída

#### 1. Exibição de Boas-Vindas
- Mensagem com `JOptionPane.showMessageDialog` dando as boas-vindas ao usuário:
  ```java
  JOptionPane.showMessageDialog(null, "Óla jardim!");
  ```

#### 2. Entrada de Dados Básicos
- O sistema solicita ao usuário:
  - Nome do jardim
  - Endereço
  - Largura (em metros)
  - Comprimento (em metros)
  
#### 3. Cálculo da Área do Jardim
- A área é calculada com:
  ```java
  double area = largura * comp;
  ```

#### 4. Exibição dos Dados Inseridos
- Após o cálculo, os dados são apresentados ao usuário via `JOptionPane`.

---

###  `logica-aula7-ex2` – Nível 2: Estrutura de Seleção

#### 1. Classificação do Jardim por Tamanho
- Jardins com área superior a 100 m² são classificados como **grandes**.
  ```java
  if (area > 100.0) {
      jardinsGrandes++;
  }
  ```

#### 2. Escolha do Tipo de Serviço
- O usuário escolhe serviços por meio de um menu com `switch/case`:
  - **1**: Manutenção Regular → R$100
  - **2**: Paisagismo → R$150
  - **3**: Irrigação Automática → R$200

#### 3. Acúmulo do Valor Total
- A cada serviço, o valor correspondente é somado ao total:
  ```java
  valorTotal += 100; // ou 150, ou 200 dependendo da opção
  ```

#### 4. Validação de Opções Inválidas
- Caso o usuário digite uma opção inválida, o sistema solicita nova entrada.

---

###  `logica-aula7-ex3` – Nível 3: Estrutura de Repetição

#### 1. Cadastro de Múltiplos Jardins
- Utiliza `do...while` para repetir o cadastro enquanto o usuário desejar:
  ```java
  do {
      // Cadastro
  } while (cont.equalsIgnoreCase("S"));
  ```

#### 2. Cadastro de Vários Serviços por Jardim
- Para cada jardim, o usuário pode cadastrar mais de um serviço:
  ```java
  do {
      // Escolha de serviço
  } while (escolhaServico.equalsIgnoreCase("S"));
  ```

#### 3. Cálculo da Média da Área
- A média é obtida dividindo a soma das áreas pelo número de jardins:
  ```java
  double mediaArea = totalArea / totalJardins;
  ```

#### 4. Contagem de Jardins Grandes
- Atualizado automaticamente dentro do laço de cadastro de jardins.

---

###  `logica-aula7-ex4` – Nível 4: Vetores Básicos

#### 1. Armazenamento das Áreas em Vetor
- Um vetor `areasJardim[]` guarda a área de cada jardim:
  ```java
  double[] areasJardim = new double[100];
  ```

#### 2. Cálculo da Moda
- Usa um `HashMap` para contar a frequência de cada área.
- Identifica o valor mais frequente (moda), e em caso de empate, lista todos:
  ```java
  Map<Double, Integer> frequencia = new HashMap<>();
  ```

#### 3. Exibição da Moda
- Resultado exibido com tratamento para moda única ou múltipla.
