import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorteado;
        int escolhaComputador;
        int escolhaJogador;

        int vitoriasJogador = 0;
        int vitoriasComputador = 0;
        int empates = 0;

        String resultado;
        char resposta;

        do {      
                     
        numeroSorteado = random.nextInt(1,90);
 
        if (numeroSorteado >= 61)
            escolhaComputador = 3;
        else if (numeroSorteado >= 31) 
            escolhaComputador = 2;
        else 
            escolhaComputador = 1; 

        System.out.println("Jogo Pedra/Papel/Tesoura: ");
        System.out.println("\n1 - papel ");
        System.out.println("2 - pedra ");
        System.out.println("3 - tesoura ");
        System.out.print("\nDigite uma das opções: ");

        escolhaJogador = teclado.nextInt();
        teclado.nextLine();

        if (escolhaComputador == 1 && escolhaJogador == 2){ 
            resultado = "Computador ganhou";
            vitoriasComputador++;
        }else if (escolhaComputador == 2 && escolhaJogador == 1){
            resultado = "Você ganhou";
            vitoriasJogador++;
        }else if (escolhaComputador == 3 && escolhaJogador == 2){ 
            resultado = "Você ganhou";
            vitoriasJogador++;
        }else if (escolhaComputador == 2 && escolhaJogador == 3){
            resultado = "Computador ganhou";
            vitoriasComputador++;
        }else if (escolhaComputador == 1 && escolhaJogador == 3){ 
            resultado = "Você ganhou";
            vitoriasJogador++;
        }else if (escolhaComputador == 3 && escolhaJogador == 1){
            resultado = "Computador ganhou";
            vitoriasComputador++;
        }else { 
            resultado = "Empate"; 
            empates++;     
        }

        System.out.println("\nComputador escolheu: " + devolveEscolha(escolhaComputador));
        System.out.println("Usuário escolheu: " + devolveEscolha(escolhaJogador));
        System.out.println("\n Placar atual: " + vitoriasJogador + " - " + vitoriasComputador + " Computador " + empates + " Empates");

        System.out.println("\nResultado: " + resultado);

        System.out.println("Deseja continuar [s/n]: ");
        resposta = teclado.nextLine().toLowerCase().charAt(0);  

        if (resposta != 's' && resposta != 'n') {
            System.out.println("Opção inválida. Por favor, insira 'S' para continuar ou 'N' para parar.");
        }

    } while(resposta == 's');   

        teclado.close();   
   
    }      
    static String devolveEscolha(int escolha){
        switch (escolha) {
            case 1:
                return "papel";
            case 2:
                return "pedra";
            default:
                return "tesoura";
        }
    }            
}