package escada2;

import java.util.Scanner;
public class Escada2 {

    
    public static void main(String[] args) {
        int quanti;

    System.out.println("Digite a quantidade: ");
    Scanner scn = new Scanner(System.in);
    quanti = scn.nextInt();
    
    int i, j;
    for (i = 1; i <= quanti; i++) {
        for (j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
    
}
