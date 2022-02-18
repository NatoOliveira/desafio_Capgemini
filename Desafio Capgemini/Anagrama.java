package anagrama;
import java.util.ArrayList;
import java.util.Scanner;
public class Anagrama {

    
    public static void main(String[] args) {
        String palavra = "kkjjfai";
        ArrayList<String> anagramas = new ArrayList<String>();
    
        for(int i = 0; i <palavra.length(); i++) {
            for(int s = 1; s < palavra.length(); s++) {
                if(palavra.charAt(i) == palavra.charAt(s) && i !=s && i < s) {
                    if(palavra.charAt(i) == palavra.charAt(i+1)) {
                        String x = palavra.substring(i, i + 1);
                            anagramas.add(x);
                        } else {
                        String y = palavra.substring(i, s);
                        String z = palavra.substring(i + 1, s + 1);
                        String h = palavra.substring(i, i + 1);
                        anagramas.add(h);
                        anagramas.add(y);
                        anagramas.add(z);
                        }
                    }
                }
            }       
    
        System.out.println(anagramas); 
    }
    
}
