package atividadeMiguel;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num, tabuada;
	    
	    System.out.println("Digite um número:");
	    num = sc.nextInt();
	    tabuada = 1;
	    
	    while(tabuada<11) {
	    	System.out.println(num*tabuada);
	    	tabuada = (tabuada+1);
	    }
	    
	    sc.close();
	    
	}

}
