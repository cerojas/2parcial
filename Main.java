package pruebaJueguito;


import java.util.*;



public class Main {

		
	
        public static void main(String[] args)  throws Exception{

        	
        	Scanner lee = new Scanner(System.in);
        	
        	System.out.println("BIENVENIDO AL JUEGO DIVERTIDO\n");
        	
        	System.out.println("1. Fácil  (a deitos)");
        	System.out.println("2. Intermedio  (modesto)");
        	System.out.println("3. difícil  (chateador)");
        	System.out.println("4. Imposible  (pa lo que se la dan)");
        	System.out.print("Opcion: ");
        	String entrada = lee.next();
        	
        
        	switch(Integer.parseInt(entrada))
        	{
        		case 1: Control.velocidad= 400; break;
        		case 2: Control.velocidad =200 ; break;
        		case 3: Control.velocidad =100 ; break;
        		case 4: Control.velocidad =50 ; break;
        	}
        	
        	
        	
        Thread f = new Flujo();
        f.start();
        f.setPriority(10);
        
        Thread control1 = new Control(); 
        control1.start();
       // control1.setPriority(10);
   
    	
        }

}
