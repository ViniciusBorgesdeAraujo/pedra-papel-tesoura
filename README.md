# Pedra, Papel e Tesoura

Este é um jogo de Pedra, Papel e Tesoura em Java, criado como exercício para prática de lógica de programação e manipulação de variáveis. O jogo foi desenvolvido como parte dos exercícios propostos pelo Professor Rogério na plataforma Mesttra.

## Objetivo do Projeto

Criar um jogo simples que simula a disputa entre o jogador e o computador usando as regras do clássico jogo Pedra, Papel e Tesoura. O objetivo é contar os pontos de cada jogador e determinar quem é o vencedor ao longo das rodadas.

## Funcionalidades

- **Jogar Pedra, Papel ou Tesoura:** O jogador escolhe uma das opções, enquanto o computador faz uma escolha aleatória.
- **Placar Atualizado:** Cada rodada registra o vencedor e atualiza o placar, mostrando o número de vitórias do jogador, vitórias do computador e empates.
- **Opção de Continuar:** O jogador pode escolher se deseja continuar jogando ou encerrar o jogo.
- **Mensagem de Resultado:** Após cada rodada, o resultado e o placar atual são exibidos.

## Como Jogar

1. Execute o programa.
2. Escolha entre Pedra (2), Papel (1) ou Tesoura (3) digitando o número correspondente e pressionando "Enter".
3. O computador também faz uma escolha e o vencedor da rodada é determinado de acordo com as regras do jogo:
   - Papel ganha de Pedra
   - Pedra ganha de Tesoura
   - Tesoura ganha de Papel
4. Após cada rodada, o placar é atualizado.
5. Digite "S" para continuar jogando ou "N" para encerrar o jogo.
6. Quando o jogo é encerrado, o placar final é exibido.

## Regras do Jogo

- **Papel (1) ganha de Pedra (2)**
- **Pedra (2) ganha de Tesoura (3)**
- **Tesoura (3) ganha de Papel (1)**
- Empates ocorrem quando jogador e computador escolhem a mesma opção.

## Estrutura do Código

- `numeroSorteado`: Gera um número aleatório para determinar a escolha do computador.
- `escolhaComputador` e `escolhaJogador`: Variáveis que armazenam as escolhas do computador e do jogador.
- `vitoriasJogador`, `vitoriasComputador`, `empates`: Variáveis que armazenam o placar ao longo do jogo.
- `devolveEscolha(int escolha)`: Método auxiliar para converter as escolhas de número para palavras ("papel", "pedra" ou "tesoura").

## Exemplo de Execução

```plaintext
Jogo Pedra/Papel/Tesoura:
1 - papel
2 - pedra
3 - tesoura
Digite uma das opções: 2

Computador escolheu: tesoura
Usuário escolheu: pedra

Resultado: Você ganhou
Placar atual: Você 1 - 0 Computador - 0 Empates
Deseja continuar [s/n]:
```

## Requisitos

- **Java 8** ou superior
- **IDE** ou terminal para execução do código

## Como Executar

1. Baixe ou clone este repositório
2. Abra o código em uma IDE (por exemplo, IntelliJ IDEA, Eclipse) ou no terminal
3. Compile o programa:
   ```shell
   javac App.java
   ```
4. Execute o programa:
   ```shell
   java App
   ```

