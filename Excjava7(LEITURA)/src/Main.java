import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int X;
        

        System.out.println("Negativo ou Positivo? :D");
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nDigite um número:  ");
        X = sc.nextInt();
        
        if (X >= 1) {	
        	System.out.printf("o número %d é positivo!", X);	
        } 

        else if (X <= -1) {
        	System.out.printf("o número %d é negativo!", X);
        } 
        
        else {
        	System.out.printf("o número %d é nulo!", X);
        }
        
        	sc.close();
        	
        }
        
    }