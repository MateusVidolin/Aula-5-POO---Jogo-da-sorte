import java.util.Random;
import java.util.Scanner;

public class IniciaJogo {
    
    public static void main(String[] args) {
        int [][] tabuleiro = new int[10][10];
        int numeroDaSorte1, numeroDaSorte2, qtdDeAcertosNDaSorte1=0, qtdDeAcertosNDaSorte2=0;
        Random numeroAleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero da sorte entre 0 - 100:");
        numeroDaSorte1 = sc.nextInt();
        System.out.println("Digite o segundo numero da sorte entre 0 - 100:");
        numeroDaSorte2 = sc.nextInt();
        System.out.println(" Tabuleiro ");
        for(int i=0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                tabuleiro[i][j] = numeroAleatorio.nextInt(101);
                if (tabuleiro[i][j] == numeroDaSorte1) {
                    System.out.printf("[[" + tabuleiro[i][j] + "]] ");
                    qtdDeAcertosNDaSorte1++;
                }
                     else if (tabuleiro[i][j] == numeroDaSorte2){
                        System.out.printf("[[" + tabuleiro[i][j] + "]] ");
                        qtdDeAcertosNDaSorte2++;
                    }
                        else {
                            System.out.printf("[" + tabuleiro[i][j] + "] ");
                }
            }
            System.out.printf("\n");
        }
        if(qtdDeAcertosNDaSorte1 >= 3){
            System.out.println(" Parabens voce ganhou o valor de: R$" + qtdDeAcertosNDaSorte1 * 1000);
        }
        else if(qtdDeAcertosNDaSorte2>=3){
            System.out.println(" Parabens voce ganhou o valor de: R$" + qtdDeAcertosNDaSorte2 * 1000);
        }
        else{
            System.out.println(" Infelizmente voce nao ganhou nada");
        }

    }
}